package com.just.shiro.controller;

import com.just.shiro.entity.User;
import com.just.shiro.service.UserService;
import com.just.shiro.utills.JsonData;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by justGeeker
 * 2020/1/11 16:54
 * 416467337@qq.com
 */
@RestController
@RequestMapping("video")
public class TestController {

    @RequestMapping("/update")
    public JsonData updateName() {
        String name ="dbusjdb";
        return JsonData.buildSuccess(name);
    }

}
