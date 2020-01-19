package com.just.shiro.controller;

import com.just.shiro.entity.User;
import com.just.shiro.utills.JsonData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by justGeeker
 * 2020/1/16 15:02
 * 416467337@qq.com
 */
@RestController
@RequestMapping("/admin")
public class AdminController {
    @RequestMapping("/getUserList")
    public JsonData getUserList(){
        List<String> users =new ArrayList<>();
        users.add("张山");
        users.add("张山");
        users.add("张山");
        users.add("张山");
        return JsonData.buildSuccess(users);
    }
}
