package com.just.shiro.DAO;

import com.just.shiro.entity.Permission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by justGeeker
 * 2020/1/15 16:05
 * 416467337@qq.com
 */
@Mapper
public interface PermissionMapper {

    @Select("select permission.id, permission.name,permission.url from role_permission left join permission on permission.id=role_permission.permission_id" +
            " where role_permission.role_id=#{roleId} ")
    List<Permission> getPermissionsByRoleId(@Param("roleId") long roleId);
}
