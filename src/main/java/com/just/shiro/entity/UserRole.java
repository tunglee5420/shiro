package com.just.shiro.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
@Getter
@Setter
@ToString
public class UserRole implements Serializable {

  private long id;
  private long roleId;
  private long userId;
  private String remarks;

}
