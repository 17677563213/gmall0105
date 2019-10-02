package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
//    注入业务层对象:
    @Autowired
    private UserService userService;
    @RequestMapping("/findAll")
    @ResponseBody
    public List findAll(){

        List all = userService.findAll();

        return all;
    }
    @RequestMapping("/findOne")
    @ResponseBody
    public UmsMember findOne(String id){
        UmsMember one = userService.findOne(id);
        return one;

    }

}
