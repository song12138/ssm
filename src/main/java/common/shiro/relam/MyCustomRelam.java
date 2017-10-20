package common.shiro.relam;

import common.modules.dao.SysUserDao;
import common.modules.entity.SysUser;
import common.modules.service.ShiroServiceImpl;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by paul on 2017/10/19.
 */
@Component
public class MyCustomRelam extends AuthorizingRealm {

    @Autowired
    private ShiroServiceImpl shiroService;






    //授权
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

        return null;
    }

    //认证
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username= (String) token.getPrincipal();
        SysUser sysUser=new SysUser();
        sysUser.setRealname(username);
        List<SysUser> userList = shiroService.findUser(sysUser);
        SysUser user = userList.get(0);
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(
                user.getUsername(),
                user.getPassword(),
                ByteSource.Util.bytes(user.getSalt()),
                getName()); //realm name
        return simpleAuthenticationInfo;
    }
}
