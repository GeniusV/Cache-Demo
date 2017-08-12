package io.github.geniusv.shiro.realm;

import io.github.geniusv.dao.model.Role;
import io.github.geniusv.dao.model.User;
import io.github.geniusv.role.service.RoleService;
import io.github.geniusv.user.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by GeniusV on 8/4/17.
 */
public class CustomRelam extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;


    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        Long userId = (Long) principalCollection.getPrimaryPrincipal();
        List<Role> roleList = roleService.getUserRolesById(userId);
        if (roleList == null) {
            return null;
        }
        Set<String> roles = new HashSet<>();
        for (Role role : roleList) {
            roles.add(role.getName());
        }
        authorizationInfo.setRoles(roles);
        return authorizationInfo;
    }

    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String username = (String) authenticationToken.getPrincipal();
        User user = userService.selectByUserName(username);
        if (user == null) {
            throw new AuthenticationException();
        }
        long id = user.getId();
        String password = user.getPassword();
        AuthenticationInfo info = new SimpleAuthenticationInfo(id, password, this.getName());
        return info;
    }

}
