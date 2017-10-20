package common.modules.dao;

import common.annotation.MybatisDao;
import common.modules.entity.SysUser;

import java.util.List;

/**
 * Created by paul on 2017/10/19.
 */
@MybatisDao
public interface SysUserDao {
    List<SysUser> findUser(SysUser user);
}
