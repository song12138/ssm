package common.modules.service;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import common.modules.dao.SysUserDao;
import common.modules.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by paul on 2017/10/20.
 */
@Service
public class ShiroServiceImpl {
    @Autowired
    private SysUserDao sysUserDao;


    public List<SysUser> findUser(SysUser user){
        return sysUserDao.findUser(user);
    }

}
