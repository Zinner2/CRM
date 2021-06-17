package com.jj.dao;

import com.jj.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 任人子
 * @date 2021/6/14  - {TIME}
 */

public interface UserDao {

    int insertUser(User user);

    List<User> selectUserById(Integer id);
}
