package com.openxu.api.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.openxu.api.module.Response;
import com.openxu.api.module.User;
import com.openxu.api.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/user")
public class UserController {

    @Autowired
    IUserService userService;

//    http://127.0.0.1:8081/user/regist
    @RequestMapping(value = "/regist",method = RequestMethod.POST)
    private Map loginUser(@RequestBody JSONObject account){
        System.out.println("Controller注册用户："+account);
        Map map = new HashMap();
        User user = userService.regist(account.toJavaObject(User.class));
        if(user!=null) {
            map.put("code", 200);
            map.put("data",user);
        }
        else{
            map.put("code", 201);
            map.put("message","没有该用户!");
        }
        return map;
    }

    //https://127.0.0.1:8081/user/get
    @GetMapping(value = "/get")
    public Response<List<User>> getUser(){
        List<User> users = new ArrayList<User>();
//        User user = new User();
//        user.setUserId("1");
//        user.setUserName("openXu");
//        users.add(user);
        return new Response(1, users, "请求成功");

    }

}
