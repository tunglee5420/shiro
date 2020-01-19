package com.just.shiro.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
@Getter
@Setter
@ToString
public class Permission implements Serializable {

  private long id;
  private String name;
  private String url;



}
