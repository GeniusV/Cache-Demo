package io.github.geniusv.shiro.realm;

import io.github.geniusv.dao.model.User;
import io.github.geniusv.user.service.UserService;
import org.apache.log4j.Logger;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by GeniusV on 8/4/17.
 */
public class CustomRelam extends AuthorizingRealm {

    @Autowired
    UserService userService;

    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        return null;
    }

    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String username = (String) authenticationToken.getPrincipal();
        User user = userService.selectByUserName(username);
        long id = user.getId();
        String password = user.getPassword();
        AuthenticationInfo info =  new SimpleAuthenticationInfo(id, password, this.getName());
        return info;
    }

}
