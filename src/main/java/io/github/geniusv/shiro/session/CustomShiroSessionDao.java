package io.github.geniusv.shiro.session;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.UnknownSessionException;
import org.apache.shiro.session.mgt.eis.AbstractSessionDAO;

import java.io.Serializable;
import java.util.Collection;

/**
 * Created by GeniusV on 8/8/17.
 */
public class CustomShiroSessionDao extends AbstractSessionDAO {

    private ShiroSessionRespository shiroSessionRespository;

    public ShiroSessionRespository getShiroSessionRespository() {
        return shiroSessionRespository;
    }

    public void setShiroSessionRespository(ShiroSessionRespository shiroSessionRespository) {
        this.shiroSessionRespository = shiroSessionRespository;
    }

    @Override

    protected Serializable doCreate(Session session) {
        Serializable sessionId = generateSessionId(session);
        assignSessionId(session, sessionId);
        getShiroSessionRespository().saveSession(session);
        return sessionId;
    }

    @Override
    protected Session doReadSession(Serializable serializable) {
        return shiroSessionRespository.getSession(serializable);
    }

    @Override
    public void update(Session session) throws UnknownSessionException {
        shiroSessionRespository.saveSession(session);
    }

    @Override
    public void delete(Session session) {
        shiroSessionRespository.deleteSession(session.getId());
    }

    @Override
    public Collection<Session> getActiveSessions() {
        return shiroSessionRespository.getAllSessions();
    }
}
