package com.just.shiro.service;

import com.just.shiro.entity.User;
import org.springframework.stereotype.Service;

/**
 * Created by justGeeker
 * 2020/1/15 16:38
 * 416467337@qq.com
 */
@Service
public interface UserService {
    User getUserAll(String username,String pwd);
    User findByUsername(String username);
}
