package io.github.geniusv.shiro.cache;

import io.github.geniusv.jedis.JedisDao;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.util.Destroyable;

/**
 * Created by GeniusV on 8/7/17.
 */
public class JedisShiroCacheManager implements CacheManager, Destroyable {

    private JedisDao jedisDao;

    public JedisDao getJedisDao() {
        return jedisDao;
    }

    public void setJedisDao(JedisDao jedisDao) {
        this.jedisDao = jedisDao;
    }


    @Override
    public <K, V> Cache<K, V> getCache(String s) throws CacheException {
        return new JedisShiroCache<>(jedisDao);
    }

    @Override
    public void destroy() throws Exception {
        jedisDao.flushdb();
    }

}
