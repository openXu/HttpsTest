package com.openxu.api.controller;

import com.openxu.api.module.Response;
import com.openxu.api.module.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/user")
public class UserController {

    //https://127.0.0.1:8081/user/get
    @GetMapping(value = "/get")
    public Response<List<User>> getUser(){
        List<User> users = new ArrayList<User>();
        User user = new User();
        user.setUserId("1");
        user.setUserName("openXu");
        users.add(user);
        return new Response(1, users, "请求成功");

    }

}
