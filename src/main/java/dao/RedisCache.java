package dao;


import io.github.geniusv.util.LoggerUtil;
import org.apache.ibatis.cache.Cache;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by GeniusV on 8/6/17.
 */
public class RedisCache implements Cache {


    public void setJedisConnectionFactory(JedisConnectionFactory jedisConnectionFactory) {
        this.jedisConnectionFactory = jedisConnectionFactory;
    }

    private JedisConnectionFactory jedisConnectionFactory;

    private final String id;

    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();


    public RedisCache(final String id) {
        if (id == null) {
            throw new IllegalArgumentException("Cache instances require an ID");
        }
        LoggerUtil.debug(getClass(), "MybatisRedisCache:id=" + id);
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void putObject(Object o, Object o1) {
        RedisConnection connection = null;
        try {
            connection = jedisConnectionFactory.getConnection();
            RedisSerializer<Object> serializer = new JdkSerializationRedisSerializer();
            connection.set(serializer.serialize(o), serializer.serialize(o1));
        } catch (Exception e) {
            LoggerUtil.error(getClass(), "putObject Error:", e);
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }

    @Override
    public Object getObject(Object o) {
        Object result = null;
        RedisConnection connection = null;

        try {
            connection = jedisConnectionFactory.getConnection();
            RedisSerializer<Object> serializer = new JdkSerializationRedisSerializer();
            result = serializer.deserialize(connection.get(serializer.serialize(o)));
        } catch (SerializationException e) {
            LoggerUtil.error(getClass(), "getObject error: ", e);
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
        return result;
    }

    @Override
    public Object removeObject(Object o) {
        RedisConnection connection = null;
        Object result = null;
        try {
            connection = jedisConnectionFactory.getConnection();
            RedisSerializer<Object> serializer = new JdkSerializationRedisSerializer();
            result = connection.expire(serializer.serialize(o), 0);
        } catch (Exception e) {
            LoggerUtil.error(getClass(), "remove object error: ", e);
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
        return result;
    }

    @Override
    public void clear() {
        RedisConnection connection = null;
        try {
            connection = jedisConnectionFactory.getConnection();
            connection.flushDb();
        } catch (Exception e) {
            LoggerUtil.error(getClass(), "clear error: ", e);
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }

    @Override
    public int getSize() {
        int result = 0;
        RedisConnection connection = null;
        try {
            connection = jedisConnectionFactory.getConnection();
            result = Integer.valueOf(connection.dbSize().toString());
        } catch (Exception e) {
            LoggerUtil.error(getClass(), "get size error: ", e);
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
        return result;
    }

    @Override
    public ReadWriteLock getReadWriteLock() {
        return this.readWriteLock;
    }
}
