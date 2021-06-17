package com.jj.service;

import com.jj.entity.User;

import java.util.List;

/**
 * @author 任人子
 * @date 2021/6/14  - {TIME}
 */
public interface UserService {

    int insertUser(User user);

    List<User> selectUserById(Integer id);
}
