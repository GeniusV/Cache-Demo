package io.github.geniusv.shiro.cache;

import io.github.geniusv.util.LoggerUtil;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;
import org.mybatis.caches.redis.SerializeUtil;

import java.util.Collection;
import java.util.Set;

/**
 * Created by GeniusV on 8/7/17.
 */
public class JedisShiroCache<k, v> implements Cache<k, v> {

    private ShiroJedisDao dao;

    public JedisShiroCache(ShiroJedisDao dao) {
        this.dao = dao;
    }

    @Override
    public v get(k key) throws CacheException {
        byte[] byteKey = SerializeUtil.serialize(key);
        byte[] byteValue = new byte[0];
        try {
            byteValue = dao.getValueByKey(byteKey);
        } catch (Exception e) {
            LoggerUtil.error(getClass(), "get shiro cache value by cache throw exception", e);
        }
        v result = (v) SerializeUtil.unserialize(byteValue);
        if (result != null) {
            LoggerUtil.formatDebug(getClass(), "shiro getting cache: keys: %s, value: %s", key.toString(), result.toString());
        }
        return result;
    }

    @Override
    public v put(k key, v value) throws CacheException {
        LoggerUtil.formatDebug(getClass(), "shiro putting cache: keys: %s, value: %s", key.toString(), value.toString());
        v previous = get(key);
        try {
            dao.saveValueByKey(SerializeUtil.serialize(key), SerializeUtil.serialize(value), -1);
        } catch (Exception e) {
            LoggerUtil.error(getClass(), "put shiro cache throw exception", e);
        }
        return previous;
    }

    @Override
    public v remove(k key) throws CacheException {
        LoggerUtil.formatDebug(getClass(), "shiro deleting cache: keys: %s", key.toString());
        v previous = get(key);
        try {
            dao.deleteByKey(SerializeUtil.serialize(key));
        } catch (Exception e) {
            LoggerUtil.error(getClass(), "remove shiro cache throw exception", e);
        }
        return previous;
    }

    @Override
    public void clear() throws CacheException {
        LoggerUtil.debug(getClass(), "shiro clearing all cache...");
        try {
            dao.flushdb();
        } catch (Exception e) {
            LoggerUtil.error(getClass(), "clear shiro cache throw exception", e);
        }
    }

    @Override
    public int size() {
        if (keys() == null)
            return 0;
        return keys().size();
    }

    @Override
    public Set<k> keys() {
        return null;
    }

    @Override
    public Collection<v> values() {
        return null;
    }
}
