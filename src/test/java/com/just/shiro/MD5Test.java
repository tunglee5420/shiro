package com.just.shiro;




import org.apache.shiro.SecurityUtils;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.junit.Test;



public class MD5Test {

    @Test
    public void test1() throws Exception{

        String pwd="123456789";
        SimpleHash name=new SimpleHash("md5",pwd,null,2);
        System.out.println(name);

    }
}
