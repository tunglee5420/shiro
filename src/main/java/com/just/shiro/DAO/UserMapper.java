package com.just.shiro.DAO;

import com.just.shiro.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by justGeeker
 * 2020/1/15 15:46
 * 416467337@qq.com
 */
@Mapper
public interface UserMapper {
    @Select("select * from user where username=#{username} ")
    User getUserByusername(String username);

    @Select("select * from user where id=#{id} ")
    User getUserById(long id);

}
