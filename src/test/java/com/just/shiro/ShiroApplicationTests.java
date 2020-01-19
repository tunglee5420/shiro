package com.just.shiro;



import com.just.shiro.entity.Permission;
import com.just.shiro.entity.Role;
import com.just.shiro.entity.User;
import com.just.shiro.service.UserService;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShiroApplicationTests {

    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        User user = userService.findByUsername("二当家小D");
       int count=user.getRoleList().size();
        for (Role r: user.getRoleList()) {
            System.out.println(r);
            for (Permission permission:
                 r.getPermissionList()) {
                System.out.println(permission);
            }
        }
        System.out.println();
    }

}
