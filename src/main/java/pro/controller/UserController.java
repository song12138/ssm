package pro.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pro.com.entity.User;
import pro.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by paul on 2017/8/4.
 */
@Controller
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userServiceImpl;

    @RequestMapping(value = "user")
    public String findAllUser(HttpServletRequest request, HttpServletResponse response , Model model){
        List<User> users= userServiceImpl.findAll();
        model.addAttribute("users", users);
        return "user";
    }
}
