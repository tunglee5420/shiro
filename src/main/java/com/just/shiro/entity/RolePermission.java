package com.just.shiro.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
@Getter
@Setter
@ToString
public class RolePermission implements Serializable {

  private long id;
  private long roleId;
  private long permissionId;

}
