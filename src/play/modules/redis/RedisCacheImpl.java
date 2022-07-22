package play.modules.redis;

import play.Play;
import play.cache.CacheImpl;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.exceptions.JedisDataException;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Play cache implementation using Redis.
 *
 * @author Tim Kral
 */
public class RedisCacheImpl implements CacheImpl {

    private static final RedisCacheImpl uniqueInstance = new RedisCacheImpl();

    static JedisPool connectionPool;

    private RedisCacheImpl() {
    }

    public static RedisCacheImpl getInstance() {
        return uniqueInstance;
    }

    @Override
    public void add(String key, Object value, int expiration) {
        try (Jedis jedis = connectionPool.getResource()) {
            if (!exists(jedis, key)) {
                set(jedis, key, value, expiration);
            }
        }
    }

    @Override
    public boolean safeAdd(String key, Object value, int expiration) {
        try (Jedis jedis = connectionPool.getResource()) {
            set(jedis, key, value, expiration);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private boolean exists(Jedis jedis, String key) {
        return jedis.exists(key.getBytes());
    }

    @Override
    public void set(String key, Object value, int expiration) {
        try (Jedis jedis = connectionPool.getResource()) {
            set(jedis, key, value, expiration);
        }
    }

    private void set(Jedis jedis, String key, Object value, int expiration) {
        jedis.setex(key.getBytes(), expiration, toByteArray(value));
    }

    private void set(Jedis jedis, String key, Object value) {
        jedis.set(key.getBytes(), toByteArray(value));
    }

    private static byte[] toByteArray(Object o) {
        ObjectOutputStream out = null;
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            out = new ObjectOutputStream(bos);
            out.writeObject(o);

            return bos.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (out != null) out.close();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    @Override
    public boolean safeSet(String key, Object value, int expiration) {
        try {
            set(key, value, expiration);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void replace(String key, Object value, int expiration) {
        try (Jedis jedis = connectionPool.getResource()) {
            if (exists(jedis, key)) {
                set(jedis, key, value, expiration);
            }
        }
    }

    @Override
    public boolean safeReplace(String key, Object value, int expiration) {
        try (Jedis jedis = connectionPool.getResource()) {
            if (exists(jedis, key)) {
                set(jedis, key, value, expiration);
                return true;
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Object get(String key) {
        try (Jedis jedis = connectionPool.getResource()) {
            return get(jedis, key);
        }
    }

    private Object get(Jedis jedis, String key) {
        byte[] bytes = jedis.get(key.getBytes());
        if (bytes == null)
            return null;
        else
            return fromByteArray(bytes);
    }

    private static Object fromByteArray(byte[] bytes) {

        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new ByteArrayInputStream(bytes)) {
                @Override
                protected Class<?> resolveClass(ObjectStreamClass desc) throws IOException, ClassNotFoundException {
                    return Class.forName(desc.getName(), false, Play.classloader);
                }
            };
            return in.readObject();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (in != null) in.close();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    @Override
    public Map<String, Object> get(String[] keys) {
        Map<String, Object> result = new HashMap<String, Object>(keys.length);
        for (String key : keys) {
            result.put(key, get(key));
        }
        return result;
    }

    @Override
    public long incr(String key, int by) {
        try (Jedis jedis = connectionPool.getResource()) {
            Object cacheValue = get(jedis, key);
            long sum;
            if (cacheValue == null) {
                set(jedis, key, by);
                return by;
            } else if (cacheValue instanceof Integer) {
                Integer newCacheValueInteger = (Integer) cacheValue + by;
                set(jedis, key, newCacheValueInteger);
                return newCacheValueInteger.longValue();
            } else if (cacheValue instanceof Long) {
                Long newCacheValueLong = (Long) cacheValue + by;
                set(jedis, key, newCacheValueLong);
                return newCacheValueLong;
            } else {
                throw new JedisDataException("Cannot incr on non-integer value (key: " + key + ")");
            }
        }
    }

    @Override
    public long decr(String key, int by) {
        long difference;
        try (Jedis jedis = connectionPool.getResource()) {
            Object cacheValue = get(jedis,key);
            if (cacheValue == null) {
                set(jedis,key, -by);
                return -by;
            } else if (cacheValue instanceof Integer) {
                Integer newCacheValueInteger = (Integer) cacheValue - by;
                set(jedis,key, newCacheValueInteger);
                return newCacheValueInteger.longValue();
            } else if (cacheValue instanceof Long) {
                Long newCacheValueLong = (Long) cacheValue - by;
                set(jedis,key, newCacheValueLong);
                return newCacheValueLong;
            } else {
                throw new JedisDataException("Cannot decr on non-integer value (key: " + key + ")");
            }
        }
    }

    @Override
    public void clear() {
        try (Jedis jedis = connectionPool.getResource()) {
            jedis.flushDB();
        }
    }

    @Override
    public void delete(String key) {
        try (Jedis jedis = connectionPool.getResource()) {
            jedis.del(key.getBytes());
        }
    }

    @Override
    public boolean safeDelete(String key) {
        try {
            delete(key);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void stop() {
        try (Jedis jedis = connectionPool.getResource()) {
            if (Play.configuration.getProperty("redis.cache.flushallonstop", "true").equals("true")) {
                jedis.flushAll();
            }
        }
        connectionPool.close();
    }

    public String info() {
        try (Jedis jedis = connectionPool.getResource()) {
            return jedis.info();
        }
    }

    public Set<String> keys(String pattern) {
        try (Jedis jedis = connectionPool.getResource()) {
            return jedis.keys(pattern);
        }
    }
}