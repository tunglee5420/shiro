package com.just.shiro.entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import	java.util.List;


@Getter
@Setter
@ToString
public class User implements Serializable {

  private long id;
  private String username;
  private String password;
  private java.sql.Timestamp createTime;
  private String salt;
  private List<Role> roleList;


}
