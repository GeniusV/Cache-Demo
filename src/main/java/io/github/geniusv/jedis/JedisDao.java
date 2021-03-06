package io.github.geniusv.jedis;

import io.github.geniusv.util.LoggerUtil;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.exceptions.JedisConnectionException;

import java.util.Collection;
import java.util.Set;

/**
 * Created by GeniusV on 8/8/17.
 */
public class JedisDao {

    private int dbIndex = 0;

    private JedisPool jedisPool;

    public JedisPool getJedisPool() {
        return jedisPool;
    }

    public void setJedisPool(JedisPool jedisPool) {
        this.jedisPool = jedisPool;
    }

    public int getDbIndex() {
        return dbIndex;
    }

    public void setDbIndex(int dbIndex) {
        this.dbIndex = dbIndex;
    }

    public Jedis getJedis() {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.select(dbIndex);
        } catch (JedisConnectionException e) {
            LoggerUtil.error(getClass(), "get redis error", e);
        }

        return jedis;
    }

    public void returnResource(Jedis jedis) {
        if (jedis == null)
            return;
        jedis.close();
    }

    public byte[] getValueByKey(byte[] key) throws Exception {
        Jedis jedis = null;
        byte[] result = null;
        boolean isBroken = false;
        try {
            jedis = getJedis();
            result = jedis.get(key);
        } catch (Exception e) {
            isBroken = true;
            throw e;
        } finally {
            returnResource(jedis);
        }
        return result;
    }

    public void deleteByKey(byte[] key) throws Exception {
        Jedis jedis = null;
        boolean isBroken = false;
        try {
            jedis = getJedis();
            jedis.del(key);
        } catch (Exception e) {
            isBroken = true;
            throw e;
        } finally {
            returnResource(jedis);
        }
    }

    public void saveValueByKey(byte[] key, byte[] value, int expireTime)
            throws Exception {
        Jedis jedis = null;
        boolean isBroken = false;
        try {
            jedis = getJedis();
            jedis.set(key, value);
            if (expireTime > 0)
                jedis.expire(key, expireTime);
        } catch (Exception e) {
            isBroken = true;
            throw e;
        } finally {
            returnResource(jedis);
        }
    }

    public void flushdb() throws Exception {
        Jedis jedis = null;
        boolean isBroken = false;
        try {
            jedis = getJedis();
            jedis.flushDB();
        } catch (Exception e) {
            isBroken = true;
            throw e;
        } finally {
            returnResource(jedis);
        }
    }

    public Collection<byte[]> getAllKeys(byte[] pattern) {
        Jedis jedis = null;
        Set<byte[]> result = null;
        boolean isBroken = false;
        try {
            jedis = getJedis();
            result = jedis.keys(pattern);
        } catch (Exception e) {
            isBroken = true;
            throw e;
        } finally {
            returnResource(jedis);
        }
        return result;
    }

}
