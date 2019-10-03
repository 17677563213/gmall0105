package com.wxy.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Array;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemo01ApplicationTests {

    @Test
    public void contextLoads() {
        String str="java";

        System.out.println("这是比较的结果   :  "+str==str+"  :你好" );
        System.out.println("==========");
        System.out.println("这里面的话比较的对象,他们的内容地址是不一样的,原来是这样的原因");
//        总结:
    }

    @Test
    public void  method02(){
//        使用这个的话就是在创建对象的时候就就将字符串放在括号里面
//        这里面跟Java的基本数据类型对应包装类型使用的方式是一样的
        StringBuffer str =new StringBuffer("java");
//    sout
        System.out.println("==================");


    }
    @Test
    public void method03(){
        System.out.println();


        double a =4.4;
        double b=4.5;
        System.out.println(b-a);




    }
}












