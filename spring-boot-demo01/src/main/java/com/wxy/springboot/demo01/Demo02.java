package com.wxy.springboot.demo01;

import java.io.UnsupportedEncodingException;

public class Demo02 {
    public static void main(String[] args) {
        String str="此生不悔如华夏";
        System.out.println(str.getBytes()+"这是变成了byte的数据理性");
        try {
            System.out.println(new String(str.getBytes(),"UTF-8")+"这是变成了byte的数据理性");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }


    }
}
