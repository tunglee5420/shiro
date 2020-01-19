package com.just.shiro.controller;


import com.just.shiro.dto.UserQuery;
import com.just.shiro.utills.JsonData;
import org.apache.catalina.security.SecurityUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.*;


import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by justGeeker
 * 2020/1/16 15:00
 * 416467337@qq.com
 */
@RestController
@RequestMapping("/pub")
public class PublicController {

    @GetMapping("/need_login")
    public JsonData needLogin(){
        return JsonData.buildError("请登录",-2);
    }

    @GetMapping("/need_permit")
    public JsonData needPermit(){
        return JsonData.buildError("你暂无权限",-3);
    }

    @GetMapping("/index")
    public JsonData index(){
        List<String> list=new ArrayList<>();
        list.add("jisd00");
        list.add("dbsujdbj");
        return JsonData.buildSuccess(list);
    }

    @PostMapping("/login")
    public JsonData login(@RequestBody UserQuery user){
        Subject subject=SecurityUtils.getSubject();
        Map<String, Object>map=new HashMap<>();

        try {
            UsernamePasswordToken usernamePasswordToken=new UsernamePasswordToken(user.getUsername(),user.getPassword());
            subject.login(usernamePasswordToken);
            map.put("用户名",user.getUsername());
            map.put("token",subject.getSession().getId());
            return JsonData.buildSuccess(map);

        }catch (Exception e) {
            return JsonData.buildError("用户名或者密码错误");
        }
    }
}
