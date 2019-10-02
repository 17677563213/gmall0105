package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsMember;

import java.util.List;

public interface UserService {


    public List findAll();

    public UmsMember findOne(String id);


}
