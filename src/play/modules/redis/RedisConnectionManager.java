package play.modules.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.exceptions.JedisConnectionException;

/**
 * Redis connection manager for Play.
 * 
 * @author Tim Kral
 */
public class RedisConnectionManager {

	static JedisPool connectionPool;  // Single instance pool
    static ThreadLocal<Jedis> redisConnection = new ThreadLocal<Jedis>();

    public static boolean isSharded() {
    	return false;
    }
    
    public static Jedis getRawConnection() {
    	if (!isSharded()) {
    		return getRawConnectionInternal();
    	} else {
    		throw new JedisConnectionException("Cannot retrieve raw connection from sharded instance. Try getRawConnectionFromShard(key).");
    	}
    }
    
    static Jedis getRawConnectionInternal() {
		// Try to use a connection already leased in the request
		if (redisConnection.get() != null) {
			return redisConnection.get();
		}
	
		Jedis jedis = connectionPool.getResource();
		redisConnection.set(jedis);
		return jedis;
    }
    
    public static Jedis getRawConnectionFromShard(String key) {
    	if (!isSharded()) {
    		return getRawConnectionInternal();
    	} else {
			throw new JedisConnectionException("Cannot retrieve raw connection from sharded instance. Try getRawConnectionFromShard(key).");
    	}
    }
    
    public static Jedis getRawConnectionFromShard(byte[] key) {
    	if (!isSharded()) {
    		return getRawConnectionInternal();
    	} else {
			throw new JedisConnectionException("Cannot retrieve raw connection from sharded instance. Try getRawConnectionFromShard(key).");
    	}
    }

    /**
     * Close the last connection that was leased.
     */
    public static void closeConnection() {
        if (redisConnection.get() != null) {
        	connectionPool.returnResource(redisConnection.get());
        	redisConnection.remove();
        }
    }    
    /**
     * Destroy the connection pool.
     */
    public static void destroy() {
    	if (!isSharded()) {
    		connectionPool.destroy();
    	}
    }
}
