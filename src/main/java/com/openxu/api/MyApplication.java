package com.openxu.api;

import com.alibaba.fastjson.JSON;
import com.openxu.api.module.User;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {

        User user = new User();
        user.setName("openxu");
        user.setPhone("123");
        user.setPassword("111");
        user.setAge(2);
        user.setSex(1);
        user.setOccupation(1);
        user.setSchool(1);
        user.setSchool_name("农业大学");
        user.setFaculty(2);
        user.setFaculty_name("计算机系");
        user.setClazz(1);
        user.setClazz_name("1003班");
        user.setNumber("10030306");

        LoggerFactory.getLogger("MyApplication").debug(JSON.toJSONString(user));


        SpringApplication.run(MyApplication.class,args);
    }
}
