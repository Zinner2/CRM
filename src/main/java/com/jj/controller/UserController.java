package com.jj.controller;

import com.jj.entity.User;
import com.jj.service.UserService;
import org.apache.ibatis.executor.ReuseExecutor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 任人子
 * @date 2021/6/14  - {TIME}
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/insertUser.do")
    public ModelAndView insertUser(User user){
        ModelAndView mv = new ModelAndView();
        if (userService.insertUser(user) > 0){
            mv.addObject("result","插入成功");
        }
        else {
            mv.addObject("result","插入失败");
        }
        mv.setViewName("result");
        return mv;
    }
    @RequestMapping("/selectUser.do")
    @ResponseBody
    public List<User> selectUser(Integer id){
        return  userService.selectUserById(id);
    }
}
