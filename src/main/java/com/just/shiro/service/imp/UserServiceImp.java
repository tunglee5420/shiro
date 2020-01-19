package com.just.shiro.service.imp;

import com.just.shiro.DAO.PermissionMapper;
import com.just.shiro.DAO.RoleMapper;
import com.just.shiro.DAO.UserMapper;
import com.just.shiro.entity.Permission;
import com.just.shiro.entity.Role;
import com.just.shiro.entity.User;
import com.just.shiro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by justGeeker
 * 2020/1/15 16:40
 * 416467337@qq.com
 */
@Service
public class UserServiceImp implements UserService {
    @Autowired
    private PermissionMapper permissionMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public User getUserAll(String username,String pwd) {
        User user=userMapper.getUserByusername(username);
        if(pwd.equals(user.getPassword())){
            List<Role>roles=roleMapper.getRolesByUserId(user.getId());
            for (Role r:roles) {
                List<Permission>permissions=permissionMapper.getPermissionsByRoleId(r.getId());
                r.setPermissionList(permissions);
            }
            user.setRoleList(roles);
            return user;
        }
        return null;
    }

    @Override
    public User findByUsername(String username) {
        User user = userMapper.getUserByusername(username);
        List<Role>roles=roleMapper.getRolesByUserId(user.getId());
        for (Role r:roles) {
            List<Permission>permissions=permissionMapper.getPermissionsByRoleId(r.getId());
            r.setPermissionList(permissions);
        }
        user.setRoleList(roles);
        return user;
    }
}
