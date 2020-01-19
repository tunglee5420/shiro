package com.just.shiro.controller;
import java.util.ArrayList;
import	java.util.HashMap;
import java.util.List;

import com.just.shiro.entity.User;
import com.just.shiro.service.UserService;
import com.just.shiro.utills.JsonData;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by justGeeker
 * 2020/1/16 15:01
 * 416467337@qq.com
 */
@RestController
@RequestMapping("/authc")
public class UserController {
    @Autowired
    UserService userService;


    @RequestMapping("/getOrderList")
    public JsonData getOrderList(){
        List<String>orderList=new ArrayList<>();
        orderList.add("dsds");
        orderList.add("cfsudnjs");
        orderList.add("cfhasjbd");
        return JsonData.buildSuccess(orderList);
    }
    @RequestMapping("/findByUsername")
    public JsonData findByUsername(@RequestParam("username") String username){
        User user=userService.findByUsername(username);
        return JsonData.buildSuccess(user);
    }
}
