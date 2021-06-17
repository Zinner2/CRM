package com.jj.service.impl;

import com.jj.dao.UserDao;
import com.jj.entity.User;
import com.jj.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 任人子
 * @date 2021/6/14  - {TIME}
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public int insertUser(User user) {
        return userDao.insertUser(user);
    }

    @Override
    public List<User> selectUserById(Integer id) {
        return userDao.selectUserById(id);
    }
}
