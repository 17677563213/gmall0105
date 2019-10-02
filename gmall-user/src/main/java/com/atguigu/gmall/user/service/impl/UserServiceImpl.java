package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberExample;
import com.atguigu.gmall.user.mapper.UmsMemberMapper;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

//    注入持久层的对象:
    @Resource
    private UmsMemberMapper umsMemberMapper;

    @Override
    public List findAll() {
        List<UmsMember> umsMembers = umsMemberMapper.selectAll();
        return umsMembers;
    }

    @Override
    public UmsMember findOne(String id) {
//        第一种方式
     /*   UmsMember umsMember =new UmsMember();
        umsMember.setId(Long.valueOf(id));

        List<UmsMember> select = umsMemberMapper.select(umsMember);*/
//      第二种方式
       /* Example example =new Example(UmsMember.class);
        example.createCriteria().andEqualTo("id",id);

        List<UmsMember> umsMembers = umsMemberMapper.selectByExample(example);

*/
        UmsMemberExample umsMemberExample = new UmsMemberExample();
        UmsMemberExample.Criteria criteria = umsMemberExample.createCriteria();
        criteria.andIdEqualTo(Long.valueOf(id));
        List<UmsMember> umsMembers = umsMemberMapper.selectByExample(umsMemberExample);


        return umsMembers.get(0);
    }


}
