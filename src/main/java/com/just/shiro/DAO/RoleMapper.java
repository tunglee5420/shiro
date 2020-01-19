package com.just.shiro.DAO;

import com.just.shiro.entity.Role;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

/**
 * Created by justGeeker
 * 2020/1/15 15:54
 * 416467337@qq.com
 */
@Mapper
public interface RoleMapper {
    @Select("select role.id ,role.name,role.description from user_role " +
            "left join role on role.id=user_role.role_id " +
            "where user_role.user_id=#{userId}")
    @Results(
            value = {
                    @Result(id= true , property = "id" ,column = "id" ),
                    @Result(property = "name" ,column = "name" ),
                    @Result(property = "description" ,column = "description" ),
                    @Result(property = "permissionList" ,column = "permissionList",
                    many = @Many(select = "com.just.shiro.entity.Permission.getPermissionsByRoleId" ,fetchType = FetchType.DEFAULT)
                    )

            }
    )
    List<Role> getRolesByUserId(@Param("userId") Long userId);
}
