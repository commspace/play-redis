package play.modules.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.exceptions.JedisConnectionException;

/**
 * Redis connector for the Play framework.
 *
 * **DO NOT EDIT**.  This class was auto-generated.
 * See play.modules.redis.generator.RedisGenerator.
 *
 * @author Tim Kral
 **/
public class Redis {


    public static java.util.List aclCat() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.aclCat();
        } else {
            throw new JedisConnectionException("Cannot execute aclCat with sharded instance.");
        }
    }
    
    public static java.util.List aclCat(java.lang.String category) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.aclCat(category);
        } else {
            throw new JedisConnectionException("Cannot execute aclCat with sharded instance.");
        }
    }
    
    public static java.util.List aclCat(byte[] category) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.aclCat(category);
        } else {
            throw new JedisConnectionException("Cannot execute aclCat with sharded instance.");
        }
    }
    
    public static java.util.List aclCatBinary() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.aclCatBinary();
        } else {
            throw new JedisConnectionException("Cannot execute aclCatBinary with sharded instance.");
        }
    }
    
    public static long aclDelUser(byte[] name) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.aclDelUser(name);
        } else {
            throw new JedisConnectionException("Cannot execute aclDelUser with sharded instance.");
        }
    }
    
    public static long aclDelUser(java.lang.String name) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.aclDelUser(name);
        } else {
            throw new JedisConnectionException("Cannot execute aclDelUser with sharded instance.");
        }
    }
    
    public static long aclDelUser(byte[] name,byte[][] names) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.aclDelUser(name,names);
        } else {
            throw new JedisConnectionException("Cannot execute aclDelUser with sharded instance.");
        }
    }
    
    public static long aclDelUser(java.lang.String name,java.lang.String[] names) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.aclDelUser(name,names);
        } else {
            throw new JedisConnectionException("Cannot execute aclDelUser with sharded instance.");
        }
    }
    
    public static java.lang.String aclDryRun(java.lang.String username,redis.clients.jedis.CommandArguments commandArgs) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.aclDryRun(username,commandArgs);
        } else {
            throw new JedisConnectionException("Cannot execute aclDryRun with sharded instance.");
        }
    }
    
    public static java.lang.String aclDryRun(java.lang.String username,java.lang.String command,java.lang.String[] args) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.aclDryRun(username,command,args);
        } else {
            throw new JedisConnectionException("Cannot execute aclDryRun with sharded instance.");
        }
    }
    
    public static byte[] aclDryRunBinary(byte[] username,redis.clients.jedis.CommandArguments commandArgs) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.aclDryRunBinary(username,commandArgs);
        } else {
            throw new JedisConnectionException("Cannot execute aclDryRunBinary with sharded instance.");
        }
    }
    
    public static byte[] aclDryRunBinary(byte[] username,byte[] command,byte[][] args) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.aclDryRunBinary(username,command,args);
        } else {
            throw new JedisConnectionException("Cannot execute aclDryRunBinary with sharded instance.");
        }
    }
    
    public static java.lang.String aclGenPass() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.aclGenPass();
        } else {
            throw new JedisConnectionException("Cannot execute aclGenPass with sharded instance.");
        }
    }
    
    public static java.lang.String aclGenPass(int bits) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.aclGenPass(bits);
        } else {
            throw new JedisConnectionException("Cannot execute aclGenPass with sharded instance.");
        }
    }
    
    public static byte[] aclGenPassBinary() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.aclGenPassBinary();
        } else {
            throw new JedisConnectionException("Cannot execute aclGenPassBinary with sharded instance.");
        }
    }
    
    public static byte[] aclGenPassBinary(int bits) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.aclGenPassBinary(bits);
        } else {
            throw new JedisConnectionException("Cannot execute aclGenPassBinary with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.resps.AccessControlUser aclGetUser(byte[] name) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.aclGetUser(name);
        } else {
            throw new JedisConnectionException("Cannot execute aclGetUser with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.resps.AccessControlUser aclGetUser(java.lang.String name) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.aclGetUser(name);
        } else {
            throw new JedisConnectionException("Cannot execute aclGetUser with sharded instance.");
        }
    }
    
    public static java.util.List aclList() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.aclList();
        } else {
            throw new JedisConnectionException("Cannot execute aclList with sharded instance.");
        }
    }
    
    public static java.util.List aclListBinary() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.aclListBinary();
        } else {
            throw new JedisConnectionException("Cannot execute aclListBinary with sharded instance.");
        }
    }
    
    public static java.lang.String aclLoad() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.aclLoad();
        } else {
            throw new JedisConnectionException("Cannot execute aclLoad with sharded instance.");
        }
    }
    
    public static java.util.List aclLog() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.aclLog();
        } else {
            throw new JedisConnectionException("Cannot execute aclLog with sharded instance.");
        }
    }
    
    public static java.util.List aclLog(int limit) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.aclLog(limit);
        } else {
            throw new JedisConnectionException("Cannot execute aclLog with sharded instance.");
        }
    }
    
    public static java.util.List aclLogBinary() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.aclLogBinary();
        } else {
            throw new JedisConnectionException("Cannot execute aclLogBinary with sharded instance.");
        }
    }
    
    public static java.util.List aclLogBinary(int limit) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.aclLogBinary(limit);
        } else {
            throw new JedisConnectionException("Cannot execute aclLogBinary with sharded instance.");
        }
    }
    
    public static java.lang.String aclLogReset() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.aclLogReset();
        } else {
            throw new JedisConnectionException("Cannot execute aclLogReset with sharded instance.");
        }
    }
    
    public static java.lang.String aclSave() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.aclSave();
        } else {
            throw new JedisConnectionException("Cannot execute aclSave with sharded instance.");
        }
    }
    
    public static java.lang.String aclSetUser(byte[] name) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.aclSetUser(name);
        } else {
            throw new JedisConnectionException("Cannot execute aclSetUser with sharded instance.");
        }
    }
    
    public static java.lang.String aclSetUser(java.lang.String name) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.aclSetUser(name);
        } else {
            throw new JedisConnectionException("Cannot execute aclSetUser with sharded instance.");
        }
    }
    
    public static java.lang.String aclSetUser(byte[] name,byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.aclSetUser(name,keys);
        } else {
            throw new JedisConnectionException("Cannot execute aclSetUser with sharded instance.");
        }
    }
    
    public static java.lang.String aclSetUser(java.lang.String name,java.lang.String[] params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.aclSetUser(name,params);
        } else {
            throw new JedisConnectionException("Cannot execute aclSetUser with sharded instance.");
        }
    }
    
    public static java.util.List aclUsers() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.aclUsers();
        } else {
            throw new JedisConnectionException("Cannot execute aclUsers with sharded instance.");
        }
    }
    
    public static java.util.List aclUsersBinary() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.aclUsersBinary();
        } else {
            throw new JedisConnectionException("Cannot execute aclUsersBinary with sharded instance.");
        }
    }
    
    public static java.lang.String aclWhoAmI() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.aclWhoAmI();
        } else {
            throw new JedisConnectionException("Cannot execute aclWhoAmI with sharded instance.");
        }
    }
    
    public static byte[] aclWhoAmIBinary() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.aclWhoAmIBinary();
        } else {
            throw new JedisConnectionException("Cannot execute aclWhoAmIBinary with sharded instance.");
        }
    }
    
    public static long append(java.lang.String key,java.lang.String value) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.append(key,value);
        } else {
            throw new JedisConnectionException("Cannot execute append with sharded instance.");
        }
    }
    
    public static long append(byte[] key,byte[] value) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.append(key,value);
        } else {
            throw new JedisConnectionException("Cannot execute append with sharded instance.");
        }
    }
    
    public static java.lang.String asking() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.asking();
        } else {
            throw new JedisConnectionException("Cannot execute asking with sharded instance.");
        }
    }
    
    public static java.lang.String auth(java.lang.String password) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.auth(password);
        } else {
            throw new JedisConnectionException("Cannot execute auth with sharded instance.");
        }
    }
    
    public static java.lang.String auth(java.lang.String user,java.lang.String password) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.auth(user,password);
        } else {
            throw new JedisConnectionException("Cannot execute auth with sharded instance.");
        }
    }
    
    public static java.lang.String bgrewriteaof() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.bgrewriteaof();
        } else {
            throw new JedisConnectionException("Cannot execute bgrewriteaof with sharded instance.");
        }
    }
    
    public static java.lang.String bgsave() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.bgsave();
        } else {
            throw new JedisConnectionException("Cannot execute bgsave with sharded instance.");
        }
    }
    
    public static java.lang.String bgsaveSchedule() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.bgsaveSchedule();
        } else {
            throw new JedisConnectionException("Cannot execute bgsaveSchedule with sharded instance.");
        }
    }
    
    public static long bitcount(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.bitcount(key);
        } else {
            throw new JedisConnectionException("Cannot execute bitcount with sharded instance.");
        }
    }
    
    public static long bitcount(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.bitcount(key);
        } else {
            throw new JedisConnectionException("Cannot execute bitcount with sharded instance.");
        }
    }
    
    public static long bitcount(byte[] key,long start,long end) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.bitcount(key,start,end);
        } else {
            throw new JedisConnectionException("Cannot execute bitcount with sharded instance.");
        }
    }
    
    public static long bitcount(java.lang.String key,long start,long end) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.bitcount(key,start,end);
        } else {
            throw new JedisConnectionException("Cannot execute bitcount with sharded instance.");
        }
    }
    
    public static long bitcount(byte[] key,long start,long end,redis.clients.jedis.args.BitCountOption option) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.bitcount(key,start,end,option);
        } else {
            throw new JedisConnectionException("Cannot execute bitcount with sharded instance.");
        }
    }
    
    public static long bitcount(java.lang.String key,long start,long end,redis.clients.jedis.args.BitCountOption option) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.bitcount(key,start,end,option);
        } else {
            throw new JedisConnectionException("Cannot execute bitcount with sharded instance.");
        }
    }
    
    public static java.util.List bitfield(java.lang.String key,java.lang.String[] arguments) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.bitfield(key,arguments);
        } else {
            throw new JedisConnectionException("Cannot execute bitfield with sharded instance.");
        }
    }
    
    public static java.util.List bitfield(byte[] key,byte[][] arguments) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.bitfield(key,arguments);
        } else {
            throw new JedisConnectionException("Cannot execute bitfield with sharded instance.");
        }
    }
    
    public static java.util.List bitfieldReadonly(java.lang.String key,java.lang.String[] arguments) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.bitfieldReadonly(key,arguments);
        } else {
            throw new JedisConnectionException("Cannot execute bitfieldReadonly with sharded instance.");
        }
    }
    
    public static java.util.List bitfieldReadonly(byte[] key,byte[][] arguments) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.bitfieldReadonly(key,arguments);
        } else {
            throw new JedisConnectionException("Cannot execute bitfieldReadonly with sharded instance.");
        }
    }
    
    public static long bitop(redis.clients.jedis.args.BitOP op,java.lang.String destKey,java.lang.String[] srcKeys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.bitop(op,destKey,srcKeys);
        } else {
            throw new JedisConnectionException("Cannot execute bitop with sharded instance.");
        }
    }
    
    public static long bitop(redis.clients.jedis.args.BitOP op,byte[] destKey,byte[][] srcKeys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.bitop(op,destKey,srcKeys);
        } else {
            throw new JedisConnectionException("Cannot execute bitop with sharded instance.");
        }
    }
    
    public static long bitpos(java.lang.String key,boolean value) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.bitpos(key,value);
        } else {
            throw new JedisConnectionException("Cannot execute bitpos with sharded instance.");
        }
    }
    
    public static long bitpos(byte[] key,boolean value) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.bitpos(key,value);
        } else {
            throw new JedisConnectionException("Cannot execute bitpos with sharded instance.");
        }
    }
    
    public static long bitpos(java.lang.String key,boolean value,redis.clients.jedis.params.BitPosParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.bitpos(key,value,params);
        } else {
            throw new JedisConnectionException("Cannot execute bitpos with sharded instance.");
        }
    }
    
    public static long bitpos(byte[] key,boolean value,redis.clients.jedis.params.BitPosParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.bitpos(key,value,params);
        } else {
            throw new JedisConnectionException("Cannot execute bitpos with sharded instance.");
        }
    }
    
    public static byte[] blmove(byte[] srcKey,byte[] dstKey,redis.clients.jedis.args.ListDirection from,redis.clients.jedis.args.ListDirection to,double timeout) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.blmove(srcKey,dstKey,from,to,timeout);
        } else {
            throw new JedisConnectionException("Cannot execute blmove with sharded instance.");
        }
    }
    
    public static java.lang.String blmove(java.lang.String srcKey,java.lang.String dstKey,redis.clients.jedis.args.ListDirection from,redis.clients.jedis.args.ListDirection to,double timeout) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.blmove(srcKey,dstKey,from,to,timeout);
        } else {
            throw new JedisConnectionException("Cannot execute blmove with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.util.KeyValue blmpop(long timeout,redis.clients.jedis.args.ListDirection direction,java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.blmpop(timeout,direction,keys);
        } else {
            throw new JedisConnectionException("Cannot execute blmpop with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.util.KeyValue blmpop(long timeout,redis.clients.jedis.args.ListDirection direction,byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.blmpop(timeout,direction,keys);
        } else {
            throw new JedisConnectionException("Cannot execute blmpop with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.util.KeyValue blmpop(long timeout,redis.clients.jedis.args.ListDirection direction,int count,java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.blmpop(timeout,direction,count,keys);
        } else {
            throw new JedisConnectionException("Cannot execute blmpop with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.util.KeyValue blmpop(long timeout,redis.clients.jedis.args.ListDirection direction,int count,byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.blmpop(timeout,direction,count,keys);
        } else {
            throw new JedisConnectionException("Cannot execute blmpop with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.resps.KeyedListElement blpop(double timeout,java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.blpop(timeout,key);
        } else {
            throw new JedisConnectionException("Cannot execute blpop with sharded instance.");
        }
    }
    
    public static java.util.List blpop(double timeout,byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.blpop(timeout,keys);
        } else {
            throw new JedisConnectionException("Cannot execute blpop with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.resps.KeyedListElement blpop(double timeout,java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.blpop(timeout,keys);
        } else {
            throw new JedisConnectionException("Cannot execute blpop with sharded instance.");
        }
    }
    
    public static java.util.List blpop(int timeout,byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.blpop(timeout,keys);
        } else {
            throw new JedisConnectionException("Cannot execute blpop with sharded instance.");
        }
    }
    
    public static java.util.List blpop(int timeout,java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.blpop(timeout,key);
        } else {
            throw new JedisConnectionException("Cannot execute blpop with sharded instance.");
        }
    }
    
    public static java.util.List blpop(int timeout,java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.blpop(timeout,keys);
        } else {
            throw new JedisConnectionException("Cannot execute blpop with sharded instance.");
        }
    }
    
    public static java.util.List brpop(int timeout,java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.brpop(timeout,key);
        } else {
            throw new JedisConnectionException("Cannot execute brpop with sharded instance.");
        }
    }
    
    public static java.util.List brpop(int timeout,java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.brpop(timeout,keys);
        } else {
            throw new JedisConnectionException("Cannot execute brpop with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.resps.KeyedListElement brpop(double timeout,java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.brpop(timeout,keys);
        } else {
            throw new JedisConnectionException("Cannot execute brpop with sharded instance.");
        }
    }
    
    public static java.util.List brpop(int timeout,byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.brpop(timeout,keys);
        } else {
            throw new JedisConnectionException("Cannot execute brpop with sharded instance.");
        }
    }
    
    public static java.util.List brpop(double timeout,byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.brpop(timeout,keys);
        } else {
            throw new JedisConnectionException("Cannot execute brpop with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.resps.KeyedListElement brpop(double timeout,java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.brpop(timeout,key);
        } else {
            throw new JedisConnectionException("Cannot execute brpop with sharded instance.");
        }
    }
    
    public static byte[] brpoplpush(byte[] source,byte[] destination,int timeout) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.brpoplpush(source,destination,timeout);
        } else {
            throw new JedisConnectionException("Cannot execute brpoplpush with sharded instance.");
        }
    }
    
    public static java.lang.String brpoplpush(java.lang.String source,java.lang.String destination,int timeout) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.brpoplpush(source,destination,timeout);
        } else {
            throw new JedisConnectionException("Cannot execute brpoplpush with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.util.KeyValue bzmpop(long timeout,redis.clients.jedis.args.SortedSetOption option,java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.bzmpop(timeout,option,keys);
        } else {
            throw new JedisConnectionException("Cannot execute bzmpop with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.util.KeyValue bzmpop(long timeout,redis.clients.jedis.args.SortedSetOption option,byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.bzmpop(timeout,option,keys);
        } else {
            throw new JedisConnectionException("Cannot execute bzmpop with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.util.KeyValue bzmpop(long timeout,redis.clients.jedis.args.SortedSetOption option,int count,java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.bzmpop(timeout,option,count,keys);
        } else {
            throw new JedisConnectionException("Cannot execute bzmpop with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.util.KeyValue bzmpop(long timeout,redis.clients.jedis.args.SortedSetOption option,int count,byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.bzmpop(timeout,option,count,keys);
        } else {
            throw new JedisConnectionException("Cannot execute bzmpop with sharded instance.");
        }
    }
    
    public static java.util.List bzpopmax(double timeout,byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.bzpopmax(timeout,keys);
        } else {
            throw new JedisConnectionException("Cannot execute bzpopmax with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.resps.KeyedZSetElement bzpopmax(double timeout,java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.bzpopmax(timeout,keys);
        } else {
            throw new JedisConnectionException("Cannot execute bzpopmax with sharded instance.");
        }
    }
    
    public static java.util.List bzpopmin(double timeout,byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.bzpopmin(timeout,keys);
        } else {
            throw new JedisConnectionException("Cannot execute bzpopmin with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.resps.KeyedZSetElement bzpopmin(double timeout,java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.bzpopmin(timeout,keys);
        } else {
            throw new JedisConnectionException("Cannot execute bzpopmin with sharded instance.");
        }
    }
    
    public static java.lang.String clientGetname() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clientGetname();
        } else {
            throw new JedisConnectionException("Cannot execute clientGetname with sharded instance.");
        }
    }
    
    public static byte[] clientGetnameBinary() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clientGetnameBinary();
        } else {
            throw new JedisConnectionException("Cannot execute clientGetnameBinary with sharded instance.");
        }
    }
    
    public static long clientId() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clientId();
        } else {
            throw new JedisConnectionException("Cannot execute clientId with sharded instance.");
        }
    }
    
    public static java.lang.String clientInfo() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clientInfo();
        } else {
            throw new JedisConnectionException("Cannot execute clientInfo with sharded instance.");
        }
    }
    
    public static byte[] clientInfoBinary() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clientInfoBinary();
        } else {
            throw new JedisConnectionException("Cannot execute clientInfoBinary with sharded instance.");
        }
    }
    
    public static java.lang.String clientKill(byte[] ipPort) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clientKill(ipPort);
        } else {
            throw new JedisConnectionException("Cannot execute clientKill with sharded instance.");
        }
    }
    
    public static java.lang.String clientKill(java.lang.String ipPort) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clientKill(ipPort);
        } else {
            throw new JedisConnectionException("Cannot execute clientKill with sharded instance.");
        }
    }
    
    public static long clientKill(redis.clients.jedis.params.ClientKillParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clientKill(params);
        } else {
            throw new JedisConnectionException("Cannot execute clientKill with sharded instance.");
        }
    }
    
    public static java.lang.String clientKill(java.lang.String ip,int port) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clientKill(ip,port);
        } else {
            throw new JedisConnectionException("Cannot execute clientKill with sharded instance.");
        }
    }
    
    public static java.lang.String clientList() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clientList();
        } else {
            throw new JedisConnectionException("Cannot execute clientList with sharded instance.");
        }
    }
    
    public static java.lang.String clientList(long[] clientIds) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clientList(clientIds);
        } else {
            throw new JedisConnectionException("Cannot execute clientList with sharded instance.");
        }
    }
    
    public static java.lang.String clientList(redis.clients.jedis.args.ClientType type) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clientList(type);
        } else {
            throw new JedisConnectionException("Cannot execute clientList with sharded instance.");
        }
    }
    
    public static byte[] clientListBinary() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clientListBinary();
        } else {
            throw new JedisConnectionException("Cannot execute clientListBinary with sharded instance.");
        }
    }
    
    public static byte[] clientListBinary(redis.clients.jedis.args.ClientType type) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clientListBinary(type);
        } else {
            throw new JedisConnectionException("Cannot execute clientListBinary with sharded instance.");
        }
    }
    
    public static byte[] clientListBinary(long[] clientIds) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clientListBinary(clientIds);
        } else {
            throw new JedisConnectionException("Cannot execute clientListBinary with sharded instance.");
        }
    }
    
    public static java.lang.String clientNoEvictOff() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clientNoEvictOff();
        } else {
            throw new JedisConnectionException("Cannot execute clientNoEvictOff with sharded instance.");
        }
    }
    
    public static java.lang.String clientNoEvictOn() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clientNoEvictOn();
        } else {
            throw new JedisConnectionException("Cannot execute clientNoEvictOn with sharded instance.");
        }
    }
    
    public static java.lang.String clientPause(long timeout) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clientPause(timeout);
        } else {
            throw new JedisConnectionException("Cannot execute clientPause with sharded instance.");
        }
    }
    
    public static java.lang.String clientPause(long timeout,redis.clients.jedis.args.ClientPauseMode mode) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clientPause(timeout,mode);
        } else {
            throw new JedisConnectionException("Cannot execute clientPause with sharded instance.");
        }
    }
    
    public static java.lang.String clientSetname(java.lang.String name) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clientSetname(name);
        } else {
            throw new JedisConnectionException("Cannot execute clientSetname with sharded instance.");
        }
    }
    
    public static java.lang.String clientSetname(byte[] name) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clientSetname(name);
        } else {
            throw new JedisConnectionException("Cannot execute clientSetname with sharded instance.");
        }
    }
    
    public static long clientUnblock(long clientId) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clientUnblock(clientId);
        } else {
            throw new JedisConnectionException("Cannot execute clientUnblock with sharded instance.");
        }
    }
    
    public static long clientUnblock(long clientId,redis.clients.jedis.args.UnblockType unblockType) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clientUnblock(clientId,unblockType);
        } else {
            throw new JedisConnectionException("Cannot execute clientUnblock with sharded instance.");
        }
    }
    
    public static void close() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            jedis.close();
        } else {
            throw new JedisConnectionException("Cannot execute close with sharded instance.");
        }
    }
    
    public static java.lang.String clusterAddSlots(int[] slots) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clusterAddSlots(slots);
        } else {
            throw new JedisConnectionException("Cannot execute clusterAddSlots with sharded instance.");
        }
    }
    
    public static java.lang.String clusterAddSlotsRange(int[] ranges) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clusterAddSlotsRange(ranges);
        } else {
            throw new JedisConnectionException("Cannot execute clusterAddSlotsRange with sharded instance.");
        }
    }
    
    public static java.lang.String clusterBumpEpoch() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clusterBumpEpoch();
        } else {
            throw new JedisConnectionException("Cannot execute clusterBumpEpoch with sharded instance.");
        }
    }
    
    public static long clusterCountFailureReports(java.lang.String nodeId) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clusterCountFailureReports(nodeId);
        } else {
            throw new JedisConnectionException("Cannot execute clusterCountFailureReports with sharded instance.");
        }
    }
    
    public static long clusterCountKeysInSlot(int slot) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clusterCountKeysInSlot(slot);
        } else {
            throw new JedisConnectionException("Cannot execute clusterCountKeysInSlot with sharded instance.");
        }
    }
    
    public static java.lang.String clusterDelSlots(int[] slots) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clusterDelSlots(slots);
        } else {
            throw new JedisConnectionException("Cannot execute clusterDelSlots with sharded instance.");
        }
    }
    
    public static java.lang.String clusterDelSlotsRange(int[] ranges) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clusterDelSlotsRange(ranges);
        } else {
            throw new JedisConnectionException("Cannot execute clusterDelSlotsRange with sharded instance.");
        }
    }
    
    public static java.lang.String clusterFailover() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clusterFailover();
        } else {
            throw new JedisConnectionException("Cannot execute clusterFailover with sharded instance.");
        }
    }
    
    public static java.lang.String clusterFailover(redis.clients.jedis.args.ClusterFailoverOption failoverOption) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clusterFailover(failoverOption);
        } else {
            throw new JedisConnectionException("Cannot execute clusterFailover with sharded instance.");
        }
    }
    
    public static java.lang.String clusterFlushSlots() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clusterFlushSlots();
        } else {
            throw new JedisConnectionException("Cannot execute clusterFlushSlots with sharded instance.");
        }
    }
    
    public static java.lang.String clusterForget(java.lang.String nodeId) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clusterForget(nodeId);
        } else {
            throw new JedisConnectionException("Cannot execute clusterForget with sharded instance.");
        }
    }
    
    public static java.util.List clusterGetKeysInSlot(int slot,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clusterGetKeysInSlot(slot,count);
        } else {
            throw new JedisConnectionException("Cannot execute clusterGetKeysInSlot with sharded instance.");
        }
    }
    
    public static java.util.List clusterGetKeysInSlotBinary(int slot,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clusterGetKeysInSlotBinary(slot,count);
        } else {
            throw new JedisConnectionException("Cannot execute clusterGetKeysInSlotBinary with sharded instance.");
        }
    }
    
    public static java.lang.String clusterInfo() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clusterInfo();
        } else {
            throw new JedisConnectionException("Cannot execute clusterInfo with sharded instance.");
        }
    }
    
    public static long clusterKeySlot(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clusterKeySlot(key);
        } else {
            throw new JedisConnectionException("Cannot execute clusterKeySlot with sharded instance.");
        }
    }
    
    public static java.util.List clusterLinks() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clusterLinks();
        } else {
            throw new JedisConnectionException("Cannot execute clusterLinks with sharded instance.");
        }
    }
    
    public static java.lang.String clusterMeet(java.lang.String ip,int port) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clusterMeet(ip,port);
        } else {
            throw new JedisConnectionException("Cannot execute clusterMeet with sharded instance.");
        }
    }
    
    public static java.lang.String clusterMyId() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clusterMyId();
        } else {
            throw new JedisConnectionException("Cannot execute clusterMyId with sharded instance.");
        }
    }
    
    public static java.lang.String clusterNodes() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clusterNodes();
        } else {
            throw new JedisConnectionException("Cannot execute clusterNodes with sharded instance.");
        }
    }
    
    public static java.lang.String clusterReplicas(java.lang.String nodeId) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clusterReplicas(nodeId);
        } else {
            throw new JedisConnectionException("Cannot execute clusterReplicas with sharded instance.");
        }
    }
    
    public static java.lang.String clusterReplicate(java.lang.String nodeId) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clusterReplicate(nodeId);
        } else {
            throw new JedisConnectionException("Cannot execute clusterReplicate with sharded instance.");
        }
    }
    
    public static java.lang.String clusterReset() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clusterReset();
        } else {
            throw new JedisConnectionException("Cannot execute clusterReset with sharded instance.");
        }
    }
    
    public static java.lang.String clusterReset(redis.clients.jedis.args.ClusterResetType resetType) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clusterReset(resetType);
        } else {
            throw new JedisConnectionException("Cannot execute clusterReset with sharded instance.");
        }
    }
    
    public static java.lang.String clusterSaveConfig() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clusterSaveConfig();
        } else {
            throw new JedisConnectionException("Cannot execute clusterSaveConfig with sharded instance.");
        }
    }
    
    public static java.lang.String clusterSetConfigEpoch(long configEpoch) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clusterSetConfigEpoch(configEpoch);
        } else {
            throw new JedisConnectionException("Cannot execute clusterSetConfigEpoch with sharded instance.");
        }
    }
    
    public static java.lang.String clusterSetSlotImporting(int slot,java.lang.String nodeId) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clusterSetSlotImporting(slot,nodeId);
        } else {
            throw new JedisConnectionException("Cannot execute clusterSetSlotImporting with sharded instance.");
        }
    }
    
    public static java.lang.String clusterSetSlotMigrating(int slot,java.lang.String nodeId) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clusterSetSlotMigrating(slot,nodeId);
        } else {
            throw new JedisConnectionException("Cannot execute clusterSetSlotMigrating with sharded instance.");
        }
    }
    
    public static java.lang.String clusterSetSlotNode(int slot,java.lang.String nodeId) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clusterSetSlotNode(slot,nodeId);
        } else {
            throw new JedisConnectionException("Cannot execute clusterSetSlotNode with sharded instance.");
        }
    }
    
    public static java.lang.String clusterSetSlotStable(int slot) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clusterSetSlotStable(slot);
        } else {
            throw new JedisConnectionException("Cannot execute clusterSetSlotStable with sharded instance.");
        }
    }
    
    public static java.util.List clusterSlaves(java.lang.String nodeId) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clusterSlaves(nodeId);
        } else {
            throw new JedisConnectionException("Cannot execute clusterSlaves with sharded instance.");
        }
    }
    
    public static java.util.List clusterSlots() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clusterSlots();
        } else {
            throw new JedisConnectionException("Cannot execute clusterSlots with sharded instance.");
        }
    }
    
    public static long commandCount() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.commandCount();
        } else {
            throw new JedisConnectionException("Cannot execute commandCount with sharded instance.");
        }
    }
    
    public static java.util.Map commandDocs(java.lang.String[] commands) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.commandDocs(commands);
        } else {
            throw new JedisConnectionException("Cannot execute commandDocs with sharded instance.");
        }
    }
    
    public static java.util.List commandGetKeys(java.lang.String[] command) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.commandGetKeys(command);
        } else {
            throw new JedisConnectionException("Cannot execute commandGetKeys with sharded instance.");
        }
    }
    
    public static java.util.List commandGetKeysAndFlags(java.lang.String[] command) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.commandGetKeysAndFlags(command);
        } else {
            throw new JedisConnectionException("Cannot execute commandGetKeysAndFlags with sharded instance.");
        }
    }
    
    public static java.util.Map commandInfo(java.lang.String[] commands) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.commandInfo(commands);
        } else {
            throw new JedisConnectionException("Cannot execute commandInfo with sharded instance.");
        }
    }
    
    public static java.util.List commandList() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.commandList();
        } else {
            throw new JedisConnectionException("Cannot execute commandList with sharded instance.");
        }
    }
    
    public static java.util.List commandListFilterBy(redis.clients.jedis.params.CommandListFilterByParams filterByParams) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.commandListFilterBy(filterByParams);
        } else {
            throw new JedisConnectionException("Cannot execute commandListFilterBy with sharded instance.");
        }
    }
    
    public static java.util.List configGet(java.lang.String[] patterns) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.configGet(patterns);
        } else {
            throw new JedisConnectionException("Cannot execute configGet with sharded instance.");
        }
    }
    
    public static java.util.List configGet(byte[] pattern) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.configGet(pattern);
        } else {
            throw new JedisConnectionException("Cannot execute configGet with sharded instance.");
        }
    }
    
    public static java.util.List configGet(byte[][] patterns) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.configGet(patterns);
        } else {
            throw new JedisConnectionException("Cannot execute configGet with sharded instance.");
        }
    }
    
    public static java.util.List configGet(java.lang.String pattern) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.configGet(pattern);
        } else {
            throw new JedisConnectionException("Cannot execute configGet with sharded instance.");
        }
    }
    
    public static java.lang.String configResetStat() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.configResetStat();
        } else {
            throw new JedisConnectionException("Cannot execute configResetStat with sharded instance.");
        }
    }
    
    public static java.lang.String configRewrite() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.configRewrite();
        } else {
            throw new JedisConnectionException("Cannot execute configRewrite with sharded instance.");
        }
    }
    
    public static java.lang.String configSet(java.lang.String[] parameterValues) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.configSet(parameterValues);
        } else {
            throw new JedisConnectionException("Cannot execute configSet with sharded instance.");
        }
    }
    
    public static java.lang.String configSet(byte[][] parameterValues) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.configSet(parameterValues);
        } else {
            throw new JedisConnectionException("Cannot execute configSet with sharded instance.");
        }
    }
    
    public static java.lang.String configSet(java.lang.String parameter,java.lang.String value) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.configSet(parameter,value);
        } else {
            throw new JedisConnectionException("Cannot execute configSet with sharded instance.");
        }
    }
    
    public static java.lang.String configSet(byte[] parameter,byte[] value) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.configSet(parameter,value);
        } else {
            throw new JedisConnectionException("Cannot execute configSet with sharded instance.");
        }
    }
    
    public static void connect() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            jedis.connect();
        } else {
            throw new JedisConnectionException("Cannot execute connect with sharded instance.");
        }
    }
    
    public static boolean copy(java.lang.String srcKey,java.lang.String dstKey,boolean replace) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.copy(srcKey,dstKey,replace);
        } else {
            throw new JedisConnectionException("Cannot execute copy with sharded instance.");
        }
    }
    
    public static boolean copy(byte[] srcKey,byte[] dstKey,boolean replace) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.copy(srcKey,dstKey,replace);
        } else {
            throw new JedisConnectionException("Cannot execute copy with sharded instance.");
        }
    }
    
    public static boolean copy(byte[] srcKey,byte[] dstKey,int db,boolean replace) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.copy(srcKey,dstKey,db,replace);
        } else {
            throw new JedisConnectionException("Cannot execute copy with sharded instance.");
        }
    }
    
    public static boolean copy(java.lang.String srcKey,java.lang.String dstKey,int db,boolean replace) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.copy(srcKey,dstKey,db,replace);
        } else {
            throw new JedisConnectionException("Cannot execute copy with sharded instance.");
        }
    }
    
    public static long dbSize() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.dbSize();
        } else {
            throw new JedisConnectionException("Cannot execute dbSize with sharded instance.");
        }
    }
    
    public static long decr(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.decr(key);
        } else {
            throw new JedisConnectionException("Cannot execute decr with sharded instance.");
        }
    }
    
    public static long decr(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.decr(key);
        } else {
            throw new JedisConnectionException("Cannot execute decr with sharded instance.");
        }
    }
    
    public static long decrBy(byte[] key,long decrement) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.decrBy(key,decrement);
        } else {
            throw new JedisConnectionException("Cannot execute decrBy with sharded instance.");
        }
    }
    
    public static long decrBy(java.lang.String key,long decrement) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.decrBy(key,decrement);
        } else {
            throw new JedisConnectionException("Cannot execute decrBy with sharded instance.");
        }
    }
    
    public static long del(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.del(key);
        } else {
            throw new JedisConnectionException("Cannot execute del with sharded instance.");
        }
    }
    
    public static long del(java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.del(keys);
        } else {
            throw new JedisConnectionException("Cannot execute del with sharded instance.");
        }
    }
    
    public static long del(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.del(key);
        } else {
            throw new JedisConnectionException("Cannot execute del with sharded instance.");
        }
    }
    
    public static long del(byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.del(keys);
        } else {
            throw new JedisConnectionException("Cannot execute del with sharded instance.");
        }
    }
    
    public static byte[] dump(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.dump(key);
        } else {
            throw new JedisConnectionException("Cannot execute dump with sharded instance.");
        }
    }
    
    public static byte[] dump(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.dump(key);
        } else {
            throw new JedisConnectionException("Cannot execute dump with sharded instance.");
        }
    }
    
    public static java.lang.String echo(java.lang.String string) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.echo(string);
        } else {
            throw new JedisConnectionException("Cannot execute echo with sharded instance.");
        }
    }
    
    public static byte[] echo(byte[] string) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.echo(string);
        } else {
            throw new JedisConnectionException("Cannot execute echo with sharded instance.");
        }
    }
    
    public static java.lang.Object eval(java.lang.String script) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.eval(script);
        } else {
            throw new JedisConnectionException("Cannot execute eval with sharded instance.");
        }
    }
    
    public static java.lang.Object eval(byte[] script) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.eval(script);
        } else {
            throw new JedisConnectionException("Cannot execute eval with sharded instance.");
        }
    }
    
    public static java.lang.Object eval(java.lang.String script,int keyCount,java.lang.String[] params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.eval(script,keyCount,params);
        } else {
            throw new JedisConnectionException("Cannot execute eval with sharded instance.");
        }
    }
    
    public static java.lang.Object eval(byte[] script,int keyCount,byte[][] params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.eval(script,keyCount,params);
        } else {
            throw new JedisConnectionException("Cannot execute eval with sharded instance.");
        }
    }
    
    public static java.lang.Object eval(java.lang.String script,java.util.List keys,java.util.List args) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.eval(script,keys,args);
        } else {
            throw new JedisConnectionException("Cannot execute eval with sharded instance.");
        }
    }
    
    public static java.lang.Object eval(byte[] script,java.util.List keys,java.util.List args) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.eval(script,keys,args);
        } else {
            throw new JedisConnectionException("Cannot execute eval with sharded instance.");
        }
    }
    
    public static java.lang.Object evalReadonly(java.lang.String script,java.util.List keys,java.util.List args) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.evalReadonly(script,keys,args);
        } else {
            throw new JedisConnectionException("Cannot execute evalReadonly with sharded instance.");
        }
    }
    
    public static java.lang.Object evalReadonly(byte[] script,java.util.List keys,java.util.List args) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.evalReadonly(script,keys,args);
        } else {
            throw new JedisConnectionException("Cannot execute evalReadonly with sharded instance.");
        }
    }
    
    public static java.lang.Object evalsha(byte[] sha1) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.evalsha(sha1);
        } else {
            throw new JedisConnectionException("Cannot execute evalsha with sharded instance.");
        }
    }
    
    public static java.lang.Object evalsha(java.lang.String sha1) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.evalsha(sha1);
        } else {
            throw new JedisConnectionException("Cannot execute evalsha with sharded instance.");
        }
    }
    
    public static java.lang.Object evalsha(byte[] sha1,int keyCount,byte[][] params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.evalsha(sha1,keyCount,params);
        } else {
            throw new JedisConnectionException("Cannot execute evalsha with sharded instance.");
        }
    }
    
    public static java.lang.Object evalsha(byte[] sha1,java.util.List keys,java.util.List args) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.evalsha(sha1,keys,args);
        } else {
            throw new JedisConnectionException("Cannot execute evalsha with sharded instance.");
        }
    }
    
    public static java.lang.Object evalsha(java.lang.String sha1,java.util.List keys,java.util.List args) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.evalsha(sha1,keys,args);
        } else {
            throw new JedisConnectionException("Cannot execute evalsha with sharded instance.");
        }
    }
    
    public static java.lang.Object evalsha(java.lang.String sha1,int keyCount,java.lang.String[] params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.evalsha(sha1,keyCount,params);
        } else {
            throw new JedisConnectionException("Cannot execute evalsha with sharded instance.");
        }
    }
    
    public static java.lang.Object evalshaReadonly(java.lang.String sha1,java.util.List keys,java.util.List args) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.evalshaReadonly(sha1,keys,args);
        } else {
            throw new JedisConnectionException("Cannot execute evalshaReadonly with sharded instance.");
        }
    }
    
    public static java.lang.Object evalshaReadonly(byte[] sha1,java.util.List keys,java.util.List args) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.evalshaReadonly(sha1,keys,args);
        } else {
            throw new JedisConnectionException("Cannot execute evalshaReadonly with sharded instance.");
        }
    }
    
    public static long exists(java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.exists(keys);
        } else {
            throw new JedisConnectionException("Cannot execute exists with sharded instance.");
        }
    }
    
    public static long exists(byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.exists(keys);
        } else {
            throw new JedisConnectionException("Cannot execute exists with sharded instance.");
        }
    }
    
    public static boolean exists(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.exists(key);
        } else {
            throw new JedisConnectionException("Cannot execute exists with sharded instance.");
        }
    }
    
    public static boolean exists(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.exists(key);
        } else {
            throw new JedisConnectionException("Cannot execute exists with sharded instance.");
        }
    }
    
    public static long expire(byte[] key,long seconds) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.expire(key,seconds);
        } else {
            throw new JedisConnectionException("Cannot execute expire with sharded instance.");
        }
    }
    
    public static long expire(java.lang.String key,long seconds) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.expire(key,seconds);
        } else {
            throw new JedisConnectionException("Cannot execute expire with sharded instance.");
        }
    }
    
    public static long expire(byte[] key,long seconds,redis.clients.jedis.args.ExpiryOption expiryOption) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.expire(key,seconds,expiryOption);
        } else {
            throw new JedisConnectionException("Cannot execute expire with sharded instance.");
        }
    }
    
    public static long expire(java.lang.String key,long seconds,redis.clients.jedis.args.ExpiryOption expiryOption) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.expire(key,seconds,expiryOption);
        } else {
            throw new JedisConnectionException("Cannot execute expire with sharded instance.");
        }
    }
    
    public static long expireAt(java.lang.String key,long unixTime) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.expireAt(key,unixTime);
        } else {
            throw new JedisConnectionException("Cannot execute expireAt with sharded instance.");
        }
    }
    
    public static long expireAt(byte[] key,long unixTime) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.expireAt(key,unixTime);
        } else {
            throw new JedisConnectionException("Cannot execute expireAt with sharded instance.");
        }
    }
    
    public static long expireAt(java.lang.String key,long unixTime,redis.clients.jedis.args.ExpiryOption expiryOption) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.expireAt(key,unixTime,expiryOption);
        } else {
            throw new JedisConnectionException("Cannot execute expireAt with sharded instance.");
        }
    }
    
    public static long expireAt(byte[] key,long unixTime,redis.clients.jedis.args.ExpiryOption expiryOption) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.expireAt(key,unixTime,expiryOption);
        } else {
            throw new JedisConnectionException("Cannot execute expireAt with sharded instance.");
        }
    }
    
    public static long expireTime(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.expireTime(key);
        } else {
            throw new JedisConnectionException("Cannot execute expireTime with sharded instance.");
        }
    }
    
    public static long expireTime(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.expireTime(key);
        } else {
            throw new JedisConnectionException("Cannot execute expireTime with sharded instance.");
        }
    }
    
    public static java.lang.String failover() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.failover();
        } else {
            throw new JedisConnectionException("Cannot execute failover with sharded instance.");
        }
    }
    
    public static java.lang.String failover(redis.clients.jedis.params.FailoverParams failoverParams) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.failover(failoverParams);
        } else {
            throw new JedisConnectionException("Cannot execute failover with sharded instance.");
        }
    }
    
    public static java.lang.String failoverAbort() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.failoverAbort();
        } else {
            throw new JedisConnectionException("Cannot execute failoverAbort with sharded instance.");
        }
    }
    
    public static java.lang.Object fcall(java.lang.String name,java.util.List keys,java.util.List args) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.fcall(name,keys,args);
        } else {
            throw new JedisConnectionException("Cannot execute fcall with sharded instance.");
        }
    }
    
    public static java.lang.Object fcall(byte[] name,java.util.List keys,java.util.List args) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.fcall(name,keys,args);
        } else {
            throw new JedisConnectionException("Cannot execute fcall with sharded instance.");
        }
    }
    
    public static java.lang.Object fcallReadonly(java.lang.String name,java.util.List keys,java.util.List args) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.fcallReadonly(name,keys,args);
        } else {
            throw new JedisConnectionException("Cannot execute fcallReadonly with sharded instance.");
        }
    }
    
    public static java.lang.Object fcallReadonly(byte[] name,java.util.List keys,java.util.List args) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.fcallReadonly(name,keys,args);
        } else {
            throw new JedisConnectionException("Cannot execute fcallReadonly with sharded instance.");
        }
    }
    
    public static java.lang.String flushAll() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.flushAll();
        } else {
            throw new JedisConnectionException("Cannot execute flushAll with sharded instance.");
        }
    }
    
    public static java.lang.String flushAll(redis.clients.jedis.args.FlushMode flushMode) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.flushAll(flushMode);
        } else {
            throw new JedisConnectionException("Cannot execute flushAll with sharded instance.");
        }
    }
    
    public static java.lang.String flushDB() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.flushDB();
        } else {
            throw new JedisConnectionException("Cannot execute flushDB with sharded instance.");
        }
    }
    
    public static java.lang.String flushDB(redis.clients.jedis.args.FlushMode flushMode) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.flushDB(flushMode);
        } else {
            throw new JedisConnectionException("Cannot execute flushDB with sharded instance.");
        }
    }
    
    public static java.lang.String functionDelete(java.lang.String libraryName) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.functionDelete(libraryName);
        } else {
            throw new JedisConnectionException("Cannot execute functionDelete with sharded instance.");
        }
    }
    
    public static java.lang.String functionDelete(byte[] libraryName) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.functionDelete(libraryName);
        } else {
            throw new JedisConnectionException("Cannot execute functionDelete with sharded instance.");
        }
    }
    
    public static byte[] functionDump() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.functionDump();
        } else {
            throw new JedisConnectionException("Cannot execute functionDump with sharded instance.");
        }
    }
    
    public static java.lang.String functionFlush() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.functionFlush();
        } else {
            throw new JedisConnectionException("Cannot execute functionFlush with sharded instance.");
        }
    }
    
    public static java.lang.String functionFlush(redis.clients.jedis.args.FlushMode mode) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.functionFlush(mode);
        } else {
            throw new JedisConnectionException("Cannot execute functionFlush with sharded instance.");
        }
    }
    
    public static java.lang.String functionKill() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.functionKill();
        } else {
            throw new JedisConnectionException("Cannot execute functionKill with sharded instance.");
        }
    }
    
    public static java.util.List functionList() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.functionList();
        } else {
            throw new JedisConnectionException("Cannot execute functionList with sharded instance.");
        }
    }
    
    public static java.util.List functionList(byte[] libraryNamePattern) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.functionList(libraryNamePattern);
        } else {
            throw new JedisConnectionException("Cannot execute functionList with sharded instance.");
        }
    }
    
    public static java.util.List functionList(java.lang.String libraryNamePattern) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.functionList(libraryNamePattern);
        } else {
            throw new JedisConnectionException("Cannot execute functionList with sharded instance.");
        }
    }
    
    public static java.util.List functionListBinary() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.functionListBinary();
        } else {
            throw new JedisConnectionException("Cannot execute functionListBinary with sharded instance.");
        }
    }
    
    public static java.util.List functionListWithCode() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.functionListWithCode();
        } else {
            throw new JedisConnectionException("Cannot execute functionListWithCode with sharded instance.");
        }
    }
    
    public static java.util.List functionListWithCode(byte[] libraryNamePattern) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.functionListWithCode(libraryNamePattern);
        } else {
            throw new JedisConnectionException("Cannot execute functionListWithCode with sharded instance.");
        }
    }
    
    public static java.util.List functionListWithCode(java.lang.String libraryNamePattern) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.functionListWithCode(libraryNamePattern);
        } else {
            throw new JedisConnectionException("Cannot execute functionListWithCode with sharded instance.");
        }
    }
    
    public static java.util.List functionListWithCodeBinary() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.functionListWithCodeBinary();
        } else {
            throw new JedisConnectionException("Cannot execute functionListWithCodeBinary with sharded instance.");
        }
    }
    
    public static java.lang.String functionLoad(byte[] functionCode) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.functionLoad(functionCode);
        } else {
            throw new JedisConnectionException("Cannot execute functionLoad with sharded instance.");
        }
    }
    
    public static java.lang.String functionLoad(java.lang.String functionCode) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.functionLoad(functionCode);
        } else {
            throw new JedisConnectionException("Cannot execute functionLoad with sharded instance.");
        }
    }
    
    public static java.lang.String functionLoadReplace(java.lang.String functionCode) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.functionLoadReplace(functionCode);
        } else {
            throw new JedisConnectionException("Cannot execute functionLoadReplace with sharded instance.");
        }
    }
    
    public static java.lang.String functionLoadReplace(byte[] functionCode) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.functionLoadReplace(functionCode);
        } else {
            throw new JedisConnectionException("Cannot execute functionLoadReplace with sharded instance.");
        }
    }
    
    public static java.lang.String functionRestore(byte[] serializedValue) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.functionRestore(serializedValue);
        } else {
            throw new JedisConnectionException("Cannot execute functionRestore with sharded instance.");
        }
    }
    
    public static java.lang.String functionRestore(byte[] serializedValue,redis.clients.jedis.args.FunctionRestorePolicy policy) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.functionRestore(serializedValue,policy);
        } else {
            throw new JedisConnectionException("Cannot execute functionRestore with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.resps.FunctionStats functionStats() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.functionStats();
        } else {
            throw new JedisConnectionException("Cannot execute functionStats with sharded instance.");
        }
    }
    
    public static java.lang.Object functionStatsBinary() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.functionStatsBinary();
        } else {
            throw new JedisConnectionException("Cannot execute functionStatsBinary with sharded instance.");
        }
    }
    
    public static long geoadd(byte[] key,java.util.Map memberCoordinateMap) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.geoadd(key,memberCoordinateMap);
        } else {
            throw new JedisConnectionException("Cannot execute geoadd with sharded instance.");
        }
    }
    
    public static long geoadd(java.lang.String key,java.util.Map memberCoordinateMap) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.geoadd(key,memberCoordinateMap);
        } else {
            throw new JedisConnectionException("Cannot execute geoadd with sharded instance.");
        }
    }
    
    public static long geoadd(byte[] key,redis.clients.jedis.params.GeoAddParams params,java.util.Map memberCoordinateMap) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.geoadd(key,params,memberCoordinateMap);
        } else {
            throw new JedisConnectionException("Cannot execute geoadd with sharded instance.");
        }
    }
    
    public static long geoadd(java.lang.String key,redis.clients.jedis.params.GeoAddParams params,java.util.Map memberCoordinateMap) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.geoadd(key,params,memberCoordinateMap);
        } else {
            throw new JedisConnectionException("Cannot execute geoadd with sharded instance.");
        }
    }
    
    public static long geoadd(java.lang.String key,double longitude,double latitude,java.lang.String member) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.geoadd(key,longitude,latitude,member);
        } else {
            throw new JedisConnectionException("Cannot execute geoadd with sharded instance.");
        }
    }
    
    public static long geoadd(byte[] key,double longitude,double latitude,byte[] member) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.geoadd(key,longitude,latitude,member);
        } else {
            throw new JedisConnectionException("Cannot execute geoadd with sharded instance.");
        }
    }
    
    public static java.lang.Double geodist(java.lang.String key,java.lang.String member1,java.lang.String member2) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.geodist(key,member1,member2);
        } else {
            throw new JedisConnectionException("Cannot execute geodist with sharded instance.");
        }
    }
    
    public static java.lang.Double geodist(byte[] key,byte[] member1,byte[] member2) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.geodist(key,member1,member2);
        } else {
            throw new JedisConnectionException("Cannot execute geodist with sharded instance.");
        }
    }
    
    public static java.lang.Double geodist(java.lang.String key,java.lang.String member1,java.lang.String member2,redis.clients.jedis.args.GeoUnit unit) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.geodist(key,member1,member2,unit);
        } else {
            throw new JedisConnectionException("Cannot execute geodist with sharded instance.");
        }
    }
    
    public static java.lang.Double geodist(byte[] key,byte[] member1,byte[] member2,redis.clients.jedis.args.GeoUnit unit) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.geodist(key,member1,member2,unit);
        } else {
            throw new JedisConnectionException("Cannot execute geodist with sharded instance.");
        }
    }
    
    public static java.util.List geohash(byte[] key,byte[][] members) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.geohash(key,members);
        } else {
            throw new JedisConnectionException("Cannot execute geohash with sharded instance.");
        }
    }
    
    public static java.util.List geohash(java.lang.String key,java.lang.String[] members) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.geohash(key,members);
        } else {
            throw new JedisConnectionException("Cannot execute geohash with sharded instance.");
        }
    }
    
    public static java.util.List geopos(java.lang.String key,java.lang.String[] members) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.geopos(key,members);
        } else {
            throw new JedisConnectionException("Cannot execute geopos with sharded instance.");
        }
    }
    
    public static java.util.List geopos(byte[] key,byte[][] members) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.geopos(key,members);
        } else {
            throw new JedisConnectionException("Cannot execute geopos with sharded instance.");
        }
    }
    
    public static java.util.List georadius(byte[] key,double longitude,double latitude,double radius,redis.clients.jedis.args.GeoUnit unit) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.georadius(key,longitude,latitude,radius,unit);
        } else {
            throw new JedisConnectionException("Cannot execute georadius with sharded instance.");
        }
    }
    
    public static java.util.List georadius(java.lang.String key,double longitude,double latitude,double radius,redis.clients.jedis.args.GeoUnit unit) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.georadius(key,longitude,latitude,radius,unit);
        } else {
            throw new JedisConnectionException("Cannot execute georadius with sharded instance.");
        }
    }
    
    public static java.util.List georadius(byte[] key,double longitude,double latitude,double radius,redis.clients.jedis.args.GeoUnit unit,redis.clients.jedis.params.GeoRadiusParam param) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.georadius(key,longitude,latitude,radius,unit,param);
        } else {
            throw new JedisConnectionException("Cannot execute georadius with sharded instance.");
        }
    }
    
    public static java.util.List georadius(java.lang.String key,double longitude,double latitude,double radius,redis.clients.jedis.args.GeoUnit unit,redis.clients.jedis.params.GeoRadiusParam param) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.georadius(key,longitude,latitude,radius,unit,param);
        } else {
            throw new JedisConnectionException("Cannot execute georadius with sharded instance.");
        }
    }
    
    public static java.util.List georadiusByMember(java.lang.String key,java.lang.String member,double radius,redis.clients.jedis.args.GeoUnit unit) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.georadiusByMember(key,member,radius,unit);
        } else {
            throw new JedisConnectionException("Cannot execute georadiusByMember with sharded instance.");
        }
    }
    
    public static java.util.List georadiusByMember(byte[] key,byte[] member,double radius,redis.clients.jedis.args.GeoUnit unit) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.georadiusByMember(key,member,radius,unit);
        } else {
            throw new JedisConnectionException("Cannot execute georadiusByMember with sharded instance.");
        }
    }
    
    public static java.util.List georadiusByMember(byte[] key,byte[] member,double radius,redis.clients.jedis.args.GeoUnit unit,redis.clients.jedis.params.GeoRadiusParam param) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.georadiusByMember(key,member,radius,unit,param);
        } else {
            throw new JedisConnectionException("Cannot execute georadiusByMember with sharded instance.");
        }
    }
    
    public static java.util.List georadiusByMember(java.lang.String key,java.lang.String member,double radius,redis.clients.jedis.args.GeoUnit unit,redis.clients.jedis.params.GeoRadiusParam param) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.georadiusByMember(key,member,radius,unit,param);
        } else {
            throw new JedisConnectionException("Cannot execute georadiusByMember with sharded instance.");
        }
    }
    
    public static java.util.List georadiusByMemberReadonly(java.lang.String key,java.lang.String member,double radius,redis.clients.jedis.args.GeoUnit unit) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.georadiusByMemberReadonly(key,member,radius,unit);
        } else {
            throw new JedisConnectionException("Cannot execute georadiusByMemberReadonly with sharded instance.");
        }
    }
    
    public static java.util.List georadiusByMemberReadonly(byte[] key,byte[] member,double radius,redis.clients.jedis.args.GeoUnit unit) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.georadiusByMemberReadonly(key,member,radius,unit);
        } else {
            throw new JedisConnectionException("Cannot execute georadiusByMemberReadonly with sharded instance.");
        }
    }
    
    public static java.util.List georadiusByMemberReadonly(java.lang.String key,java.lang.String member,double radius,redis.clients.jedis.args.GeoUnit unit,redis.clients.jedis.params.GeoRadiusParam param) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.georadiusByMemberReadonly(key,member,radius,unit,param);
        } else {
            throw new JedisConnectionException("Cannot execute georadiusByMemberReadonly with sharded instance.");
        }
    }
    
    public static java.util.List georadiusByMemberReadonly(byte[] key,byte[] member,double radius,redis.clients.jedis.args.GeoUnit unit,redis.clients.jedis.params.GeoRadiusParam param) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.georadiusByMemberReadonly(key,member,radius,unit,param);
        } else {
            throw new JedisConnectionException("Cannot execute georadiusByMemberReadonly with sharded instance.");
        }
    }
    
    public static long georadiusByMemberStore(java.lang.String key,java.lang.String member,double radius,redis.clients.jedis.args.GeoUnit unit,redis.clients.jedis.params.GeoRadiusParam param,redis.clients.jedis.params.GeoRadiusStoreParam storeParam) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.georadiusByMemberStore(key,member,radius,unit,param,storeParam);
        } else {
            throw new JedisConnectionException("Cannot execute georadiusByMemberStore with sharded instance.");
        }
    }
    
    public static long georadiusByMemberStore(byte[] key,byte[] member,double radius,redis.clients.jedis.args.GeoUnit unit,redis.clients.jedis.params.GeoRadiusParam param,redis.clients.jedis.params.GeoRadiusStoreParam storeParam) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.georadiusByMemberStore(key,member,radius,unit,param,storeParam);
        } else {
            throw new JedisConnectionException("Cannot execute georadiusByMemberStore with sharded instance.");
        }
    }
    
    public static java.util.List georadiusReadonly(byte[] key,double longitude,double latitude,double radius,redis.clients.jedis.args.GeoUnit unit) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.georadiusReadonly(key,longitude,latitude,radius,unit);
        } else {
            throw new JedisConnectionException("Cannot execute georadiusReadonly with sharded instance.");
        }
    }
    
    public static java.util.List georadiusReadonly(java.lang.String key,double longitude,double latitude,double radius,redis.clients.jedis.args.GeoUnit unit) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.georadiusReadonly(key,longitude,latitude,radius,unit);
        } else {
            throw new JedisConnectionException("Cannot execute georadiusReadonly with sharded instance.");
        }
    }
    
    public static java.util.List georadiusReadonly(byte[] key,double longitude,double latitude,double radius,redis.clients.jedis.args.GeoUnit unit,redis.clients.jedis.params.GeoRadiusParam param) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.georadiusReadonly(key,longitude,latitude,radius,unit,param);
        } else {
            throw new JedisConnectionException("Cannot execute georadiusReadonly with sharded instance.");
        }
    }
    
    public static java.util.List georadiusReadonly(java.lang.String key,double longitude,double latitude,double radius,redis.clients.jedis.args.GeoUnit unit,redis.clients.jedis.params.GeoRadiusParam param) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.georadiusReadonly(key,longitude,latitude,radius,unit,param);
        } else {
            throw new JedisConnectionException("Cannot execute georadiusReadonly with sharded instance.");
        }
    }
    
    public static long georadiusStore(byte[] key,double longitude,double latitude,double radius,redis.clients.jedis.args.GeoUnit unit,redis.clients.jedis.params.GeoRadiusParam param,redis.clients.jedis.params.GeoRadiusStoreParam storeParam) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.georadiusStore(key,longitude,latitude,radius,unit,param,storeParam);
        } else {
            throw new JedisConnectionException("Cannot execute georadiusStore with sharded instance.");
        }
    }
    
    public static long georadiusStore(java.lang.String key,double longitude,double latitude,double radius,redis.clients.jedis.args.GeoUnit unit,redis.clients.jedis.params.GeoRadiusParam param,redis.clients.jedis.params.GeoRadiusStoreParam storeParam) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.georadiusStore(key,longitude,latitude,radius,unit,param,storeParam);
        } else {
            throw new JedisConnectionException("Cannot execute georadiusStore with sharded instance.");
        }
    }
    
    public static java.util.List geosearch(byte[] key,redis.clients.jedis.params.GeoSearchParam params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.geosearch(key,params);
        } else {
            throw new JedisConnectionException("Cannot execute geosearch with sharded instance.");
        }
    }
    
    public static java.util.List geosearch(java.lang.String key,redis.clients.jedis.params.GeoSearchParam params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.geosearch(key,params);
        } else {
            throw new JedisConnectionException("Cannot execute geosearch with sharded instance.");
        }
    }
    
    public static java.util.List geosearch(byte[] key,byte[] member,double radius,redis.clients.jedis.args.GeoUnit unit) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.geosearch(key,member,radius,unit);
        } else {
            throw new JedisConnectionException("Cannot execute geosearch with sharded instance.");
        }
    }
    
    public static java.util.List geosearch(java.lang.String key,java.lang.String member,double radius,redis.clients.jedis.args.GeoUnit unit) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.geosearch(key,member,radius,unit);
        } else {
            throw new JedisConnectionException("Cannot execute geosearch with sharded instance.");
        }
    }
    
    public static java.util.List geosearch(byte[] key,redis.clients.jedis.GeoCoordinate coord,double radius,redis.clients.jedis.args.GeoUnit unit) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.geosearch(key,coord,radius,unit);
        } else {
            throw new JedisConnectionException("Cannot execute geosearch with sharded instance.");
        }
    }
    
    public static java.util.List geosearch(java.lang.String key,redis.clients.jedis.GeoCoordinate coord,double radius,redis.clients.jedis.args.GeoUnit unit) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.geosearch(key,coord,radius,unit);
        } else {
            throw new JedisConnectionException("Cannot execute geosearch with sharded instance.");
        }
    }
    
    public static java.util.List geosearch(java.lang.String key,redis.clients.jedis.GeoCoordinate coord,double width,double height,redis.clients.jedis.args.GeoUnit unit) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.geosearch(key,coord,width,height,unit);
        } else {
            throw new JedisConnectionException("Cannot execute geosearch with sharded instance.");
        }
    }
    
    public static java.util.List geosearch(java.lang.String key,java.lang.String member,double width,double height,redis.clients.jedis.args.GeoUnit unit) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.geosearch(key,member,width,height,unit);
        } else {
            throw new JedisConnectionException("Cannot execute geosearch with sharded instance.");
        }
    }
    
    public static java.util.List geosearch(byte[] key,redis.clients.jedis.GeoCoordinate coord,double width,double height,redis.clients.jedis.args.GeoUnit unit) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.geosearch(key,coord,width,height,unit);
        } else {
            throw new JedisConnectionException("Cannot execute geosearch with sharded instance.");
        }
    }
    
    public static java.util.List geosearch(byte[] key,byte[] member,double width,double height,redis.clients.jedis.args.GeoUnit unit) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.geosearch(key,member,width,height,unit);
        } else {
            throw new JedisConnectionException("Cannot execute geosearch with sharded instance.");
        }
    }
    
    public static long geosearchStore(byte[] dest,byte[] src,redis.clients.jedis.params.GeoSearchParam params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.geosearchStore(dest,src,params);
        } else {
            throw new JedisConnectionException("Cannot execute geosearchStore with sharded instance.");
        }
    }
    
    public static long geosearchStore(java.lang.String dest,java.lang.String src,redis.clients.jedis.params.GeoSearchParam params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.geosearchStore(dest,src,params);
        } else {
            throw new JedisConnectionException("Cannot execute geosearchStore with sharded instance.");
        }
    }
    
    public static long geosearchStore(byte[] dest,byte[] src,redis.clients.jedis.GeoCoordinate coord,double radius,redis.clients.jedis.args.GeoUnit unit) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.geosearchStore(dest,src,coord,radius,unit);
        } else {
            throw new JedisConnectionException("Cannot execute geosearchStore with sharded instance.");
        }
    }
    
    public static long geosearchStore(java.lang.String dest,java.lang.String src,java.lang.String member,double radius,redis.clients.jedis.args.GeoUnit unit) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.geosearchStore(dest,src,member,radius,unit);
        } else {
            throw new JedisConnectionException("Cannot execute geosearchStore with sharded instance.");
        }
    }
    
    public static long geosearchStore(java.lang.String dest,java.lang.String src,redis.clients.jedis.GeoCoordinate coord,double radius,redis.clients.jedis.args.GeoUnit unit) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.geosearchStore(dest,src,coord,radius,unit);
        } else {
            throw new JedisConnectionException("Cannot execute geosearchStore with sharded instance.");
        }
    }
    
    public static long geosearchStore(byte[] dest,byte[] src,byte[] member,double radius,redis.clients.jedis.args.GeoUnit unit) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.geosearchStore(dest,src,member,radius,unit);
        } else {
            throw new JedisConnectionException("Cannot execute geosearchStore with sharded instance.");
        }
    }
    
    public static long geosearchStore(java.lang.String dest,java.lang.String src,redis.clients.jedis.GeoCoordinate coord,double width,double height,redis.clients.jedis.args.GeoUnit unit) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.geosearchStore(dest,src,coord,width,height,unit);
        } else {
            throw new JedisConnectionException("Cannot execute geosearchStore with sharded instance.");
        }
    }
    
    public static long geosearchStore(byte[] dest,byte[] src,redis.clients.jedis.GeoCoordinate coord,double width,double height,redis.clients.jedis.args.GeoUnit unit) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.geosearchStore(dest,src,coord,width,height,unit);
        } else {
            throw new JedisConnectionException("Cannot execute geosearchStore with sharded instance.");
        }
    }
    
    public static long geosearchStore(java.lang.String dest,java.lang.String src,java.lang.String member,double width,double height,redis.clients.jedis.args.GeoUnit unit) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.geosearchStore(dest,src,member,width,height,unit);
        } else {
            throw new JedisConnectionException("Cannot execute geosearchStore with sharded instance.");
        }
    }
    
    public static long geosearchStore(byte[] dest,byte[] src,byte[] member,double width,double height,redis.clients.jedis.args.GeoUnit unit) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.geosearchStore(dest,src,member,width,height,unit);
        } else {
            throw new JedisConnectionException("Cannot execute geosearchStore with sharded instance.");
        }
    }
    
    public static long geosearchStoreStoreDist(byte[] dest,byte[] src,redis.clients.jedis.params.GeoSearchParam params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.geosearchStoreStoreDist(dest,src,params);
        } else {
            throw new JedisConnectionException("Cannot execute geosearchStoreStoreDist with sharded instance.");
        }
    }
    
    public static long geosearchStoreStoreDist(java.lang.String dest,java.lang.String src,redis.clients.jedis.params.GeoSearchParam params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.geosearchStoreStoreDist(dest,src,params);
        } else {
            throw new JedisConnectionException("Cannot execute geosearchStoreStoreDist with sharded instance.");
        }
    }
    
    public static byte[] get(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.get(key);
        } else {
            throw new JedisConnectionException("Cannot execute get with sharded instance.");
        }
    }
    
    public static java.lang.String get(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.get(key);
        } else {
            throw new JedisConnectionException("Cannot execute get with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.Connection getClient() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.getClient();
        } else {
            throw new JedisConnectionException("Cannot execute getClient with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.Connection getConnection() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.getConnection();
        } else {
            throw new JedisConnectionException("Cannot execute getConnection with sharded instance.");
        }
    }
    
    public static int getDB() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.getDB();
        } else {
            throw new JedisConnectionException("Cannot execute getDB with sharded instance.");
        }
    }
    
    public static java.lang.String getDel(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.getDel(key);
        } else {
            throw new JedisConnectionException("Cannot execute getDel with sharded instance.");
        }
    }
    
    public static byte[] getDel(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.getDel(key);
        } else {
            throw new JedisConnectionException("Cannot execute getDel with sharded instance.");
        }
    }
    
    public static java.lang.String getEx(java.lang.String key,redis.clients.jedis.params.GetExParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.getEx(key,params);
        } else {
            throw new JedisConnectionException("Cannot execute getEx with sharded instance.");
        }
    }
    
    public static byte[] getEx(byte[] key,redis.clients.jedis.params.GetExParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.getEx(key,params);
        } else {
            throw new JedisConnectionException("Cannot execute getEx with sharded instance.");
        }
    }
    
    public static java.lang.String getSet(java.lang.String key,java.lang.String value) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.getSet(key,value);
        } else {
            throw new JedisConnectionException("Cannot execute getSet with sharded instance.");
        }
    }
    
    public static byte[] getSet(byte[] key,byte[] value) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.getSet(key,value);
        } else {
            throw new JedisConnectionException("Cannot execute getSet with sharded instance.");
        }
    }
    
    public static boolean getbit(byte[] key,long offset) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.getbit(key,offset);
        } else {
            throw new JedisConnectionException("Cannot execute getbit with sharded instance.");
        }
    }
    
    public static boolean getbit(java.lang.String key,long offset) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.getbit(key,offset);
        } else {
            throw new JedisConnectionException("Cannot execute getbit with sharded instance.");
        }
    }
    
    public static java.lang.String getrange(java.lang.String key,long startOffset,long endOffset) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.getrange(key,startOffset,endOffset);
        } else {
            throw new JedisConnectionException("Cannot execute getrange with sharded instance.");
        }
    }
    
    public static byte[] getrange(byte[] key,long startOffset,long endOffset) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.getrange(key,startOffset,endOffset);
        } else {
            throw new JedisConnectionException("Cannot execute getrange with sharded instance.");
        }
    }
    
    public static long hdel(java.lang.String key,java.lang.String[] fields) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hdel(key,fields);
        } else {
            throw new JedisConnectionException("Cannot execute hdel with sharded instance.");
        }
    }
    
    public static long hdel(byte[] key,byte[][] fields) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hdel(key,fields);
        } else {
            throw new JedisConnectionException("Cannot execute hdel with sharded instance.");
        }
    }
    
    public static boolean hexists(byte[] key,byte[] field) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hexists(key,field);
        } else {
            throw new JedisConnectionException("Cannot execute hexists with sharded instance.");
        }
    }
    
    public static boolean hexists(java.lang.String key,java.lang.String field) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hexists(key,field);
        } else {
            throw new JedisConnectionException("Cannot execute hexists with sharded instance.");
        }
    }
    
    public static java.lang.String hget(java.lang.String key,java.lang.String field) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hget(key,field);
        } else {
            throw new JedisConnectionException("Cannot execute hget with sharded instance.");
        }
    }
    
    public static byte[] hget(byte[] key,byte[] field) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hget(key,field);
        } else {
            throw new JedisConnectionException("Cannot execute hget with sharded instance.");
        }
    }
    
    public static java.util.Map hgetAll(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hgetAll(key);
        } else {
            throw new JedisConnectionException("Cannot execute hgetAll with sharded instance.");
        }
    }
    
    public static java.util.Map hgetAll(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hgetAll(key);
        } else {
            throw new JedisConnectionException("Cannot execute hgetAll with sharded instance.");
        }
    }
    
    public static long hincrBy(byte[] key,byte[] field,long value) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hincrBy(key,field,value);
        } else {
            throw new JedisConnectionException("Cannot execute hincrBy with sharded instance.");
        }
    }
    
    public static long hincrBy(java.lang.String key,java.lang.String field,long value) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hincrBy(key,field,value);
        } else {
            throw new JedisConnectionException("Cannot execute hincrBy with sharded instance.");
        }
    }
    
    public static double hincrByFloat(java.lang.String key,java.lang.String field,double value) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hincrByFloat(key,field,value);
        } else {
            throw new JedisConnectionException("Cannot execute hincrByFloat with sharded instance.");
        }
    }
    
    public static double hincrByFloat(byte[] key,byte[] field,double value) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hincrByFloat(key,field,value);
        } else {
            throw new JedisConnectionException("Cannot execute hincrByFloat with sharded instance.");
        }
    }
    
    public static java.util.Set hkeys(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hkeys(key);
        } else {
            throw new JedisConnectionException("Cannot execute hkeys with sharded instance.");
        }
    }
    
    public static java.util.Set hkeys(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hkeys(key);
        } else {
            throw new JedisConnectionException("Cannot execute hkeys with sharded instance.");
        }
    }
    
    public static long hlen(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hlen(key);
        } else {
            throw new JedisConnectionException("Cannot execute hlen with sharded instance.");
        }
    }
    
    public static long hlen(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hlen(key);
        } else {
            throw new JedisConnectionException("Cannot execute hlen with sharded instance.");
        }
    }
    
    public static java.util.List hmget(java.lang.String key,java.lang.String[] fields) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hmget(key,fields);
        } else {
            throw new JedisConnectionException("Cannot execute hmget with sharded instance.");
        }
    }
    
    public static java.util.List hmget(byte[] key,byte[][] fields) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hmget(key,fields);
        } else {
            throw new JedisConnectionException("Cannot execute hmget with sharded instance.");
        }
    }
    
    public static java.lang.String hmset(byte[] key,java.util.Map hash) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hmset(key,hash);
        } else {
            throw new JedisConnectionException("Cannot execute hmset with sharded instance.");
        }
    }
    
    public static java.lang.String hmset(java.lang.String key,java.util.Map hash) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hmset(key,hash);
        } else {
            throw new JedisConnectionException("Cannot execute hmset with sharded instance.");
        }
    }
    
    public static java.lang.String hrandfield(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hrandfield(key);
        } else {
            throw new JedisConnectionException("Cannot execute hrandfield with sharded instance.");
        }
    }
    
    public static byte[] hrandfield(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hrandfield(key);
        } else {
            throw new JedisConnectionException("Cannot execute hrandfield with sharded instance.");
        }
    }
    
    public static java.util.List hrandfield(java.lang.String key,long count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hrandfield(key,count);
        } else {
            throw new JedisConnectionException("Cannot execute hrandfield with sharded instance.");
        }
    }
    
    public static java.util.List hrandfield(byte[] key,long count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hrandfield(key,count);
        } else {
            throw new JedisConnectionException("Cannot execute hrandfield with sharded instance.");
        }
    }
    
    public static java.util.Map hrandfieldWithValues(java.lang.String key,long count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hrandfieldWithValues(key,count);
        } else {
            throw new JedisConnectionException("Cannot execute hrandfieldWithValues with sharded instance.");
        }
    }
    
    public static java.util.Map hrandfieldWithValues(byte[] key,long count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hrandfieldWithValues(key,count);
        } else {
            throw new JedisConnectionException("Cannot execute hrandfieldWithValues with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.resps.ScanResult hscan(java.lang.String key,java.lang.String cursor) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hscan(key,cursor);
        } else {
            throw new JedisConnectionException("Cannot execute hscan with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.resps.ScanResult hscan(byte[] key,byte[] cursor) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hscan(key,cursor);
        } else {
            throw new JedisConnectionException("Cannot execute hscan with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.resps.ScanResult hscan(byte[] key,byte[] cursor,redis.clients.jedis.params.ScanParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hscan(key,cursor,params);
        } else {
            throw new JedisConnectionException("Cannot execute hscan with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.resps.ScanResult hscan(java.lang.String key,java.lang.String cursor,redis.clients.jedis.params.ScanParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hscan(key,cursor,params);
        } else {
            throw new JedisConnectionException("Cannot execute hscan with sharded instance.");
        }
    }
    
    public static long hset(byte[] key,java.util.Map hash) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hset(key,hash);
        } else {
            throw new JedisConnectionException("Cannot execute hset with sharded instance.");
        }
    }
    
    public static long hset(java.lang.String key,java.util.Map hash) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hset(key,hash);
        } else {
            throw new JedisConnectionException("Cannot execute hset with sharded instance.");
        }
    }
    
    public static long hset(java.lang.String key,java.lang.String field,java.lang.String value) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hset(key,field,value);
        } else {
            throw new JedisConnectionException("Cannot execute hset with sharded instance.");
        }
    }
    
    public static long hset(byte[] key,byte[] field,byte[] value) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hset(key,field,value);
        } else {
            throw new JedisConnectionException("Cannot execute hset with sharded instance.");
        }
    }
    
    public static long hsetnx(byte[] key,byte[] field,byte[] value) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hsetnx(key,field,value);
        } else {
            throw new JedisConnectionException("Cannot execute hsetnx with sharded instance.");
        }
    }
    
    public static long hsetnx(java.lang.String key,java.lang.String field,java.lang.String value) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hsetnx(key,field,value);
        } else {
            throw new JedisConnectionException("Cannot execute hsetnx with sharded instance.");
        }
    }
    
    public static long hstrlen(byte[] key,byte[] field) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hstrlen(key,field);
        } else {
            throw new JedisConnectionException("Cannot execute hstrlen with sharded instance.");
        }
    }
    
    public static long hstrlen(java.lang.String key,java.lang.String field) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hstrlen(key,field);
        } else {
            throw new JedisConnectionException("Cannot execute hstrlen with sharded instance.");
        }
    }
    
    public static java.util.List hvals(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hvals(key);
        } else {
            throw new JedisConnectionException("Cannot execute hvals with sharded instance.");
        }
    }
    
    public static java.util.List hvals(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hvals(key);
        } else {
            throw new JedisConnectionException("Cannot execute hvals with sharded instance.");
        }
    }
    
    public static long incr(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.incr(key);
        } else {
            throw new JedisConnectionException("Cannot execute incr with sharded instance.");
        }
    }
    
    public static long incr(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.incr(key);
        } else {
            throw new JedisConnectionException("Cannot execute incr with sharded instance.");
        }
    }
    
    public static long incrBy(java.lang.String key,long increment) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.incrBy(key,increment);
        } else {
            throw new JedisConnectionException("Cannot execute incrBy with sharded instance.");
        }
    }
    
    public static long incrBy(byte[] key,long increment) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.incrBy(key,increment);
        } else {
            throw new JedisConnectionException("Cannot execute incrBy with sharded instance.");
        }
    }
    
    public static double incrByFloat(byte[] key,double increment) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.incrByFloat(key,increment);
        } else {
            throw new JedisConnectionException("Cannot execute incrByFloat with sharded instance.");
        }
    }
    
    public static double incrByFloat(java.lang.String key,double increment) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.incrByFloat(key,increment);
        } else {
            throw new JedisConnectionException("Cannot execute incrByFloat with sharded instance.");
        }
    }
    
    public static java.lang.String info() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.info();
        } else {
            throw new JedisConnectionException("Cannot execute info with sharded instance.");
        }
    }
    
    public static java.lang.String info(java.lang.String section) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.info(section);
        } else {
            throw new JedisConnectionException("Cannot execute info with sharded instance.");
        }
    }
    
    public static boolean isBroken() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.isBroken();
        } else {
            throw new JedisConnectionException("Cannot execute isBroken with sharded instance.");
        }
    }
    
    public static boolean isConnected() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.isConnected();
        } else {
            throw new JedisConnectionException("Cannot execute isConnected with sharded instance.");
        }
    }
    
    public static java.util.Set keys(byte[] pattern) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.keys(pattern);
        } else {
            throw new JedisConnectionException("Cannot execute keys with sharded instance.");
        }
    }
    
    public static java.util.Set keys(java.lang.String pattern) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.keys(pattern);
        } else {
            throw new JedisConnectionException("Cannot execute keys with sharded instance.");
        }
    }
    
    public static long lastsave() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.lastsave();
        } else {
            throw new JedisConnectionException("Cannot execute lastsave with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.resps.LCSMatchResult lcs(java.lang.String keyA,java.lang.String keyB,redis.clients.jedis.params.LCSParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.lcs(keyA,keyB,params);
        } else {
            throw new JedisConnectionException("Cannot execute lcs with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.resps.LCSMatchResult lcs(byte[] keyA,byte[] keyB,redis.clients.jedis.params.LCSParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.lcs(keyA,keyB,params);
        } else {
            throw new JedisConnectionException("Cannot execute lcs with sharded instance.");
        }
    }
    
    public static java.lang.String lindex(java.lang.String key,long index) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.lindex(key,index);
        } else {
            throw new JedisConnectionException("Cannot execute lindex with sharded instance.");
        }
    }
    
    public static byte[] lindex(byte[] key,long index) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.lindex(key,index);
        } else {
            throw new JedisConnectionException("Cannot execute lindex with sharded instance.");
        }
    }
    
    public static long linsert(byte[] key,redis.clients.jedis.args.ListPosition where,byte[] pivot,byte[] value) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.linsert(key,where,pivot,value);
        } else {
            throw new JedisConnectionException("Cannot execute linsert with sharded instance.");
        }
    }
    
    public static long linsert(java.lang.String key,redis.clients.jedis.args.ListPosition where,java.lang.String pivot,java.lang.String value) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.linsert(key,where,pivot,value);
        } else {
            throw new JedisConnectionException("Cannot execute linsert with sharded instance.");
        }
    }
    
    public static long llen(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.llen(key);
        } else {
            throw new JedisConnectionException("Cannot execute llen with sharded instance.");
        }
    }
    
    public static long llen(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.llen(key);
        } else {
            throw new JedisConnectionException("Cannot execute llen with sharded instance.");
        }
    }
    
    public static java.lang.String lmove(java.lang.String srcKey,java.lang.String dstKey,redis.clients.jedis.args.ListDirection from,redis.clients.jedis.args.ListDirection to) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.lmove(srcKey,dstKey,from,to);
        } else {
            throw new JedisConnectionException("Cannot execute lmove with sharded instance.");
        }
    }
    
    public static byte[] lmove(byte[] srcKey,byte[] dstKey,redis.clients.jedis.args.ListDirection from,redis.clients.jedis.args.ListDirection to) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.lmove(srcKey,dstKey,from,to);
        } else {
            throw new JedisConnectionException("Cannot execute lmove with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.util.KeyValue lmpop(redis.clients.jedis.args.ListDirection direction,java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.lmpop(direction,keys);
        } else {
            throw new JedisConnectionException("Cannot execute lmpop with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.util.KeyValue lmpop(redis.clients.jedis.args.ListDirection direction,byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.lmpop(direction,keys);
        } else {
            throw new JedisConnectionException("Cannot execute lmpop with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.util.KeyValue lmpop(redis.clients.jedis.args.ListDirection direction,int count,java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.lmpop(direction,count,keys);
        } else {
            throw new JedisConnectionException("Cannot execute lmpop with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.util.KeyValue lmpop(redis.clients.jedis.args.ListDirection direction,int count,byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.lmpop(direction,count,keys);
        } else {
            throw new JedisConnectionException("Cannot execute lmpop with sharded instance.");
        }
    }
    
    public static java.lang.String lolwut() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.lolwut();
        } else {
            throw new JedisConnectionException("Cannot execute lolwut with sharded instance.");
        }
    }
    
    public static java.lang.String lolwut(redis.clients.jedis.params.LolwutParams lolwutParams) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.lolwut(lolwutParams);
        } else {
            throw new JedisConnectionException("Cannot execute lolwut with sharded instance.");
        }
    }
    
    public static java.lang.String lpop(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.lpop(key);
        } else {
            throw new JedisConnectionException("Cannot execute lpop with sharded instance.");
        }
    }
    
    public static byte[] lpop(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.lpop(key);
        } else {
            throw new JedisConnectionException("Cannot execute lpop with sharded instance.");
        }
    }
    
    public static java.util.List lpop(java.lang.String key,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.lpop(key,count);
        } else {
            throw new JedisConnectionException("Cannot execute lpop with sharded instance.");
        }
    }
    
    public static java.util.List lpop(byte[] key,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.lpop(key,count);
        } else {
            throw new JedisConnectionException("Cannot execute lpop with sharded instance.");
        }
    }
    
    public static java.lang.Long lpos(byte[] key,byte[] element) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.lpos(key,element);
        } else {
            throw new JedisConnectionException("Cannot execute lpos with sharded instance.");
        }
    }
    
    public static java.lang.Long lpos(java.lang.String key,java.lang.String element) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.lpos(key,element);
        } else {
            throw new JedisConnectionException("Cannot execute lpos with sharded instance.");
        }
    }
    
    public static java.lang.Long lpos(byte[] key,byte[] element,redis.clients.jedis.params.LPosParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.lpos(key,element,params);
        } else {
            throw new JedisConnectionException("Cannot execute lpos with sharded instance.");
        }
    }
    
    public static java.lang.Long lpos(java.lang.String key,java.lang.String element,redis.clients.jedis.params.LPosParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.lpos(key,element,params);
        } else {
            throw new JedisConnectionException("Cannot execute lpos with sharded instance.");
        }
    }
    
    public static java.util.List lpos(java.lang.String key,java.lang.String element,redis.clients.jedis.params.LPosParams params,long count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.lpos(key,element,params,count);
        } else {
            throw new JedisConnectionException("Cannot execute lpos with sharded instance.");
        }
    }
    
    public static java.util.List lpos(byte[] key,byte[] element,redis.clients.jedis.params.LPosParams params,long count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.lpos(key,element,params,count);
        } else {
            throw new JedisConnectionException("Cannot execute lpos with sharded instance.");
        }
    }
    
    public static long lpush(byte[] key,byte[][] strings) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.lpush(key,strings);
        } else {
            throw new JedisConnectionException("Cannot execute lpush with sharded instance.");
        }
    }
    
    public static long lpush(java.lang.String key,java.lang.String[] strings) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.lpush(key,strings);
        } else {
            throw new JedisConnectionException("Cannot execute lpush with sharded instance.");
        }
    }
    
    public static long lpushx(byte[] key,byte[][] strings) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.lpushx(key,strings);
        } else {
            throw new JedisConnectionException("Cannot execute lpushx with sharded instance.");
        }
    }
    
    public static long lpushx(java.lang.String key,java.lang.String[] strings) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.lpushx(key,strings);
        } else {
            throw new JedisConnectionException("Cannot execute lpushx with sharded instance.");
        }
    }
    
    public static java.util.List lrange(java.lang.String key,long start,long stop) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.lrange(key,start,stop);
        } else {
            throw new JedisConnectionException("Cannot execute lrange with sharded instance.");
        }
    }
    
    public static java.util.List lrange(byte[] key,long start,long stop) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.lrange(key,start,stop);
        } else {
            throw new JedisConnectionException("Cannot execute lrange with sharded instance.");
        }
    }
    
    public static long lrem(java.lang.String key,long count,java.lang.String value) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.lrem(key,count,value);
        } else {
            throw new JedisConnectionException("Cannot execute lrem with sharded instance.");
        }
    }
    
    public static long lrem(byte[] key,long count,byte[] value) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.lrem(key,count,value);
        } else {
            throw new JedisConnectionException("Cannot execute lrem with sharded instance.");
        }
    }
    
    public static java.lang.String lset(java.lang.String key,long index,java.lang.String value) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.lset(key,index,value);
        } else {
            throw new JedisConnectionException("Cannot execute lset with sharded instance.");
        }
    }
    
    public static java.lang.String lset(byte[] key,long index,byte[] value) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.lset(key,index,value);
        } else {
            throw new JedisConnectionException("Cannot execute lset with sharded instance.");
        }
    }
    
    public static java.lang.String ltrim(byte[] key,long start,long stop) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.ltrim(key,start,stop);
        } else {
            throw new JedisConnectionException("Cannot execute ltrim with sharded instance.");
        }
    }
    
    public static java.lang.String ltrim(java.lang.String key,long start,long stop) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.ltrim(key,start,stop);
        } else {
            throw new JedisConnectionException("Cannot execute ltrim with sharded instance.");
        }
    }
    
    public static java.lang.String memoryDoctor() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.memoryDoctor();
        } else {
            throw new JedisConnectionException("Cannot execute memoryDoctor with sharded instance.");
        }
    }
    
    public static byte[] memoryDoctorBinary() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.memoryDoctorBinary();
        } else {
            throw new JedisConnectionException("Cannot execute memoryDoctorBinary with sharded instance.");
        }
    }
    
    public static java.lang.String memoryPurge() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.memoryPurge();
        } else {
            throw new JedisConnectionException("Cannot execute memoryPurge with sharded instance.");
        }
    }
    
    public static java.util.Map memoryStats() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.memoryStats();
        } else {
            throw new JedisConnectionException("Cannot execute memoryStats with sharded instance.");
        }
    }
    
    public static java.lang.Long memoryUsage(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.memoryUsage(key);
        } else {
            throw new JedisConnectionException("Cannot execute memoryUsage with sharded instance.");
        }
    }
    
    public static java.lang.Long memoryUsage(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.memoryUsage(key);
        } else {
            throw new JedisConnectionException("Cannot execute memoryUsage with sharded instance.");
        }
    }
    
    public static java.lang.Long memoryUsage(byte[] key,int samples) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.memoryUsage(key,samples);
        } else {
            throw new JedisConnectionException("Cannot execute memoryUsage with sharded instance.");
        }
    }
    
    public static java.lang.Long memoryUsage(java.lang.String key,int samples) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.memoryUsage(key,samples);
        } else {
            throw new JedisConnectionException("Cannot execute memoryUsage with sharded instance.");
        }
    }
    
    public static java.util.List mget(java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.mget(keys);
        } else {
            throw new JedisConnectionException("Cannot execute mget with sharded instance.");
        }
    }
    
    public static java.util.List mget(byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.mget(keys);
        } else {
            throw new JedisConnectionException("Cannot execute mget with sharded instance.");
        }
    }
    
    public static java.lang.String migrate(java.lang.String host,int port,java.lang.String key,int timeout) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.migrate(host,port,key,timeout);
        } else {
            throw new JedisConnectionException("Cannot execute migrate with sharded instance.");
        }
    }
    
    public static java.lang.String migrate(java.lang.String host,int port,byte[] key,int timeout) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.migrate(host,port,key,timeout);
        } else {
            throw new JedisConnectionException("Cannot execute migrate with sharded instance.");
        }
    }
    
    public static java.lang.String migrate(java.lang.String host,int port,int timeout,redis.clients.jedis.params.MigrateParams params,java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.migrate(host,port,timeout,params,keys);
        } else {
            throw new JedisConnectionException("Cannot execute migrate with sharded instance.");
        }
    }
    
    public static java.lang.String migrate(java.lang.String host,int port,byte[] key,int destinationDb,int timeout) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.migrate(host,port,key,destinationDb,timeout);
        } else {
            throw new JedisConnectionException("Cannot execute migrate with sharded instance.");
        }
    }
    
    public static java.lang.String migrate(java.lang.String host,int port,int timeout,redis.clients.jedis.params.MigrateParams params,byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.migrate(host,port,timeout,params,keys);
        } else {
            throw new JedisConnectionException("Cannot execute migrate with sharded instance.");
        }
    }
    
    public static java.lang.String migrate(java.lang.String host,int port,java.lang.String key,int destinationDb,int timeout) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.migrate(host,port,key,destinationDb,timeout);
        } else {
            throw new JedisConnectionException("Cannot execute migrate with sharded instance.");
        }
    }
    
    public static java.lang.String migrate(java.lang.String host,int port,int destinationDB,int timeout,redis.clients.jedis.params.MigrateParams params,java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.migrate(host,port,destinationDB,timeout,params,keys);
        } else {
            throw new JedisConnectionException("Cannot execute migrate with sharded instance.");
        }
    }
    
    public static java.lang.String migrate(java.lang.String host,int port,int destinationDB,int timeout,redis.clients.jedis.params.MigrateParams params,byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.migrate(host,port,destinationDB,timeout,params,keys);
        } else {
            throw new JedisConnectionException("Cannot execute migrate with sharded instance.");
        }
    }
    
    public static java.util.List moduleList() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.moduleList();
        } else {
            throw new JedisConnectionException("Cannot execute moduleList with sharded instance.");
        }
    }
    
    public static java.lang.String moduleLoad(java.lang.String path) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.moduleLoad(path);
        } else {
            throw new JedisConnectionException("Cannot execute moduleLoad with sharded instance.");
        }
    }
    
    public static java.lang.String moduleLoad(java.lang.String path,java.lang.String[] args) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.moduleLoad(path,args);
        } else {
            throw new JedisConnectionException("Cannot execute moduleLoad with sharded instance.");
        }
    }
    
    public static java.lang.String moduleUnload(java.lang.String name) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.moduleUnload(name);
        } else {
            throw new JedisConnectionException("Cannot execute moduleUnload with sharded instance.");
        }
    }
    
    public static void monitor(redis.clients.jedis.JedisMonitor jedisMonitor) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            jedis.monitor(jedisMonitor);
        } else {
            throw new JedisConnectionException("Cannot execute monitor with sharded instance.");
        }
    }
    
    public static long move(java.lang.String key,int dbIndex) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.move(key,dbIndex);
        } else {
            throw new JedisConnectionException("Cannot execute move with sharded instance.");
        }
    }
    
    public static long move(byte[] key,int dbIndex) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.move(key,dbIndex);
        } else {
            throw new JedisConnectionException("Cannot execute move with sharded instance.");
        }
    }
    
    public static java.lang.String mset(byte[][] keysvalues) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.mset(keysvalues);
        } else {
            throw new JedisConnectionException("Cannot execute mset with sharded instance.");
        }
    }
    
    public static java.lang.String mset(java.lang.String[] keysvalues) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.mset(keysvalues);
        } else {
            throw new JedisConnectionException("Cannot execute mset with sharded instance.");
        }
    }
    
    public static long msetnx(byte[][] keysvalues) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.msetnx(keysvalues);
        } else {
            throw new JedisConnectionException("Cannot execute msetnx with sharded instance.");
        }
    }
    
    public static long msetnx(java.lang.String[] keysvalues) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.msetnx(keysvalues);
        } else {
            throw new JedisConnectionException("Cannot execute msetnx with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.Transaction multi() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.multi();
        } else {
            throw new JedisConnectionException("Cannot execute multi with sharded instance.");
        }
    }
    
    public static byte[] objectEncoding(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.objectEncoding(key);
        } else {
            throw new JedisConnectionException("Cannot execute objectEncoding with sharded instance.");
        }
    }
    
    public static java.lang.String objectEncoding(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.objectEncoding(key);
        } else {
            throw new JedisConnectionException("Cannot execute objectEncoding with sharded instance.");
        }
    }
    
    public static java.lang.Long objectFreq(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.objectFreq(key);
        } else {
            throw new JedisConnectionException("Cannot execute objectFreq with sharded instance.");
        }
    }
    
    public static java.lang.Long objectFreq(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.objectFreq(key);
        } else {
            throw new JedisConnectionException("Cannot execute objectFreq with sharded instance.");
        }
    }
    
    public static java.util.List objectHelp() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.objectHelp();
        } else {
            throw new JedisConnectionException("Cannot execute objectHelp with sharded instance.");
        }
    }
    
    public static java.util.List objectHelpBinary() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.objectHelpBinary();
        } else {
            throw new JedisConnectionException("Cannot execute objectHelpBinary with sharded instance.");
        }
    }
    
    public static java.lang.Long objectIdletime(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.objectIdletime(key);
        } else {
            throw new JedisConnectionException("Cannot execute objectIdletime with sharded instance.");
        }
    }
    
    public static java.lang.Long objectIdletime(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.objectIdletime(key);
        } else {
            throw new JedisConnectionException("Cannot execute objectIdletime with sharded instance.");
        }
    }
    
    public static java.lang.Long objectRefcount(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.objectRefcount(key);
        } else {
            throw new JedisConnectionException("Cannot execute objectRefcount with sharded instance.");
        }
    }
    
    public static java.lang.Long objectRefcount(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.objectRefcount(key);
        } else {
            throw new JedisConnectionException("Cannot execute objectRefcount with sharded instance.");
        }
    }
    
    public static long persist(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.persist(key);
        } else {
            throw new JedisConnectionException("Cannot execute persist with sharded instance.");
        }
    }
    
    public static long persist(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.persist(key);
        } else {
            throw new JedisConnectionException("Cannot execute persist with sharded instance.");
        }
    }
    
    public static long pexpire(java.lang.String key,long milliseconds) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.pexpire(key,milliseconds);
        } else {
            throw new JedisConnectionException("Cannot execute pexpire with sharded instance.");
        }
    }
    
    public static long pexpire(byte[] key,long milliseconds) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.pexpire(key,milliseconds);
        } else {
            throw new JedisConnectionException("Cannot execute pexpire with sharded instance.");
        }
    }
    
    public static long pexpire(java.lang.String key,long milliseconds,redis.clients.jedis.args.ExpiryOption expiryOption) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.pexpire(key,milliseconds,expiryOption);
        } else {
            throw new JedisConnectionException("Cannot execute pexpire with sharded instance.");
        }
    }
    
    public static long pexpire(byte[] key,long milliseconds,redis.clients.jedis.args.ExpiryOption expiryOption) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.pexpire(key,milliseconds,expiryOption);
        } else {
            throw new JedisConnectionException("Cannot execute pexpire with sharded instance.");
        }
    }
    
    public static long pexpireAt(byte[] key,long millisecondsTimestamp) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.pexpireAt(key,millisecondsTimestamp);
        } else {
            throw new JedisConnectionException("Cannot execute pexpireAt with sharded instance.");
        }
    }
    
    public static long pexpireAt(java.lang.String key,long millisecondsTimestamp) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.pexpireAt(key,millisecondsTimestamp);
        } else {
            throw new JedisConnectionException("Cannot execute pexpireAt with sharded instance.");
        }
    }
    
    public static long pexpireAt(byte[] key,long millisecondsTimestamp,redis.clients.jedis.args.ExpiryOption expiryOption) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.pexpireAt(key,millisecondsTimestamp,expiryOption);
        } else {
            throw new JedisConnectionException("Cannot execute pexpireAt with sharded instance.");
        }
    }
    
    public static long pexpireAt(java.lang.String key,long millisecondsTimestamp,redis.clients.jedis.args.ExpiryOption expiryOption) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.pexpireAt(key,millisecondsTimestamp,expiryOption);
        } else {
            throw new JedisConnectionException("Cannot execute pexpireAt with sharded instance.");
        }
    }
    
    public static long pexpireTime(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.pexpireTime(key);
        } else {
            throw new JedisConnectionException("Cannot execute pexpireTime with sharded instance.");
        }
    }
    
    public static long pexpireTime(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.pexpireTime(key);
        } else {
            throw new JedisConnectionException("Cannot execute pexpireTime with sharded instance.");
        }
    }
    
    public static long pfadd(java.lang.String key,java.lang.String[] elements) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.pfadd(key,elements);
        } else {
            throw new JedisConnectionException("Cannot execute pfadd with sharded instance.");
        }
    }
    
    public static long pfadd(byte[] key,byte[][] elements) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.pfadd(key,elements);
        } else {
            throw new JedisConnectionException("Cannot execute pfadd with sharded instance.");
        }
    }
    
    public static long pfcount(byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.pfcount(keys);
        } else {
            throw new JedisConnectionException("Cannot execute pfcount with sharded instance.");
        }
    }
    
    public static long pfcount(java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.pfcount(keys);
        } else {
            throw new JedisConnectionException("Cannot execute pfcount with sharded instance.");
        }
    }
    
    public static long pfcount(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.pfcount(key);
        } else {
            throw new JedisConnectionException("Cannot execute pfcount with sharded instance.");
        }
    }
    
    public static long pfcount(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.pfcount(key);
        } else {
            throw new JedisConnectionException("Cannot execute pfcount with sharded instance.");
        }
    }
    
    public static java.lang.String pfmerge(byte[] destkey,byte[][] sourcekeys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.pfmerge(destkey,sourcekeys);
        } else {
            throw new JedisConnectionException("Cannot execute pfmerge with sharded instance.");
        }
    }
    
    public static java.lang.String pfmerge(java.lang.String destkey,java.lang.String[] sourcekeys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.pfmerge(destkey,sourcekeys);
        } else {
            throw new JedisConnectionException("Cannot execute pfmerge with sharded instance.");
        }
    }
    
    public static java.lang.String ping() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.ping();
        } else {
            throw new JedisConnectionException("Cannot execute ping with sharded instance.");
        }
    }
    
    public static byte[] ping(byte[] message) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.ping(message);
        } else {
            throw new JedisConnectionException("Cannot execute ping with sharded instance.");
        }
    }
    
    public static java.lang.String ping(java.lang.String message) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.ping(message);
        } else {
            throw new JedisConnectionException("Cannot execute ping with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.Pipeline pipelined() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.pipelined();
        } else {
            throw new JedisConnectionException("Cannot execute pipelined with sharded instance.");
        }
    }
    
    public static java.lang.String psetex(byte[] key,long milliseconds,byte[] value) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.psetex(key,milliseconds,value);
        } else {
            throw new JedisConnectionException("Cannot execute psetex with sharded instance.");
        }
    }
    
    public static java.lang.String psetex(java.lang.String key,long milliseconds,java.lang.String value) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.psetex(key,milliseconds,value);
        } else {
            throw new JedisConnectionException("Cannot execute psetex with sharded instance.");
        }
    }
    
    public static void psubscribe(redis.clients.jedis.BinaryJedisPubSub jedisPubSub,byte[][] patterns) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            jedis.psubscribe(jedisPubSub,patterns);
        } else {
            throw new JedisConnectionException("Cannot execute psubscribe with sharded instance.");
        }
    }
    
    public static void psubscribe(redis.clients.jedis.JedisPubSub jedisPubSub,java.lang.String[] patterns) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            jedis.psubscribe(jedisPubSub,patterns);
        } else {
            throw new JedisConnectionException("Cannot execute psubscribe with sharded instance.");
        }
    }
    
    public static long pttl(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.pttl(key);
        } else {
            throw new JedisConnectionException("Cannot execute pttl with sharded instance.");
        }
    }
    
    public static long pttl(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.pttl(key);
        } else {
            throw new JedisConnectionException("Cannot execute pttl with sharded instance.");
        }
    }
    
    public static long publish(byte[] channel,byte[] message) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.publish(channel,message);
        } else {
            throw new JedisConnectionException("Cannot execute publish with sharded instance.");
        }
    }
    
    public static long publish(java.lang.String channel,java.lang.String message) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.publish(channel,message);
        } else {
            throw new JedisConnectionException("Cannot execute publish with sharded instance.");
        }
    }
    
    public static java.util.List pubsubChannels() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.pubsubChannels();
        } else {
            throw new JedisConnectionException("Cannot execute pubsubChannels with sharded instance.");
        }
    }
    
    public static java.util.List pubsubChannels(java.lang.String pattern) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.pubsubChannels(pattern);
        } else {
            throw new JedisConnectionException("Cannot execute pubsubChannels with sharded instance.");
        }
    }
    
    public static java.lang.Long pubsubNumPat() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.pubsubNumPat();
        } else {
            throw new JedisConnectionException("Cannot execute pubsubNumPat with sharded instance.");
        }
    }
    
    public static java.util.Map pubsubNumSub(java.lang.String[] channels) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.pubsubNumSub(channels);
        } else {
            throw new JedisConnectionException("Cannot execute pubsubNumSub with sharded instance.");
        }
    }
    
    public static byte[] randomBinaryKey() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.randomBinaryKey();
        } else {
            throw new JedisConnectionException("Cannot execute randomBinaryKey with sharded instance.");
        }
    }
    
    public static java.lang.String randomKey() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.randomKey();
        } else {
            throw new JedisConnectionException("Cannot execute randomKey with sharded instance.");
        }
    }
    
    public static java.lang.String readonly() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.readonly();
        } else {
            throw new JedisConnectionException("Cannot execute readonly with sharded instance.");
        }
    }
    
    public static java.lang.String readwrite() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.readwrite();
        } else {
            throw new JedisConnectionException("Cannot execute readwrite with sharded instance.");
        }
    }
    
    public static java.lang.String rename(byte[] oldkey,byte[] newkey) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.rename(oldkey,newkey);
        } else {
            throw new JedisConnectionException("Cannot execute rename with sharded instance.");
        }
    }
    
    public static java.lang.String rename(java.lang.String oldkey,java.lang.String newkey) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.rename(oldkey,newkey);
        } else {
            throw new JedisConnectionException("Cannot execute rename with sharded instance.");
        }
    }
    
    public static long renamenx(byte[] oldkey,byte[] newkey) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.renamenx(oldkey,newkey);
        } else {
            throw new JedisConnectionException("Cannot execute renamenx with sharded instance.");
        }
    }
    
    public static long renamenx(java.lang.String oldkey,java.lang.String newkey) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.renamenx(oldkey,newkey);
        } else {
            throw new JedisConnectionException("Cannot execute renamenx with sharded instance.");
        }
    }
    
    public static java.lang.String replicaof(java.lang.String host,int port) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.replicaof(host,port);
        } else {
            throw new JedisConnectionException("Cannot execute replicaof with sharded instance.");
        }
    }
    
    public static java.lang.String replicaofNoOne() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.replicaofNoOne();
        } else {
            throw new JedisConnectionException("Cannot execute replicaofNoOne with sharded instance.");
        }
    }
    
    public static void resetState() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            jedis.resetState();
        } else {
            throw new JedisConnectionException("Cannot execute resetState with sharded instance.");
        }
    }
    
    public static java.lang.String restore(byte[] key,long ttl,byte[] serializedValue) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.restore(key,ttl,serializedValue);
        } else {
            throw new JedisConnectionException("Cannot execute restore with sharded instance.");
        }
    }
    
    public static java.lang.String restore(java.lang.String key,long ttl,byte[] serializedValue) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.restore(key,ttl,serializedValue);
        } else {
            throw new JedisConnectionException("Cannot execute restore with sharded instance.");
        }
    }
    
    public static java.lang.String restore(java.lang.String key,long ttl,byte[] serializedValue,redis.clients.jedis.params.RestoreParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.restore(key,ttl,serializedValue,params);
        } else {
            throw new JedisConnectionException("Cannot execute restore with sharded instance.");
        }
    }
    
    public static java.lang.String restore(byte[] key,long ttl,byte[] serializedValue,redis.clients.jedis.params.RestoreParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.restore(key,ttl,serializedValue,params);
        } else {
            throw new JedisConnectionException("Cannot execute restore with sharded instance.");
        }
    }
    
    public static java.util.List role() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.role();
        } else {
            throw new JedisConnectionException("Cannot execute role with sharded instance.");
        }
    }
    
    public static java.util.List roleBinary() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.roleBinary();
        } else {
            throw new JedisConnectionException("Cannot execute roleBinary with sharded instance.");
        }
    }
    
    public static byte[] rpop(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.rpop(key);
        } else {
            throw new JedisConnectionException("Cannot execute rpop with sharded instance.");
        }
    }
    
    public static java.lang.String rpop(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.rpop(key);
        } else {
            throw new JedisConnectionException("Cannot execute rpop with sharded instance.");
        }
    }
    
    public static java.util.List rpop(byte[] key,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.rpop(key,count);
        } else {
            throw new JedisConnectionException("Cannot execute rpop with sharded instance.");
        }
    }
    
    public static java.util.List rpop(java.lang.String key,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.rpop(key,count);
        } else {
            throw new JedisConnectionException("Cannot execute rpop with sharded instance.");
        }
    }
    
    public static java.lang.String rpoplpush(java.lang.String srckey,java.lang.String dstkey) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.rpoplpush(srckey,dstkey);
        } else {
            throw new JedisConnectionException("Cannot execute rpoplpush with sharded instance.");
        }
    }
    
    public static byte[] rpoplpush(byte[] srckey,byte[] dstkey) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.rpoplpush(srckey,dstkey);
        } else {
            throw new JedisConnectionException("Cannot execute rpoplpush with sharded instance.");
        }
    }
    
    public static long rpush(byte[] key,byte[][] strings) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.rpush(key,strings);
        } else {
            throw new JedisConnectionException("Cannot execute rpush with sharded instance.");
        }
    }
    
    public static long rpush(java.lang.String key,java.lang.String[] strings) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.rpush(key,strings);
        } else {
            throw new JedisConnectionException("Cannot execute rpush with sharded instance.");
        }
    }
    
    public static long rpushx(java.lang.String key,java.lang.String[] strings) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.rpushx(key,strings);
        } else {
            throw new JedisConnectionException("Cannot execute rpushx with sharded instance.");
        }
    }
    
    public static long rpushx(byte[] key,byte[][] strings) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.rpushx(key,strings);
        } else {
            throw new JedisConnectionException("Cannot execute rpushx with sharded instance.");
        }
    }
    
    public static long sadd(java.lang.String key,java.lang.String[] members) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sadd(key,members);
        } else {
            throw new JedisConnectionException("Cannot execute sadd with sharded instance.");
        }
    }
    
    public static long sadd(byte[] key,byte[][] members) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sadd(key,members);
        } else {
            throw new JedisConnectionException("Cannot execute sadd with sharded instance.");
        }
    }
    
    public static java.lang.String save() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.save();
        } else {
            throw new JedisConnectionException("Cannot execute save with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.resps.ScanResult scan(java.lang.String cursor) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.scan(cursor);
        } else {
            throw new JedisConnectionException("Cannot execute scan with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.resps.ScanResult scan(byte[] cursor) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.scan(cursor);
        } else {
            throw new JedisConnectionException("Cannot execute scan with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.resps.ScanResult scan(java.lang.String cursor,redis.clients.jedis.params.ScanParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.scan(cursor,params);
        } else {
            throw new JedisConnectionException("Cannot execute scan with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.resps.ScanResult scan(byte[] cursor,redis.clients.jedis.params.ScanParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.scan(cursor,params);
        } else {
            throw new JedisConnectionException("Cannot execute scan with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.resps.ScanResult scan(byte[] cursor,redis.clients.jedis.params.ScanParams params,byte[] type) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.scan(cursor,params,type);
        } else {
            throw new JedisConnectionException("Cannot execute scan with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.resps.ScanResult scan(java.lang.String cursor,redis.clients.jedis.params.ScanParams params,java.lang.String type) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.scan(cursor,params,type);
        } else {
            throw new JedisConnectionException("Cannot execute scan with sharded instance.");
        }
    }
    
    public static long scard(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.scard(key);
        } else {
            throw new JedisConnectionException("Cannot execute scard with sharded instance.");
        }
    }
    
    public static long scard(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.scard(key);
        } else {
            throw new JedisConnectionException("Cannot execute scard with sharded instance.");
        }
    }
    
    public static java.lang.Boolean scriptExists(java.lang.String sha1) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.scriptExists(sha1);
        } else {
            throw new JedisConnectionException("Cannot execute scriptExists with sharded instance.");
        }
    }
    
    public static java.lang.Boolean scriptExists(byte[] sha1) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.scriptExists(sha1);
        } else {
            throw new JedisConnectionException("Cannot execute scriptExists with sharded instance.");
        }
    }
    
    public static java.util.List scriptExists(java.lang.String[] sha1) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.scriptExists(sha1);
        } else {
            throw new JedisConnectionException("Cannot execute scriptExists with sharded instance.");
        }
    }
    
    public static java.util.List scriptExists(byte[][] sha1) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.scriptExists(sha1);
        } else {
            throw new JedisConnectionException("Cannot execute scriptExists with sharded instance.");
        }
    }
    
    public static java.lang.String scriptFlush() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.scriptFlush();
        } else {
            throw new JedisConnectionException("Cannot execute scriptFlush with sharded instance.");
        }
    }
    
    public static java.lang.String scriptFlush(redis.clients.jedis.args.FlushMode flushMode) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.scriptFlush(flushMode);
        } else {
            throw new JedisConnectionException("Cannot execute scriptFlush with sharded instance.");
        }
    }
    
    public static java.lang.String scriptKill() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.scriptKill();
        } else {
            throw new JedisConnectionException("Cannot execute scriptKill with sharded instance.");
        }
    }
    
    public static byte[] scriptLoad(byte[] script) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.scriptLoad(script);
        } else {
            throw new JedisConnectionException("Cannot execute scriptLoad with sharded instance.");
        }
    }
    
    public static java.lang.String scriptLoad(java.lang.String script) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.scriptLoad(script);
        } else {
            throw new JedisConnectionException("Cannot execute scriptLoad with sharded instance.");
        }
    }
    
    public static java.util.Set sdiff(byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sdiff(keys);
        } else {
            throw new JedisConnectionException("Cannot execute sdiff with sharded instance.");
        }
    }
    
    public static java.util.Set sdiff(java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sdiff(keys);
        } else {
            throw new JedisConnectionException("Cannot execute sdiff with sharded instance.");
        }
    }
    
    public static long sdiffstore(java.lang.String dstkey,java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sdiffstore(dstkey,keys);
        } else {
            throw new JedisConnectionException("Cannot execute sdiffstore with sharded instance.");
        }
    }
    
    public static long sdiffstore(byte[] dstkey,byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sdiffstore(dstkey,keys);
        } else {
            throw new JedisConnectionException("Cannot execute sdiffstore with sharded instance.");
        }
    }
    
    public static java.lang.String select(int index) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.select(index);
        } else {
            throw new JedisConnectionException("Cannot execute select with sharded instance.");
        }
    }
    
    public static java.lang.Object sendBlockingCommand(redis.clients.jedis.commands.ProtocolCommand cmd,java.lang.String[] args) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sendBlockingCommand(cmd,args);
        } else {
            throw new JedisConnectionException("Cannot execute sendBlockingCommand with sharded instance.");
        }
    }
    
    public static java.lang.Object sendBlockingCommand(redis.clients.jedis.commands.ProtocolCommand cmd,byte[][] args) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sendBlockingCommand(cmd,args);
        } else {
            throw new JedisConnectionException("Cannot execute sendBlockingCommand with sharded instance.");
        }
    }
    
    public static java.lang.Object sendCommand(redis.clients.jedis.commands.ProtocolCommand cmd) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sendCommand(cmd);
        } else {
            throw new JedisConnectionException("Cannot execute sendCommand with sharded instance.");
        }
    }
    
    public static java.lang.Object sendCommand(redis.clients.jedis.commands.ProtocolCommand cmd,byte[][] args) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sendCommand(cmd,args);
        } else {
            throw new JedisConnectionException("Cannot execute sendCommand with sharded instance.");
        }
    }
    
    public static java.lang.Object sendCommand(redis.clients.jedis.commands.ProtocolCommand cmd,java.lang.String[] args) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sendCommand(cmd,args);
        } else {
            throw new JedisConnectionException("Cannot execute sendCommand with sharded instance.");
        }
    }
    
    public static java.lang.String sentinelFailover(java.lang.String masterName) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sentinelFailover(masterName);
        } else {
            throw new JedisConnectionException("Cannot execute sentinelFailover with sharded instance.");
        }
    }
    
    public static java.util.List sentinelGetMasterAddrByName(java.lang.String masterName) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sentinelGetMasterAddrByName(masterName);
        } else {
            throw new JedisConnectionException("Cannot execute sentinelGetMasterAddrByName with sharded instance.");
        }
    }
    
    public static java.util.Map sentinelMaster(java.lang.String masterName) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sentinelMaster(masterName);
        } else {
            throw new JedisConnectionException("Cannot execute sentinelMaster with sharded instance.");
        }
    }
    
    public static java.util.List sentinelMasters() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sentinelMasters();
        } else {
            throw new JedisConnectionException("Cannot execute sentinelMasters with sharded instance.");
        }
    }
    
    public static java.lang.String sentinelMonitor(java.lang.String masterName,java.lang.String ip,int port,int quorum) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sentinelMonitor(masterName,ip,port,quorum);
        } else {
            throw new JedisConnectionException("Cannot execute sentinelMonitor with sharded instance.");
        }
    }
    
    public static java.lang.String sentinelMyId() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sentinelMyId();
        } else {
            throw new JedisConnectionException("Cannot execute sentinelMyId with sharded instance.");
        }
    }
    
    public static java.lang.String sentinelRemove(java.lang.String masterName) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sentinelRemove(masterName);
        } else {
            throw new JedisConnectionException("Cannot execute sentinelRemove with sharded instance.");
        }
    }
    
    public static java.util.List sentinelReplicas(java.lang.String masterName) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sentinelReplicas(masterName);
        } else {
            throw new JedisConnectionException("Cannot execute sentinelReplicas with sharded instance.");
        }
    }
    
    public static java.lang.Long sentinelReset(java.lang.String pattern) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sentinelReset(pattern);
        } else {
            throw new JedisConnectionException("Cannot execute sentinelReset with sharded instance.");
        }
    }
    
    public static java.util.List sentinelSentinels(java.lang.String masterName) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sentinelSentinels(masterName);
        } else {
            throw new JedisConnectionException("Cannot execute sentinelSentinels with sharded instance.");
        }
    }
    
    public static java.lang.String sentinelSet(java.lang.String masterName,java.util.Map parameterMap) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sentinelSet(masterName,parameterMap);
        } else {
            throw new JedisConnectionException("Cannot execute sentinelSet with sharded instance.");
        }
    }
    
    public static java.util.List sentinelSlaves(java.lang.String masterName) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sentinelSlaves(masterName);
        } else {
            throw new JedisConnectionException("Cannot execute sentinelSlaves with sharded instance.");
        }
    }
    
    public static java.lang.String set(byte[] key,byte[] value) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.set(key,value);
        } else {
            throw new JedisConnectionException("Cannot execute set with sharded instance.");
        }
    }
    
    public static java.lang.String set(java.lang.String key,java.lang.String value) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.set(key,value);
        } else {
            throw new JedisConnectionException("Cannot execute set with sharded instance.");
        }
    }
    
    public static java.lang.String set(java.lang.String key,java.lang.String value,redis.clients.jedis.params.SetParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.set(key,value,params);
        } else {
            throw new JedisConnectionException("Cannot execute set with sharded instance.");
        }
    }
    
    public static java.lang.String set(byte[] key,byte[] value,redis.clients.jedis.params.SetParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.set(key,value,params);
        } else {
            throw new JedisConnectionException("Cannot execute set with sharded instance.");
        }
    }
    
    public static boolean setbit(java.lang.String key,long offset,boolean value) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.setbit(key,offset,value);
        } else {
            throw new JedisConnectionException("Cannot execute setbit with sharded instance.");
        }
    }
    
    public static boolean setbit(byte[] key,long offset,boolean value) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.setbit(key,offset,value);
        } else {
            throw new JedisConnectionException("Cannot execute setbit with sharded instance.");
        }
    }
    
    public static java.lang.String setex(java.lang.String key,long seconds,java.lang.String value) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.setex(key,seconds,value);
        } else {
            throw new JedisConnectionException("Cannot execute setex with sharded instance.");
        }
    }
    
    public static java.lang.String setex(byte[] key,long seconds,byte[] value) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.setex(key,seconds,value);
        } else {
            throw new JedisConnectionException("Cannot execute setex with sharded instance.");
        }
    }
    
    public static long setnx(byte[] key,byte[] value) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.setnx(key,value);
        } else {
            throw new JedisConnectionException("Cannot execute setnx with sharded instance.");
        }
    }
    
    public static long setnx(java.lang.String key,java.lang.String value) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.setnx(key,value);
        } else {
            throw new JedisConnectionException("Cannot execute setnx with sharded instance.");
        }
    }
    
    public static long setrange(java.lang.String key,long offset,java.lang.String value) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.setrange(key,offset,value);
        } else {
            throw new JedisConnectionException("Cannot execute setrange with sharded instance.");
        }
    }
    
    public static long setrange(byte[] key,long offset,byte[] value) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.setrange(key,offset,value);
        } else {
            throw new JedisConnectionException("Cannot execute setrange with sharded instance.");
        }
    }
    
    public static void shutdown() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            jedis.shutdown();
        } else {
            throw new JedisConnectionException("Cannot execute shutdown with sharded instance.");
        }
    }
    
    public static void shutdown(redis.clients.jedis.params.ShutdownParams shutdownParams) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            jedis.shutdown(shutdownParams);
        } else {
            throw new JedisConnectionException("Cannot execute shutdown with sharded instance.");
        }
    }
    
    public static void shutdown(redis.clients.jedis.args.SaveMode saveMode) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            jedis.shutdown(saveMode);
        } else {
            throw new JedisConnectionException("Cannot execute shutdown with sharded instance.");
        }
    }
    
    public static java.lang.String shutdownAbort() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.shutdownAbort();
        } else {
            throw new JedisConnectionException("Cannot execute shutdownAbort with sharded instance.");
        }
    }
    
    public static java.util.Set sinter(byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sinter(keys);
        } else {
            throw new JedisConnectionException("Cannot execute sinter with sharded instance.");
        }
    }
    
    public static java.util.Set sinter(java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sinter(keys);
        } else {
            throw new JedisConnectionException("Cannot execute sinter with sharded instance.");
        }
    }
    
    public static long sintercard(java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sintercard(keys);
        } else {
            throw new JedisConnectionException("Cannot execute sintercard with sharded instance.");
        }
    }
    
    public static long sintercard(byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sintercard(keys);
        } else {
            throw new JedisConnectionException("Cannot execute sintercard with sharded instance.");
        }
    }
    
    public static long sintercard(int limit,java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sintercard(limit,keys);
        } else {
            throw new JedisConnectionException("Cannot execute sintercard with sharded instance.");
        }
    }
    
    public static long sintercard(int limit,byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sintercard(limit,keys);
        } else {
            throw new JedisConnectionException("Cannot execute sintercard with sharded instance.");
        }
    }
    
    public static long sinterstore(java.lang.String dstkey,java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sinterstore(dstkey,keys);
        } else {
            throw new JedisConnectionException("Cannot execute sinterstore with sharded instance.");
        }
    }
    
    public static long sinterstore(byte[] dstkey,byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sinterstore(dstkey,keys);
        } else {
            throw new JedisConnectionException("Cannot execute sinterstore with sharded instance.");
        }
    }
    
    public static boolean sismember(java.lang.String key,java.lang.String member) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sismember(key,member);
        } else {
            throw new JedisConnectionException("Cannot execute sismember with sharded instance.");
        }
    }
    
    public static boolean sismember(byte[] key,byte[] member) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sismember(key,member);
        } else {
            throw new JedisConnectionException("Cannot execute sismember with sharded instance.");
        }
    }
    
    public static java.lang.String slaveof(java.lang.String host,int port) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.slaveof(host,port);
        } else {
            throw new JedisConnectionException("Cannot execute slaveof with sharded instance.");
        }
    }
    
    public static java.lang.String slaveofNoOne() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.slaveofNoOne();
        } else {
            throw new JedisConnectionException("Cannot execute slaveofNoOne with sharded instance.");
        }
    }
    
    public static java.util.List slowlogGet() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.slowlogGet();
        } else {
            throw new JedisConnectionException("Cannot execute slowlogGet with sharded instance.");
        }
    }
    
    public static java.util.List slowlogGet(long entries) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.slowlogGet(entries);
        } else {
            throw new JedisConnectionException("Cannot execute slowlogGet with sharded instance.");
        }
    }
    
    public static java.util.List slowlogGetBinary() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.slowlogGetBinary();
        } else {
            throw new JedisConnectionException("Cannot execute slowlogGetBinary with sharded instance.");
        }
    }
    
    public static java.util.List slowlogGetBinary(long entries) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.slowlogGetBinary(entries);
        } else {
            throw new JedisConnectionException("Cannot execute slowlogGetBinary with sharded instance.");
        }
    }
    
    public static long slowlogLen() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.slowlogLen();
        } else {
            throw new JedisConnectionException("Cannot execute slowlogLen with sharded instance.");
        }
    }
    
    public static java.lang.String slowlogReset() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.slowlogReset();
        } else {
            throw new JedisConnectionException("Cannot execute slowlogReset with sharded instance.");
        }
    }
    
    public static java.util.Set smembers(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.smembers(key);
        } else {
            throw new JedisConnectionException("Cannot execute smembers with sharded instance.");
        }
    }
    
    public static java.util.Set smembers(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.smembers(key);
        } else {
            throw new JedisConnectionException("Cannot execute smembers with sharded instance.");
        }
    }
    
    public static java.util.List smismember(java.lang.String key,java.lang.String[] members) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.smismember(key,members);
        } else {
            throw new JedisConnectionException("Cannot execute smismember with sharded instance.");
        }
    }
    
    public static java.util.List smismember(byte[] key,byte[][] members) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.smismember(key,members);
        } else {
            throw new JedisConnectionException("Cannot execute smismember with sharded instance.");
        }
    }
    
    public static long smove(byte[] srckey,byte[] dstkey,byte[] member) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.smove(srckey,dstkey,member);
        } else {
            throw new JedisConnectionException("Cannot execute smove with sharded instance.");
        }
    }
    
    public static long smove(java.lang.String srckey,java.lang.String dstkey,java.lang.String member) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.smove(srckey,dstkey,member);
        } else {
            throw new JedisConnectionException("Cannot execute smove with sharded instance.");
        }
    }
    
    public static java.util.List sort(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sort(key);
        } else {
            throw new JedisConnectionException("Cannot execute sort with sharded instance.");
        }
    }
    
    public static java.util.List sort(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sort(key);
        } else {
            throw new JedisConnectionException("Cannot execute sort with sharded instance.");
        }
    }
    
    public static long sort(byte[] key,byte[] dstkey) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sort(key,dstkey);
        } else {
            throw new JedisConnectionException("Cannot execute sort with sharded instance.");
        }
    }
    
    public static java.util.List sort(java.lang.String key,redis.clients.jedis.params.SortingParams sortingParams) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sort(key,sortingParams);
        } else {
            throw new JedisConnectionException("Cannot execute sort with sharded instance.");
        }
    }
    
    public static long sort(java.lang.String key,java.lang.String dstkey) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sort(key,dstkey);
        } else {
            throw new JedisConnectionException("Cannot execute sort with sharded instance.");
        }
    }
    
    public static java.util.List sort(byte[] key,redis.clients.jedis.params.SortingParams sortingParams) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sort(key,sortingParams);
        } else {
            throw new JedisConnectionException("Cannot execute sort with sharded instance.");
        }
    }
    
    public static long sort(java.lang.String key,redis.clients.jedis.params.SortingParams sortingParams,java.lang.String dstkey) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sort(key,sortingParams,dstkey);
        } else {
            throw new JedisConnectionException("Cannot execute sort with sharded instance.");
        }
    }
    
    public static long sort(byte[] key,redis.clients.jedis.params.SortingParams sortingParams,byte[] dstkey) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sort(key,sortingParams,dstkey);
        } else {
            throw new JedisConnectionException("Cannot execute sort with sharded instance.");
        }
    }
    
    public static java.util.List sortReadonly(java.lang.String key,redis.clients.jedis.params.SortingParams sortingParams) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sortReadonly(key,sortingParams);
        } else {
            throw new JedisConnectionException("Cannot execute sortReadonly with sharded instance.");
        }
    }
    
    public static java.util.List sortReadonly(byte[] key,redis.clients.jedis.params.SortingParams sortingParams) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sortReadonly(key,sortingParams);
        } else {
            throw new JedisConnectionException("Cannot execute sortReadonly with sharded instance.");
        }
    }
    
    public static byte[] spop(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.spop(key);
        } else {
            throw new JedisConnectionException("Cannot execute spop with sharded instance.");
        }
    }
    
    public static java.lang.String spop(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.spop(key);
        } else {
            throw new JedisConnectionException("Cannot execute spop with sharded instance.");
        }
    }
    
    public static java.util.Set spop(java.lang.String key,long count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.spop(key,count);
        } else {
            throw new JedisConnectionException("Cannot execute spop with sharded instance.");
        }
    }
    
    public static java.util.Set spop(byte[] key,long count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.spop(key,count);
        } else {
            throw new JedisConnectionException("Cannot execute spop with sharded instance.");
        }
    }
    
    public static java.lang.String srandmember(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.srandmember(key);
        } else {
            throw new JedisConnectionException("Cannot execute srandmember with sharded instance.");
        }
    }
    
    public static byte[] srandmember(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.srandmember(key);
        } else {
            throw new JedisConnectionException("Cannot execute srandmember with sharded instance.");
        }
    }
    
    public static java.util.List srandmember(java.lang.String key,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.srandmember(key,count);
        } else {
            throw new JedisConnectionException("Cannot execute srandmember with sharded instance.");
        }
    }
    
    public static java.util.List srandmember(byte[] key,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.srandmember(key,count);
        } else {
            throw new JedisConnectionException("Cannot execute srandmember with sharded instance.");
        }
    }
    
    public static long srem(byte[] key,byte[][] members) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.srem(key,members);
        } else {
            throw new JedisConnectionException("Cannot execute srem with sharded instance.");
        }
    }
    
    public static long srem(java.lang.String key,java.lang.String[] members) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.srem(key,members);
        } else {
            throw new JedisConnectionException("Cannot execute srem with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.resps.ScanResult sscan(java.lang.String key,java.lang.String cursor) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sscan(key,cursor);
        } else {
            throw new JedisConnectionException("Cannot execute sscan with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.resps.ScanResult sscan(byte[] key,byte[] cursor) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sscan(key,cursor);
        } else {
            throw new JedisConnectionException("Cannot execute sscan with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.resps.ScanResult sscan(java.lang.String key,java.lang.String cursor,redis.clients.jedis.params.ScanParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sscan(key,cursor,params);
        } else {
            throw new JedisConnectionException("Cannot execute sscan with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.resps.ScanResult sscan(byte[] key,byte[] cursor,redis.clients.jedis.params.ScanParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sscan(key,cursor,params);
        } else {
            throw new JedisConnectionException("Cannot execute sscan with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.resps.LCSMatchResult strAlgoLCSKeys(java.lang.String keyA,java.lang.String keyB,redis.clients.jedis.params.StrAlgoLCSParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.strAlgoLCSKeys(keyA,keyB,params);
        } else {
            throw new JedisConnectionException("Cannot execute strAlgoLCSKeys with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.resps.LCSMatchResult strAlgoLCSKeys(byte[] keyA,byte[] keyB,redis.clients.jedis.params.StrAlgoLCSParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.strAlgoLCSKeys(keyA,keyB,params);
        } else {
            throw new JedisConnectionException("Cannot execute strAlgoLCSKeys with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.resps.LCSMatchResult strAlgoLCSStrings(byte[] strA,byte[] strB,redis.clients.jedis.params.StrAlgoLCSParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.strAlgoLCSStrings(strA,strB,params);
        } else {
            throw new JedisConnectionException("Cannot execute strAlgoLCSStrings with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.resps.LCSMatchResult strAlgoLCSStrings(java.lang.String strA,java.lang.String strB,redis.clients.jedis.params.StrAlgoLCSParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.strAlgoLCSStrings(strA,strB,params);
        } else {
            throw new JedisConnectionException("Cannot execute strAlgoLCSStrings with sharded instance.");
        }
    }
    
    public static long strlen(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.strlen(key);
        } else {
            throw new JedisConnectionException("Cannot execute strlen with sharded instance.");
        }
    }
    
    public static long strlen(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.strlen(key);
        } else {
            throw new JedisConnectionException("Cannot execute strlen with sharded instance.");
        }
    }
    
    public static void subscribe(redis.clients.jedis.BinaryJedisPubSub jedisPubSub,byte[][] channels) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            jedis.subscribe(jedisPubSub,channels);
        } else {
            throw new JedisConnectionException("Cannot execute subscribe with sharded instance.");
        }
    }
    
    public static void subscribe(redis.clients.jedis.JedisPubSub jedisPubSub,java.lang.String[] channels) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            jedis.subscribe(jedisPubSub,channels);
        } else {
            throw new JedisConnectionException("Cannot execute subscribe with sharded instance.");
        }
    }
    
    public static java.lang.String substr(java.lang.String key,int start,int end) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.substr(key,start,end);
        } else {
            throw new JedisConnectionException("Cannot execute substr with sharded instance.");
        }
    }
    
    public static byte[] substr(byte[] key,int start,int end) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.substr(key,start,end);
        } else {
            throw new JedisConnectionException("Cannot execute substr with sharded instance.");
        }
    }
    
    public static java.util.Set sunion(byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sunion(keys);
        } else {
            throw new JedisConnectionException("Cannot execute sunion with sharded instance.");
        }
    }
    
    public static java.util.Set sunion(java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sunion(keys);
        } else {
            throw new JedisConnectionException("Cannot execute sunion with sharded instance.");
        }
    }
    
    public static long sunionstore(byte[] dstkey,byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sunionstore(dstkey,keys);
        } else {
            throw new JedisConnectionException("Cannot execute sunionstore with sharded instance.");
        }
    }
    
    public static long sunionstore(java.lang.String dstkey,java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sunionstore(dstkey,keys);
        } else {
            throw new JedisConnectionException("Cannot execute sunionstore with sharded instance.");
        }
    }
    
    public static java.lang.String swapDB(int index1,int index2) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.swapDB(index1,index2);
        } else {
            throw new JedisConnectionException("Cannot execute swapDB with sharded instance.");
        }
    }
    
    public static java.util.List time() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.time();
        } else {
            throw new JedisConnectionException("Cannot execute time with sharded instance.");
        }
    }
    
    public static long touch(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.touch(key);
        } else {
            throw new JedisConnectionException("Cannot execute touch with sharded instance.");
        }
    }
    
    public static long touch(byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.touch(keys);
        } else {
            throw new JedisConnectionException("Cannot execute touch with sharded instance.");
        }
    }
    
    public static long touch(java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.touch(keys);
        } else {
            throw new JedisConnectionException("Cannot execute touch with sharded instance.");
        }
    }
    
    public static long touch(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.touch(key);
        } else {
            throw new JedisConnectionException("Cannot execute touch with sharded instance.");
        }
    }
    
    public static long ttl(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.ttl(key);
        } else {
            throw new JedisConnectionException("Cannot execute ttl with sharded instance.");
        }
    }
    
    public static long ttl(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.ttl(key);
        } else {
            throw new JedisConnectionException("Cannot execute ttl with sharded instance.");
        }
    }
    
    public static java.lang.String type(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.type(key);
        } else {
            throw new JedisConnectionException("Cannot execute type with sharded instance.");
        }
    }
    
    public static java.lang.String type(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.type(key);
        } else {
            throw new JedisConnectionException("Cannot execute type with sharded instance.");
        }
    }
    
    public static long unlink(byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.unlink(keys);
        } else {
            throw new JedisConnectionException("Cannot execute unlink with sharded instance.");
        }
    }
    
    public static long unlink(java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.unlink(keys);
        } else {
            throw new JedisConnectionException("Cannot execute unlink with sharded instance.");
        }
    }
    
    public static long unlink(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.unlink(key);
        } else {
            throw new JedisConnectionException("Cannot execute unlink with sharded instance.");
        }
    }
    
    public static long unlink(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.unlink(key);
        } else {
            throw new JedisConnectionException("Cannot execute unlink with sharded instance.");
        }
    }
    
    public static java.lang.String unwatch() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.unwatch();
        } else {
            throw new JedisConnectionException("Cannot execute unwatch with sharded instance.");
        }
    }
    
    public static long waitReplicas(int replicas,long timeout) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.waitReplicas(replicas,timeout);
        } else {
            throw new JedisConnectionException("Cannot execute waitReplicas with sharded instance.");
        }
    }
    
    public static java.lang.String watch(byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.watch(keys);
        } else {
            throw new JedisConnectionException("Cannot execute watch with sharded instance.");
        }
    }
    
    public static java.lang.String watch(java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.watch(keys);
        } else {
            throw new JedisConnectionException("Cannot execute watch with sharded instance.");
        }
    }
    
    public static long xack(byte[] key,byte[] group,byte[][] ids) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xack(key,group,ids);
        } else {
            throw new JedisConnectionException("Cannot execute xack with sharded instance.");
        }
    }
    
    public static long xack(java.lang.String key,java.lang.String group,redis.clients.jedis.StreamEntryID[] ids) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xack(key,group,ids);
        } else {
            throw new JedisConnectionException("Cannot execute xack with sharded instance.");
        }
    }
    
    public static byte[] xadd(byte[] key,java.util.Map hash,redis.clients.jedis.params.XAddParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xadd(key,hash,params);
        } else {
            throw new JedisConnectionException("Cannot execute xadd with sharded instance.");
        }
    }
    
    public static byte[] xadd(byte[] key,redis.clients.jedis.params.XAddParams params,java.util.Map hash) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xadd(key,params,hash);
        } else {
            throw new JedisConnectionException("Cannot execute xadd with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.StreamEntryID xadd(java.lang.String key,redis.clients.jedis.params.XAddParams params,java.util.Map hash) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xadd(key,params,hash);
        } else {
            throw new JedisConnectionException("Cannot execute xadd with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.StreamEntryID xadd(java.lang.String key,redis.clients.jedis.StreamEntryID id,java.util.Map hash) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xadd(key,id,hash);
        } else {
            throw new JedisConnectionException("Cannot execute xadd with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.StreamEntryID xadd(java.lang.String key,java.util.Map hash,redis.clients.jedis.params.XAddParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xadd(key,hash,params);
        } else {
            throw new JedisConnectionException("Cannot execute xadd with sharded instance.");
        }
    }
    
    public static java.util.List xautoclaim(byte[] key,byte[] groupName,byte[] consumerName,long minIdleTime,byte[] start,redis.clients.jedis.params.XAutoClaimParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xautoclaim(key,groupName,consumerName,minIdleTime,start,params);
        } else {
            throw new JedisConnectionException("Cannot execute xautoclaim with sharded instance.");
        }
    }
    
    public static java.util.Map.Entry xautoclaim(java.lang.String key,java.lang.String group,java.lang.String consumerName,long minIdleTime,redis.clients.jedis.StreamEntryID start,redis.clients.jedis.params.XAutoClaimParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xautoclaim(key,group,consumerName,minIdleTime,start,params);
        } else {
            throw new JedisConnectionException("Cannot execute xautoclaim with sharded instance.");
        }
    }
    
    public static java.util.List xautoclaimJustId(byte[] key,byte[] groupName,byte[] consumerName,long minIdleTime,byte[] start,redis.clients.jedis.params.XAutoClaimParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xautoclaimJustId(key,groupName,consumerName,minIdleTime,start,params);
        } else {
            throw new JedisConnectionException("Cannot execute xautoclaimJustId with sharded instance.");
        }
    }
    
    public static java.util.Map.Entry xautoclaimJustId(java.lang.String key,java.lang.String group,java.lang.String consumerName,long minIdleTime,redis.clients.jedis.StreamEntryID start,redis.clients.jedis.params.XAutoClaimParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xautoclaimJustId(key,group,consumerName,minIdleTime,start,params);
        } else {
            throw new JedisConnectionException("Cannot execute xautoclaimJustId with sharded instance.");
        }
    }
    
    public static java.util.List xclaim(java.lang.String key,java.lang.String group,java.lang.String consumerName,long minIdleTime,redis.clients.jedis.params.XClaimParams params,redis.clients.jedis.StreamEntryID[] ids) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xclaim(key,group,consumerName,minIdleTime,params,ids);
        } else {
            throw new JedisConnectionException("Cannot execute xclaim with sharded instance.");
        }
    }
    
    public static java.util.List xclaim(byte[] key,byte[] group,byte[] consumerName,long minIdleTime,redis.clients.jedis.params.XClaimParams params,byte[][] ids) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xclaim(key,group,consumerName,minIdleTime,params,ids);
        } else {
            throw new JedisConnectionException("Cannot execute xclaim with sharded instance.");
        }
    }
    
    public static java.util.List xclaimJustId(java.lang.String key,java.lang.String group,java.lang.String consumerName,long minIdleTime,redis.clients.jedis.params.XClaimParams params,redis.clients.jedis.StreamEntryID[] ids) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xclaimJustId(key,group,consumerName,minIdleTime,params,ids);
        } else {
            throw new JedisConnectionException("Cannot execute xclaimJustId with sharded instance.");
        }
    }
    
    public static java.util.List xclaimJustId(byte[] key,byte[] group,byte[] consumerName,long minIdleTime,redis.clients.jedis.params.XClaimParams params,byte[][] ids) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xclaimJustId(key,group,consumerName,minIdleTime,params,ids);
        } else {
            throw new JedisConnectionException("Cannot execute xclaimJustId with sharded instance.");
        }
    }
    
    public static long xdel(byte[] key,byte[][] ids) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xdel(key,ids);
        } else {
            throw new JedisConnectionException("Cannot execute xdel with sharded instance.");
        }
    }
    
    public static long xdel(java.lang.String key,redis.clients.jedis.StreamEntryID[] ids) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xdel(key,ids);
        } else {
            throw new JedisConnectionException("Cannot execute xdel with sharded instance.");
        }
    }
    
    public static java.lang.String xgroupCreate(byte[] key,byte[] consumer,byte[] id,boolean makeStream) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xgroupCreate(key,consumer,id,makeStream);
        } else {
            throw new JedisConnectionException("Cannot execute xgroupCreate with sharded instance.");
        }
    }
    
    public static java.lang.String xgroupCreate(java.lang.String key,java.lang.String groupName,redis.clients.jedis.StreamEntryID id,boolean makeStream) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xgroupCreate(key,groupName,id,makeStream);
        } else {
            throw new JedisConnectionException("Cannot execute xgroupCreate with sharded instance.");
        }
    }
    
    public static boolean xgroupCreateConsumer(byte[] key,byte[] groupName,byte[] consumerName) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xgroupCreateConsumer(key,groupName,consumerName);
        } else {
            throw new JedisConnectionException("Cannot execute xgroupCreateConsumer with sharded instance.");
        }
    }
    
    public static boolean xgroupCreateConsumer(java.lang.String key,java.lang.String groupName,java.lang.String consumerName) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xgroupCreateConsumer(key,groupName,consumerName);
        } else {
            throw new JedisConnectionException("Cannot execute xgroupCreateConsumer with sharded instance.");
        }
    }
    
    public static long xgroupDelConsumer(byte[] key,byte[] groupName,byte[] consumerName) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xgroupDelConsumer(key,groupName,consumerName);
        } else {
            throw new JedisConnectionException("Cannot execute xgroupDelConsumer with sharded instance.");
        }
    }
    
    public static long xgroupDelConsumer(java.lang.String key,java.lang.String groupName,java.lang.String consumerName) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xgroupDelConsumer(key,groupName,consumerName);
        } else {
            throw new JedisConnectionException("Cannot execute xgroupDelConsumer with sharded instance.");
        }
    }
    
    public static long xgroupDestroy(java.lang.String key,java.lang.String groupName) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xgroupDestroy(key,groupName);
        } else {
            throw new JedisConnectionException("Cannot execute xgroupDestroy with sharded instance.");
        }
    }
    
    public static long xgroupDestroy(byte[] key,byte[] consumer) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xgroupDestroy(key,consumer);
        } else {
            throw new JedisConnectionException("Cannot execute xgroupDestroy with sharded instance.");
        }
    }
    
    public static java.lang.String xgroupSetID(java.lang.String key,java.lang.String groupName,redis.clients.jedis.StreamEntryID id) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xgroupSetID(key,groupName,id);
        } else {
            throw new JedisConnectionException("Cannot execute xgroupSetID with sharded instance.");
        }
    }
    
    public static java.lang.String xgroupSetID(byte[] key,byte[] consumer,byte[] id) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xgroupSetID(key,consumer,id);
        } else {
            throw new JedisConnectionException("Cannot execute xgroupSetID with sharded instance.");
        }
    }
    
    public static java.util.List xinfoConsumers(byte[] key,byte[] group) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xinfoConsumers(key,group);
        } else {
            throw new JedisConnectionException("Cannot execute xinfoConsumers with sharded instance.");
        }
    }
    
    public static java.util.List xinfoConsumers(java.lang.String key,java.lang.String group) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xinfoConsumers(key,group);
        } else {
            throw new JedisConnectionException("Cannot execute xinfoConsumers with sharded instance.");
        }
    }
    
    public static java.util.List xinfoGroup(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xinfoGroup(key);
        } else {
            throw new JedisConnectionException("Cannot execute xinfoGroup with sharded instance.");
        }
    }
    
    public static java.util.List xinfoGroup(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xinfoGroup(key);
        } else {
            throw new JedisConnectionException("Cannot execute xinfoGroup with sharded instance.");
        }
    }
    
    public static java.util.List xinfoGroups(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xinfoGroups(key);
        } else {
            throw new JedisConnectionException("Cannot execute xinfoGroups with sharded instance.");
        }
    }
    
    public static java.util.List xinfoGroups(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xinfoGroups(key);
        } else {
            throw new JedisConnectionException("Cannot execute xinfoGroups with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.resps.StreamInfo xinfoStream(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xinfoStream(key);
        } else {
            throw new JedisConnectionException("Cannot execute xinfoStream with sharded instance.");
        }
    }
    
    public static java.lang.Object xinfoStream(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xinfoStream(key);
        } else {
            throw new JedisConnectionException("Cannot execute xinfoStream with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.resps.StreamFullInfo xinfoStreamFull(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xinfoStreamFull(key);
        } else {
            throw new JedisConnectionException("Cannot execute xinfoStreamFull with sharded instance.");
        }
    }
    
    public static java.lang.Object xinfoStreamFull(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xinfoStreamFull(key);
        } else {
            throw new JedisConnectionException("Cannot execute xinfoStreamFull with sharded instance.");
        }
    }
    
    public static java.lang.Object xinfoStreamFull(byte[] key,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xinfoStreamFull(key,count);
        } else {
            throw new JedisConnectionException("Cannot execute xinfoStreamFull with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.resps.StreamFullInfo xinfoStreamFull(java.lang.String key,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xinfoStreamFull(key,count);
        } else {
            throw new JedisConnectionException("Cannot execute xinfoStreamFull with sharded instance.");
        }
    }
    
    public static long xlen(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xlen(key);
        } else {
            throw new JedisConnectionException("Cannot execute xlen with sharded instance.");
        }
    }
    
    public static long xlen(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xlen(key);
        } else {
            throw new JedisConnectionException("Cannot execute xlen with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.resps.StreamPendingSummary xpending(java.lang.String key,java.lang.String groupName) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xpending(key,groupName);
        } else {
            throw new JedisConnectionException("Cannot execute xpending with sharded instance.");
        }
    }
    
    public static java.lang.Object xpending(byte[] key,byte[] groupName) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xpending(key,groupName);
        } else {
            throw new JedisConnectionException("Cannot execute xpending with sharded instance.");
        }
    }
    
    public static java.util.List xpending(byte[] key,byte[] groupName,redis.clients.jedis.params.XPendingParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xpending(key,groupName,params);
        } else {
            throw new JedisConnectionException("Cannot execute xpending with sharded instance.");
        }
    }
    
    public static java.util.List xpending(java.lang.String key,java.lang.String groupName,redis.clients.jedis.params.XPendingParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xpending(key,groupName,params);
        } else {
            throw new JedisConnectionException("Cannot execute xpending with sharded instance.");
        }
    }
    
    public static java.util.List xpending(byte[] key,byte[] groupName,byte[] start,byte[] end,int count,byte[] consumerName) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xpending(key,groupName,start,end,count,consumerName);
        } else {
            throw new JedisConnectionException("Cannot execute xpending with sharded instance.");
        }
    }
    
    public static java.util.List xpending(java.lang.String key,java.lang.String groupName,redis.clients.jedis.StreamEntryID start,redis.clients.jedis.StreamEntryID end,int count,java.lang.String consumerName) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xpending(key,groupName,start,end,count,consumerName);
        } else {
            throw new JedisConnectionException("Cannot execute xpending with sharded instance.");
        }
    }
    
    public static java.util.List xrange(byte[] key,byte[] start,byte[] end) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xrange(key,start,end);
        } else {
            throw new JedisConnectionException("Cannot execute xrange with sharded instance.");
        }
    }
    
    public static java.util.List xrange(java.lang.String key,java.lang.String start,java.lang.String end) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xrange(key,start,end);
        } else {
            throw new JedisConnectionException("Cannot execute xrange with sharded instance.");
        }
    }
    
    public static java.util.List xrange(java.lang.String key,redis.clients.jedis.StreamEntryID start,redis.clients.jedis.StreamEntryID end) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xrange(key,start,end);
        } else {
            throw new JedisConnectionException("Cannot execute xrange with sharded instance.");
        }
    }
    
    public static java.util.List xrange(java.lang.String key,redis.clients.jedis.StreamEntryID start,redis.clients.jedis.StreamEntryID end,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xrange(key,start,end,count);
        } else {
            throw new JedisConnectionException("Cannot execute xrange with sharded instance.");
        }
    }
    
    public static java.util.List xrange(java.lang.String key,java.lang.String start,java.lang.String end,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xrange(key,start,end,count);
        } else {
            throw new JedisConnectionException("Cannot execute xrange with sharded instance.");
        }
    }
    
    public static java.util.List xrange(byte[] key,byte[] start,byte[] end,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xrange(key,start,end,count);
        } else {
            throw new JedisConnectionException("Cannot execute xrange with sharded instance.");
        }
    }
    
    public static java.util.List xread(redis.clients.jedis.params.XReadParams xReadParams,java.util.Map streams) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xread(xReadParams,streams);
        } else {
            throw new JedisConnectionException("Cannot execute xread with sharded instance.");
        }
    }
    
    public static java.util.List xread(redis.clients.jedis.params.XReadParams xReadParams,java.util.Map.Entry[] streams) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xread(xReadParams,streams);
        } else {
            throw new JedisConnectionException("Cannot execute xread with sharded instance.");
        }
    }
    
    public static java.util.List xreadGroup(byte[] groupName,byte[] consumer,redis.clients.jedis.params.XReadGroupParams xReadGroupParams,java.util.Map.Entry[] streams) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xreadGroup(groupName,consumer,xReadGroupParams,streams);
        } else {
            throw new JedisConnectionException("Cannot execute xreadGroup with sharded instance.");
        }
    }
    
    public static java.util.List xreadGroup(java.lang.String groupName,java.lang.String consumer,redis.clients.jedis.params.XReadGroupParams xReadGroupParams,java.util.Map streams) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xreadGroup(groupName,consumer,xReadGroupParams,streams);
        } else {
            throw new JedisConnectionException("Cannot execute xreadGroup with sharded instance.");
        }
    }
    
    public static java.util.List xrevrange(java.lang.String key,java.lang.String end,java.lang.String start) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xrevrange(key,end,start);
        } else {
            throw new JedisConnectionException("Cannot execute xrevrange with sharded instance.");
        }
    }
    
    public static java.util.List xrevrange(java.lang.String key,redis.clients.jedis.StreamEntryID end,redis.clients.jedis.StreamEntryID start) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xrevrange(key,end,start);
        } else {
            throw new JedisConnectionException("Cannot execute xrevrange with sharded instance.");
        }
    }
    
    public static java.util.List xrevrange(byte[] key,byte[] end,byte[] start) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xrevrange(key,end,start);
        } else {
            throw new JedisConnectionException("Cannot execute xrevrange with sharded instance.");
        }
    }
    
    public static java.util.List xrevrange(java.lang.String key,redis.clients.jedis.StreamEntryID end,redis.clients.jedis.StreamEntryID start,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xrevrange(key,end,start,count);
        } else {
            throw new JedisConnectionException("Cannot execute xrevrange with sharded instance.");
        }
    }
    
    public static java.util.List xrevrange(byte[] key,byte[] end,byte[] start,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xrevrange(key,end,start,count);
        } else {
            throw new JedisConnectionException("Cannot execute xrevrange with sharded instance.");
        }
    }
    
    public static java.util.List xrevrange(java.lang.String key,java.lang.String end,java.lang.String start,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xrevrange(key,end,start,count);
        } else {
            throw new JedisConnectionException("Cannot execute xrevrange with sharded instance.");
        }
    }
    
    public static long xtrim(byte[] key,redis.clients.jedis.params.XTrimParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xtrim(key,params);
        } else {
            throw new JedisConnectionException("Cannot execute xtrim with sharded instance.");
        }
    }
    
    public static long xtrim(java.lang.String key,redis.clients.jedis.params.XTrimParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xtrim(key,params);
        } else {
            throw new JedisConnectionException("Cannot execute xtrim with sharded instance.");
        }
    }
    
    public static long xtrim(java.lang.String key,long maxLen,boolean approximateLength) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xtrim(key,maxLen,approximateLength);
        } else {
            throw new JedisConnectionException("Cannot execute xtrim with sharded instance.");
        }
    }
    
    public static long xtrim(byte[] key,long maxLen,boolean approximateLength) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.xtrim(key,maxLen,approximateLength);
        } else {
            throw new JedisConnectionException("Cannot execute xtrim with sharded instance.");
        }
    }
    
    public static long zadd(byte[] key,java.util.Map scoreMembers) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zadd(key,scoreMembers);
        } else {
            throw new JedisConnectionException("Cannot execute zadd with sharded instance.");
        }
    }
    
    public static long zadd(java.lang.String key,java.util.Map scoreMembers) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zadd(key,scoreMembers);
        } else {
            throw new JedisConnectionException("Cannot execute zadd with sharded instance.");
        }
    }
    
    public static long zadd(byte[] key,java.util.Map scoreMembers,redis.clients.jedis.params.ZAddParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zadd(key,scoreMembers,params);
        } else {
            throw new JedisConnectionException("Cannot execute zadd with sharded instance.");
        }
    }
    
    public static long zadd(java.lang.String key,double score,java.lang.String member) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zadd(key,score,member);
        } else {
            throw new JedisConnectionException("Cannot execute zadd with sharded instance.");
        }
    }
    
    public static long zadd(byte[] key,double score,byte[] member) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zadd(key,score,member);
        } else {
            throw new JedisConnectionException("Cannot execute zadd with sharded instance.");
        }
    }
    
    public static long zadd(java.lang.String key,java.util.Map scoreMembers,redis.clients.jedis.params.ZAddParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zadd(key,scoreMembers,params);
        } else {
            throw new JedisConnectionException("Cannot execute zadd with sharded instance.");
        }
    }
    
    public static long zadd(byte[] key,double score,byte[] member,redis.clients.jedis.params.ZAddParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zadd(key,score,member,params);
        } else {
            throw new JedisConnectionException("Cannot execute zadd with sharded instance.");
        }
    }
    
    public static long zadd(java.lang.String key,double score,java.lang.String member,redis.clients.jedis.params.ZAddParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zadd(key,score,member,params);
        } else {
            throw new JedisConnectionException("Cannot execute zadd with sharded instance.");
        }
    }
    
    public static java.lang.Double zaddIncr(byte[] key,double score,byte[] member,redis.clients.jedis.params.ZAddParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zaddIncr(key,score,member,params);
        } else {
            throw new JedisConnectionException("Cannot execute zaddIncr with sharded instance.");
        }
    }
    
    public static java.lang.Double zaddIncr(java.lang.String key,double score,java.lang.String member,redis.clients.jedis.params.ZAddParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zaddIncr(key,score,member,params);
        } else {
            throw new JedisConnectionException("Cannot execute zaddIncr with sharded instance.");
        }
    }
    
    public static long zcard(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zcard(key);
        } else {
            throw new JedisConnectionException("Cannot execute zcard with sharded instance.");
        }
    }
    
    public static long zcard(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zcard(key);
        } else {
            throw new JedisConnectionException("Cannot execute zcard with sharded instance.");
        }
    }
    
    public static long zcount(java.lang.String key,double min,double max) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zcount(key,min,max);
        } else {
            throw new JedisConnectionException("Cannot execute zcount with sharded instance.");
        }
    }
    
    public static long zcount(byte[] key,byte[] min,byte[] max) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zcount(key,min,max);
        } else {
            throw new JedisConnectionException("Cannot execute zcount with sharded instance.");
        }
    }
    
    public static long zcount(java.lang.String key,java.lang.String min,java.lang.String max) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zcount(key,min,max);
        } else {
            throw new JedisConnectionException("Cannot execute zcount with sharded instance.");
        }
    }
    
    public static long zcount(byte[] key,double min,double max) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zcount(key,min,max);
        } else {
            throw new JedisConnectionException("Cannot execute zcount with sharded instance.");
        }
    }
    
    public static java.util.Set zdiff(java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zdiff(keys);
        } else {
            throw new JedisConnectionException("Cannot execute zdiff with sharded instance.");
        }
    }
    
    public static java.util.Set zdiff(byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zdiff(keys);
        } else {
            throw new JedisConnectionException("Cannot execute zdiff with sharded instance.");
        }
    }
    
    public static long zdiffStore(byte[] dstkey,byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zdiffStore(dstkey,keys);
        } else {
            throw new JedisConnectionException("Cannot execute zdiffStore with sharded instance.");
        }
    }
    
    public static long zdiffStore(java.lang.String dstkey,java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zdiffStore(dstkey,keys);
        } else {
            throw new JedisConnectionException("Cannot execute zdiffStore with sharded instance.");
        }
    }
    
    public static java.util.Set zdiffWithScores(byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zdiffWithScores(keys);
        } else {
            throw new JedisConnectionException("Cannot execute zdiffWithScores with sharded instance.");
        }
    }
    
    public static java.util.Set zdiffWithScores(java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zdiffWithScores(keys);
        } else {
            throw new JedisConnectionException("Cannot execute zdiffWithScores with sharded instance.");
        }
    }
    
    public static double zincrby(java.lang.String key,double increment,java.lang.String member) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zincrby(key,increment,member);
        } else {
            throw new JedisConnectionException("Cannot execute zincrby with sharded instance.");
        }
    }
    
    public static double zincrby(byte[] key,double increment,byte[] member) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zincrby(key,increment,member);
        } else {
            throw new JedisConnectionException("Cannot execute zincrby with sharded instance.");
        }
    }
    
    public static java.lang.Double zincrby(byte[] key,double increment,byte[] member,redis.clients.jedis.params.ZIncrByParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zincrby(key,increment,member,params);
        } else {
            throw new JedisConnectionException("Cannot execute zincrby with sharded instance.");
        }
    }
    
    public static java.lang.Double zincrby(java.lang.String key,double increment,java.lang.String member,redis.clients.jedis.params.ZIncrByParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zincrby(key,increment,member,params);
        } else {
            throw new JedisConnectionException("Cannot execute zincrby with sharded instance.");
        }
    }
    
    public static java.util.Set zinter(redis.clients.jedis.params.ZParams params,byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zinter(params,keys);
        } else {
            throw new JedisConnectionException("Cannot execute zinter with sharded instance.");
        }
    }
    
    public static java.util.Set zinter(redis.clients.jedis.params.ZParams params,java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zinter(params,keys);
        } else {
            throw new JedisConnectionException("Cannot execute zinter with sharded instance.");
        }
    }
    
    public static java.util.Set zinterWithScores(redis.clients.jedis.params.ZParams params,java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zinterWithScores(params,keys);
        } else {
            throw new JedisConnectionException("Cannot execute zinterWithScores with sharded instance.");
        }
    }
    
    public static java.util.Set zinterWithScores(redis.clients.jedis.params.ZParams params,byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zinterWithScores(params,keys);
        } else {
            throw new JedisConnectionException("Cannot execute zinterWithScores with sharded instance.");
        }
    }
    
    public static long zintercard(byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zintercard(keys);
        } else {
            throw new JedisConnectionException("Cannot execute zintercard with sharded instance.");
        }
    }
    
    public static long zintercard(java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zintercard(keys);
        } else {
            throw new JedisConnectionException("Cannot execute zintercard with sharded instance.");
        }
    }
    
    public static long zintercard(long limit,java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zintercard(limit,keys);
        } else {
            throw new JedisConnectionException("Cannot execute zintercard with sharded instance.");
        }
    }
    
    public static long zintercard(long limit,byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zintercard(limit,keys);
        } else {
            throw new JedisConnectionException("Cannot execute zintercard with sharded instance.");
        }
    }
    
    public static long zinterstore(byte[] dstkey,byte[][] sets) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zinterstore(dstkey,sets);
        } else {
            throw new JedisConnectionException("Cannot execute zinterstore with sharded instance.");
        }
    }
    
    public static long zinterstore(java.lang.String dstkey,java.lang.String[] sets) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zinterstore(dstkey,sets);
        } else {
            throw new JedisConnectionException("Cannot execute zinterstore with sharded instance.");
        }
    }
    
    public static long zinterstore(java.lang.String dstkey,redis.clients.jedis.params.ZParams params,java.lang.String[] sets) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zinterstore(dstkey,params,sets);
        } else {
            throw new JedisConnectionException("Cannot execute zinterstore with sharded instance.");
        }
    }
    
    public static long zinterstore(byte[] dstkey,redis.clients.jedis.params.ZParams params,byte[][] sets) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zinterstore(dstkey,params,sets);
        } else {
            throw new JedisConnectionException("Cannot execute zinterstore with sharded instance.");
        }
    }
    
    public static long zlexcount(java.lang.String key,java.lang.String min,java.lang.String max) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zlexcount(key,min,max);
        } else {
            throw new JedisConnectionException("Cannot execute zlexcount with sharded instance.");
        }
    }
    
    public static long zlexcount(byte[] key,byte[] min,byte[] max) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zlexcount(key,min,max);
        } else {
            throw new JedisConnectionException("Cannot execute zlexcount with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.util.KeyValue zmpop(redis.clients.jedis.args.SortedSetOption option,byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zmpop(option,keys);
        } else {
            throw new JedisConnectionException("Cannot execute zmpop with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.util.KeyValue zmpop(redis.clients.jedis.args.SortedSetOption option,java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zmpop(option,keys);
        } else {
            throw new JedisConnectionException("Cannot execute zmpop with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.util.KeyValue zmpop(redis.clients.jedis.args.SortedSetOption option,int count,byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zmpop(option,count,keys);
        } else {
            throw new JedisConnectionException("Cannot execute zmpop with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.util.KeyValue zmpop(redis.clients.jedis.args.SortedSetOption option,int count,java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zmpop(option,count,keys);
        } else {
            throw new JedisConnectionException("Cannot execute zmpop with sharded instance.");
        }
    }
    
    public static java.util.List zmscore(java.lang.String key,java.lang.String[] members) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zmscore(key,members);
        } else {
            throw new JedisConnectionException("Cannot execute zmscore with sharded instance.");
        }
    }
    
    public static java.util.List zmscore(byte[] key,byte[][] members) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zmscore(key,members);
        } else {
            throw new JedisConnectionException("Cannot execute zmscore with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.resps.Tuple zpopmax(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zpopmax(key);
        } else {
            throw new JedisConnectionException("Cannot execute zpopmax with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.resps.Tuple zpopmax(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zpopmax(key);
        } else {
            throw new JedisConnectionException("Cannot execute zpopmax with sharded instance.");
        }
    }
    
    public static java.util.List zpopmax(byte[] key,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zpopmax(key,count);
        } else {
            throw new JedisConnectionException("Cannot execute zpopmax with sharded instance.");
        }
    }
    
    public static java.util.List zpopmax(java.lang.String key,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zpopmax(key,count);
        } else {
            throw new JedisConnectionException("Cannot execute zpopmax with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.resps.Tuple zpopmin(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zpopmin(key);
        } else {
            throw new JedisConnectionException("Cannot execute zpopmin with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.resps.Tuple zpopmin(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zpopmin(key);
        } else {
            throw new JedisConnectionException("Cannot execute zpopmin with sharded instance.");
        }
    }
    
    public static java.util.List zpopmin(byte[] key,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zpopmin(key,count);
        } else {
            throw new JedisConnectionException("Cannot execute zpopmin with sharded instance.");
        }
    }
    
    public static java.util.List zpopmin(java.lang.String key,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zpopmin(key,count);
        } else {
            throw new JedisConnectionException("Cannot execute zpopmin with sharded instance.");
        }
    }
    
    public static byte[] zrandmember(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrandmember(key);
        } else {
            throw new JedisConnectionException("Cannot execute zrandmember with sharded instance.");
        }
    }
    
    public static java.lang.String zrandmember(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrandmember(key);
        } else {
            throw new JedisConnectionException("Cannot execute zrandmember with sharded instance.");
        }
    }
    
    public static java.util.List zrandmember(java.lang.String key,long count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrandmember(key,count);
        } else {
            throw new JedisConnectionException("Cannot execute zrandmember with sharded instance.");
        }
    }
    
    public static java.util.List zrandmember(byte[] key,long count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrandmember(key,count);
        } else {
            throw new JedisConnectionException("Cannot execute zrandmember with sharded instance.");
        }
    }
    
    public static java.util.List zrandmemberWithScores(java.lang.String key,long count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrandmemberWithScores(key,count);
        } else {
            throw new JedisConnectionException("Cannot execute zrandmemberWithScores with sharded instance.");
        }
    }
    
    public static java.util.List zrandmemberWithScores(byte[] key,long count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrandmemberWithScores(key,count);
        } else {
            throw new JedisConnectionException("Cannot execute zrandmemberWithScores with sharded instance.");
        }
    }
    
    public static java.util.List zrange(byte[] key,redis.clients.jedis.params.ZRangeParams zRangeParams) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrange(key,zRangeParams);
        } else {
            throw new JedisConnectionException("Cannot execute zrange with sharded instance.");
        }
    }
    
    public static java.util.List zrange(java.lang.String key,redis.clients.jedis.params.ZRangeParams zRangeParams) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrange(key,zRangeParams);
        } else {
            throw new JedisConnectionException("Cannot execute zrange with sharded instance.");
        }
    }
    
    public static java.util.List zrange(byte[] key,long start,long stop) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrange(key,start,stop);
        } else {
            throw new JedisConnectionException("Cannot execute zrange with sharded instance.");
        }
    }
    
    public static java.util.List zrange(java.lang.String key,long start,long stop) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrange(key,start,stop);
        } else {
            throw new JedisConnectionException("Cannot execute zrange with sharded instance.");
        }
    }
    
    public static java.util.List zrangeByLex(byte[] key,byte[] min,byte[] max) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrangeByLex(key,min,max);
        } else {
            throw new JedisConnectionException("Cannot execute zrangeByLex with sharded instance.");
        }
    }
    
    public static java.util.List zrangeByLex(java.lang.String key,java.lang.String min,java.lang.String max) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrangeByLex(key,min,max);
        } else {
            throw new JedisConnectionException("Cannot execute zrangeByLex with sharded instance.");
        }
    }
    
    public static java.util.List zrangeByLex(java.lang.String key,java.lang.String min,java.lang.String max,int offset,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrangeByLex(key,min,max,offset,count);
        } else {
            throw new JedisConnectionException("Cannot execute zrangeByLex with sharded instance.");
        }
    }
    
    public static java.util.List zrangeByLex(byte[] key,byte[] min,byte[] max,int offset,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrangeByLex(key,min,max,offset,count);
        } else {
            throw new JedisConnectionException("Cannot execute zrangeByLex with sharded instance.");
        }
    }
    
    public static java.util.List zrangeByScore(java.lang.String key,double min,double max) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrangeByScore(key,min,max);
        } else {
            throw new JedisConnectionException("Cannot execute zrangeByScore with sharded instance.");
        }
    }
    
    public static java.util.List zrangeByScore(byte[] key,byte[] min,byte[] max) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrangeByScore(key,min,max);
        } else {
            throw new JedisConnectionException("Cannot execute zrangeByScore with sharded instance.");
        }
    }
    
    public static java.util.List zrangeByScore(byte[] key,double min,double max) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrangeByScore(key,min,max);
        } else {
            throw new JedisConnectionException("Cannot execute zrangeByScore with sharded instance.");
        }
    }
    
    public static java.util.List zrangeByScore(java.lang.String key,java.lang.String min,java.lang.String max) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrangeByScore(key,min,max);
        } else {
            throw new JedisConnectionException("Cannot execute zrangeByScore with sharded instance.");
        }
    }
    
    public static java.util.List zrangeByScore(byte[] key,byte[] min,byte[] max,int offset,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrangeByScore(key,min,max,offset,count);
        } else {
            throw new JedisConnectionException("Cannot execute zrangeByScore with sharded instance.");
        }
    }
    
    public static java.util.List zrangeByScore(byte[] key,double min,double max,int offset,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrangeByScore(key,min,max,offset,count);
        } else {
            throw new JedisConnectionException("Cannot execute zrangeByScore with sharded instance.");
        }
    }
    
    public static java.util.List zrangeByScore(java.lang.String key,java.lang.String min,java.lang.String max,int offset,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrangeByScore(key,min,max,offset,count);
        } else {
            throw new JedisConnectionException("Cannot execute zrangeByScore with sharded instance.");
        }
    }
    
    public static java.util.List zrangeByScore(java.lang.String key,double min,double max,int offset,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrangeByScore(key,min,max,offset,count);
        } else {
            throw new JedisConnectionException("Cannot execute zrangeByScore with sharded instance.");
        }
    }
    
    public static java.util.List zrangeByScoreWithScores(java.lang.String key,double min,double max) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrangeByScoreWithScores(key,min,max);
        } else {
            throw new JedisConnectionException("Cannot execute zrangeByScoreWithScores with sharded instance.");
        }
    }
    
    public static java.util.List zrangeByScoreWithScores(java.lang.String key,java.lang.String min,java.lang.String max) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrangeByScoreWithScores(key,min,max);
        } else {
            throw new JedisConnectionException("Cannot execute zrangeByScoreWithScores with sharded instance.");
        }
    }
    
    public static java.util.List zrangeByScoreWithScores(byte[] key,double min,double max) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrangeByScoreWithScores(key,min,max);
        } else {
            throw new JedisConnectionException("Cannot execute zrangeByScoreWithScores with sharded instance.");
        }
    }
    
    public static java.util.List zrangeByScoreWithScores(byte[] key,byte[] min,byte[] max) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrangeByScoreWithScores(key,min,max);
        } else {
            throw new JedisConnectionException("Cannot execute zrangeByScoreWithScores with sharded instance.");
        }
    }
    
    public static java.util.List zrangeByScoreWithScores(byte[] key,double min,double max,int offset,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrangeByScoreWithScores(key,min,max,offset,count);
        } else {
            throw new JedisConnectionException("Cannot execute zrangeByScoreWithScores with sharded instance.");
        }
    }
    
    public static java.util.List zrangeByScoreWithScores(java.lang.String key,java.lang.String min,java.lang.String max,int offset,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrangeByScoreWithScores(key,min,max,offset,count);
        } else {
            throw new JedisConnectionException("Cannot execute zrangeByScoreWithScores with sharded instance.");
        }
    }
    
    public static java.util.List zrangeByScoreWithScores(byte[] key,byte[] min,byte[] max,int offset,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrangeByScoreWithScores(key,min,max,offset,count);
        } else {
            throw new JedisConnectionException("Cannot execute zrangeByScoreWithScores with sharded instance.");
        }
    }
    
    public static java.util.List zrangeByScoreWithScores(java.lang.String key,double min,double max,int offset,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrangeByScoreWithScores(key,min,max,offset,count);
        } else {
            throw new JedisConnectionException("Cannot execute zrangeByScoreWithScores with sharded instance.");
        }
    }
    
    public static java.util.List zrangeWithScores(byte[] key,redis.clients.jedis.params.ZRangeParams zRangeParams) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrangeWithScores(key,zRangeParams);
        } else {
            throw new JedisConnectionException("Cannot execute zrangeWithScores with sharded instance.");
        }
    }
    
    public static java.util.List zrangeWithScores(java.lang.String key,redis.clients.jedis.params.ZRangeParams zRangeParams) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrangeWithScores(key,zRangeParams);
        } else {
            throw new JedisConnectionException("Cannot execute zrangeWithScores with sharded instance.");
        }
    }
    
    public static java.util.List zrangeWithScores(java.lang.String key,long start,long stop) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrangeWithScores(key,start,stop);
        } else {
            throw new JedisConnectionException("Cannot execute zrangeWithScores with sharded instance.");
        }
    }
    
    public static java.util.List zrangeWithScores(byte[] key,long start,long stop) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrangeWithScores(key,start,stop);
        } else {
            throw new JedisConnectionException("Cannot execute zrangeWithScores with sharded instance.");
        }
    }
    
    public static long zrangestore(java.lang.String dest,java.lang.String src,redis.clients.jedis.params.ZRangeParams zRangeParams) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrangestore(dest,src,zRangeParams);
        } else {
            throw new JedisConnectionException("Cannot execute zrangestore with sharded instance.");
        }
    }
    
    public static long zrangestore(byte[] dest,byte[] src,redis.clients.jedis.params.ZRangeParams zRangeParams) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrangestore(dest,src,zRangeParams);
        } else {
            throw new JedisConnectionException("Cannot execute zrangestore with sharded instance.");
        }
    }
    
    public static java.lang.Long zrank(java.lang.String key,java.lang.String member) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrank(key,member);
        } else {
            throw new JedisConnectionException("Cannot execute zrank with sharded instance.");
        }
    }
    
    public static java.lang.Long zrank(byte[] key,byte[] member) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrank(key,member);
        } else {
            throw new JedisConnectionException("Cannot execute zrank with sharded instance.");
        }
    }
    
    public static long zrem(byte[] key,byte[][] members) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrem(key,members);
        } else {
            throw new JedisConnectionException("Cannot execute zrem with sharded instance.");
        }
    }
    
    public static long zrem(java.lang.String key,java.lang.String[] members) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrem(key,members);
        } else {
            throw new JedisConnectionException("Cannot execute zrem with sharded instance.");
        }
    }
    
    public static long zremrangeByLex(java.lang.String key,java.lang.String min,java.lang.String max) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zremrangeByLex(key,min,max);
        } else {
            throw new JedisConnectionException("Cannot execute zremrangeByLex with sharded instance.");
        }
    }
    
    public static long zremrangeByLex(byte[] key,byte[] min,byte[] max) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zremrangeByLex(key,min,max);
        } else {
            throw new JedisConnectionException("Cannot execute zremrangeByLex with sharded instance.");
        }
    }
    
    public static long zremrangeByRank(byte[] key,long start,long stop) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zremrangeByRank(key,start,stop);
        } else {
            throw new JedisConnectionException("Cannot execute zremrangeByRank with sharded instance.");
        }
    }
    
    public static long zremrangeByRank(java.lang.String key,long start,long stop) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zremrangeByRank(key,start,stop);
        } else {
            throw new JedisConnectionException("Cannot execute zremrangeByRank with sharded instance.");
        }
    }
    
    public static long zremrangeByScore(java.lang.String key,java.lang.String min,java.lang.String max) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zremrangeByScore(key,min,max);
        } else {
            throw new JedisConnectionException("Cannot execute zremrangeByScore with sharded instance.");
        }
    }
    
    public static long zremrangeByScore(java.lang.String key,double min,double max) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zremrangeByScore(key,min,max);
        } else {
            throw new JedisConnectionException("Cannot execute zremrangeByScore with sharded instance.");
        }
    }
    
    public static long zremrangeByScore(byte[] key,double min,double max) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zremrangeByScore(key,min,max);
        } else {
            throw new JedisConnectionException("Cannot execute zremrangeByScore with sharded instance.");
        }
    }
    
    public static long zremrangeByScore(byte[] key,byte[] min,byte[] max) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zremrangeByScore(key,min,max);
        } else {
            throw new JedisConnectionException("Cannot execute zremrangeByScore with sharded instance.");
        }
    }
    
    public static java.util.List zrevrange(byte[] key,long start,long stop) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrevrange(key,start,stop);
        } else {
            throw new JedisConnectionException("Cannot execute zrevrange with sharded instance.");
        }
    }
    
    public static java.util.List zrevrange(java.lang.String key,long start,long stop) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrevrange(key,start,stop);
        } else {
            throw new JedisConnectionException("Cannot execute zrevrange with sharded instance.");
        }
    }
    
    public static java.util.List zrevrangeByLex(byte[] key,byte[] max,byte[] min) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrevrangeByLex(key,max,min);
        } else {
            throw new JedisConnectionException("Cannot execute zrevrangeByLex with sharded instance.");
        }
    }
    
    public static java.util.List zrevrangeByLex(java.lang.String key,java.lang.String max,java.lang.String min) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrevrangeByLex(key,max,min);
        } else {
            throw new JedisConnectionException("Cannot execute zrevrangeByLex with sharded instance.");
        }
    }
    
    public static java.util.List zrevrangeByLex(java.lang.String key,java.lang.String max,java.lang.String min,int offset,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrevrangeByLex(key,max,min,offset,count);
        } else {
            throw new JedisConnectionException("Cannot execute zrevrangeByLex with sharded instance.");
        }
    }
    
    public static java.util.List zrevrangeByLex(byte[] key,byte[] max,byte[] min,int offset,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrevrangeByLex(key,max,min,offset,count);
        } else {
            throw new JedisConnectionException("Cannot execute zrevrangeByLex with sharded instance.");
        }
    }
    
    public static java.util.List zrevrangeByScore(java.lang.String key,java.lang.String max,java.lang.String min) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrevrangeByScore(key,max,min);
        } else {
            throw new JedisConnectionException("Cannot execute zrevrangeByScore with sharded instance.");
        }
    }
    
    public static java.util.List zrevrangeByScore(java.lang.String key,double max,double min) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrevrangeByScore(key,max,min);
        } else {
            throw new JedisConnectionException("Cannot execute zrevrangeByScore with sharded instance.");
        }
    }
    
    public static java.util.List zrevrangeByScore(byte[] key,byte[] max,byte[] min) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrevrangeByScore(key,max,min);
        } else {
            throw new JedisConnectionException("Cannot execute zrevrangeByScore with sharded instance.");
        }
    }
    
    public static java.util.List zrevrangeByScore(byte[] key,double max,double min) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrevrangeByScore(key,max,min);
        } else {
            throw new JedisConnectionException("Cannot execute zrevrangeByScore with sharded instance.");
        }
    }
    
    public static java.util.List zrevrangeByScore(byte[] key,double max,double min,int offset,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrevrangeByScore(key,max,min,offset,count);
        } else {
            throw new JedisConnectionException("Cannot execute zrevrangeByScore with sharded instance.");
        }
    }
    
    public static java.util.List zrevrangeByScore(java.lang.String key,java.lang.String max,java.lang.String min,int offset,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrevrangeByScore(key,max,min,offset,count);
        } else {
            throw new JedisConnectionException("Cannot execute zrevrangeByScore with sharded instance.");
        }
    }
    
    public static java.util.List zrevrangeByScore(byte[] key,byte[] max,byte[] min,int offset,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrevrangeByScore(key,max,min,offset,count);
        } else {
            throw new JedisConnectionException("Cannot execute zrevrangeByScore with sharded instance.");
        }
    }
    
    public static java.util.List zrevrangeByScore(java.lang.String key,double max,double min,int offset,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrevrangeByScore(key,max,min,offset,count);
        } else {
            throw new JedisConnectionException("Cannot execute zrevrangeByScore with sharded instance.");
        }
    }
    
    public static java.util.List zrevrangeByScoreWithScores(byte[] key,byte[] max,byte[] min) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrevrangeByScoreWithScores(key,max,min);
        } else {
            throw new JedisConnectionException("Cannot execute zrevrangeByScoreWithScores with sharded instance.");
        }
    }
    
    public static java.util.List zrevrangeByScoreWithScores(java.lang.String key,double max,double min) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrevrangeByScoreWithScores(key,max,min);
        } else {
            throw new JedisConnectionException("Cannot execute zrevrangeByScoreWithScores with sharded instance.");
        }
    }
    
    public static java.util.List zrevrangeByScoreWithScores(byte[] key,double max,double min) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrevrangeByScoreWithScores(key,max,min);
        } else {
            throw new JedisConnectionException("Cannot execute zrevrangeByScoreWithScores with sharded instance.");
        }
    }
    
    public static java.util.List zrevrangeByScoreWithScores(java.lang.String key,java.lang.String max,java.lang.String min) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrevrangeByScoreWithScores(key,max,min);
        } else {
            throw new JedisConnectionException("Cannot execute zrevrangeByScoreWithScores with sharded instance.");
        }
    }
    
    public static java.util.List zrevrangeByScoreWithScores(byte[] key,double max,double min,int offset,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrevrangeByScoreWithScores(key,max,min,offset,count);
        } else {
            throw new JedisConnectionException("Cannot execute zrevrangeByScoreWithScores with sharded instance.");
        }
    }
    
    public static java.util.List zrevrangeByScoreWithScores(byte[] key,byte[] max,byte[] min,int offset,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrevrangeByScoreWithScores(key,max,min,offset,count);
        } else {
            throw new JedisConnectionException("Cannot execute zrevrangeByScoreWithScores with sharded instance.");
        }
    }
    
    public static java.util.List zrevrangeByScoreWithScores(java.lang.String key,java.lang.String max,java.lang.String min,int offset,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrevrangeByScoreWithScores(key,max,min,offset,count);
        } else {
            throw new JedisConnectionException("Cannot execute zrevrangeByScoreWithScores with sharded instance.");
        }
    }
    
    public static java.util.List zrevrangeByScoreWithScores(java.lang.String key,double max,double min,int offset,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrevrangeByScoreWithScores(key,max,min,offset,count);
        } else {
            throw new JedisConnectionException("Cannot execute zrevrangeByScoreWithScores with sharded instance.");
        }
    }
    
    public static java.util.List zrevrangeWithScores(byte[] key,long start,long stop) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrevrangeWithScores(key,start,stop);
        } else {
            throw new JedisConnectionException("Cannot execute zrevrangeWithScores with sharded instance.");
        }
    }
    
    public static java.util.List zrevrangeWithScores(java.lang.String key,long start,long stop) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrevrangeWithScores(key,start,stop);
        } else {
            throw new JedisConnectionException("Cannot execute zrevrangeWithScores with sharded instance.");
        }
    }
    
    public static java.lang.Long zrevrank(byte[] key,byte[] member) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrevrank(key,member);
        } else {
            throw new JedisConnectionException("Cannot execute zrevrank with sharded instance.");
        }
    }
    
    public static java.lang.Long zrevrank(java.lang.String key,java.lang.String member) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zrevrank(key,member);
        } else {
            throw new JedisConnectionException("Cannot execute zrevrank with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.resps.ScanResult zscan(java.lang.String key,java.lang.String cursor) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zscan(key,cursor);
        } else {
            throw new JedisConnectionException("Cannot execute zscan with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.resps.ScanResult zscan(byte[] key,byte[] cursor) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zscan(key,cursor);
        } else {
            throw new JedisConnectionException("Cannot execute zscan with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.resps.ScanResult zscan(java.lang.String key,java.lang.String cursor,redis.clients.jedis.params.ScanParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zscan(key,cursor,params);
        } else {
            throw new JedisConnectionException("Cannot execute zscan with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.resps.ScanResult zscan(byte[] key,byte[] cursor,redis.clients.jedis.params.ScanParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zscan(key,cursor,params);
        } else {
            throw new JedisConnectionException("Cannot execute zscan with sharded instance.");
        }
    }
    
    public static java.lang.Double zscore(byte[] key,byte[] member) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zscore(key,member);
        } else {
            throw new JedisConnectionException("Cannot execute zscore with sharded instance.");
        }
    }
    
    public static java.lang.Double zscore(java.lang.String key,java.lang.String member) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zscore(key,member);
        } else {
            throw new JedisConnectionException("Cannot execute zscore with sharded instance.");
        }
    }
    
    public static java.util.Set zunion(redis.clients.jedis.params.ZParams params,java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zunion(params,keys);
        } else {
            throw new JedisConnectionException("Cannot execute zunion with sharded instance.");
        }
    }
    
    public static java.util.Set zunion(redis.clients.jedis.params.ZParams params,byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zunion(params,keys);
        } else {
            throw new JedisConnectionException("Cannot execute zunion with sharded instance.");
        }
    }
    
    public static java.util.Set zunionWithScores(redis.clients.jedis.params.ZParams params,java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zunionWithScores(params,keys);
        } else {
            throw new JedisConnectionException("Cannot execute zunionWithScores with sharded instance.");
        }
    }
    
    public static java.util.Set zunionWithScores(redis.clients.jedis.params.ZParams params,byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zunionWithScores(params,keys);
        } else {
            throw new JedisConnectionException("Cannot execute zunionWithScores with sharded instance.");
        }
    }
    
    public static long zunionstore(java.lang.String dstkey,java.lang.String[] sets) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zunionstore(dstkey,sets);
        } else {
            throw new JedisConnectionException("Cannot execute zunionstore with sharded instance.");
        }
    }
    
    public static long zunionstore(byte[] dstkey,byte[][] sets) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zunionstore(dstkey,sets);
        } else {
            throw new JedisConnectionException("Cannot execute zunionstore with sharded instance.");
        }
    }
    
    public static long zunionstore(java.lang.String dstkey,redis.clients.jedis.params.ZParams params,java.lang.String[] sets) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zunionstore(dstkey,params,sets);
        } else {
            throw new JedisConnectionException("Cannot execute zunionstore with sharded instance.");
        }
    }
    
    public static long zunionstore(byte[] dstkey,redis.clients.jedis.params.ZParams params,byte[][] sets) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zunionstore(dstkey,params,sets);
        } else {
            throw new JedisConnectionException("Cannot execute zunionstore with sharded instance.");
        }
    }
    
}