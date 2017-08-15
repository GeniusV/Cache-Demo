package io.github.geniusv.shiro.cache;

import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.util.Destroyable;

/**
 * Created by GeniusV on 8/7/17.
 */
public class JedisShiroCacheManager implements CacheManager, Destroyable {

    private ShiroJedisDao shiroJedisDao;

    public ShiroJedisDao getShiroJedisDao() {
        return shiroJedisDao;
    }

    public void setShiroJedisDao(ShiroJedisDao shiroJedisDao) {
        this.shiroJedisDao = shiroJedisDao;
    }


    @Override
    public <K, V> Cache<K, V> getCache(String s) throws CacheException {
        return new JedisShiroCache<>(shiroJedisDao);
    }

    @Override
    public void destroy() throws Exception {
        shiroJedisDao.flushdb();
    }

}
