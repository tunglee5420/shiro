package com.just.shiro.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;
@Getter
@Setter
@ToString
public class Role implements Serializable {

  private long id;
  private String name;
  private String description;
  private List<Permission> permissionList;


}
