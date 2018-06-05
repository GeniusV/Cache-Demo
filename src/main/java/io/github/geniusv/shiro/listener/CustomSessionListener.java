package io.github.geniusv.shiro.listener;

import io.github.geniusv.shiro.session.ShiroSessionRespository;
import io.github.geniusv.util.LoggerUtil;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.SessionListener;

/**
 * Created by GeniusV on 8/8/17.
 */
public class CustomSessionListener implements SessionListener {

    private ShiroSessionRespository shiroSessionRespository;

    @Override
    public void onStart(Session session) {
        LoggerUtil.debug(getClass(), "a session start: session id:[%s]", session.getId().toString());
    }

    @Override
    public void onStop(Session session) {
        LoggerUtil.debug(getClass(), "a session stop: session id:[%s]", session.getId().toString());
    }

    @Override
    public void onExpiration(Session session) {
        shiroSessionRespository.deleteSession(session.getId());
        LoggerUtil.debug(getClass(), "a session expire: session id:[%s]", session.getId().toString());
    }

    public ShiroSessionRespository getShiroSessionRespository() {
        return shiroSessionRespository;
    }

    public void setShiroSessionRespository(ShiroSessionRespository shiroSessionRespository) {
        this.shiroSessionRespository = shiroSessionRespository;
    }
}
