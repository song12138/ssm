package pro.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pro.dao.UserDao;
import pro.entity.User;
import pro.service.UserService;

import java.util.List;

/**
 * Created by paul on 2017/8/4.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;


    public List<User> findAll(){
        return userDao.findAll();
    }
}
