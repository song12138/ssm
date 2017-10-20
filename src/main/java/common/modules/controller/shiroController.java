package common.modules.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by paul on 2017/10/19.
 */
@Controller
public class shiroController {

//    @Autowired
//    private DefaultWebSecurityManager securityManager;



    @RequestMapping(value = "shiroLogin")
    public boolean shiroLogin(String username,String password){

//        SecurityUtils.setSecurityManager(securityManager);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        try {
            subject.login(token);
            return true;
        }catch (AuthenticationException e){
            return false;
        }
    }
}
