package com.lizhao.pojo;

import java.io.Serializable;
import java.util.Set;

/** 
* @author by lizhao
* @version 2019年6月27日 下午8:38:58 
* 类说明 

*/
public class User extends BaseDomain{
    //实体类属性名要与数据库中字段名一致
    private int userid;
    private String username;
    private String password;
    private String sex;
    private String age;
    private int credits;
    private long lastvisit;
    private String lastip;
    private Set<String> manBoards;
    public int getUserid() {
        return userid;
    }
    public void setUserid(int userid) {
        this.userid = userid;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public int getCredits() {
        return credits;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }
    public long getLastvisit() {
        return lastvisit;
    }
    public void setLastvisit(long lastvisit) {
        this.lastvisit = lastvisit;
    }
    public String getLastip() {
        return lastip;
    }
    public void setLastip(String lastip) {
        this.lastip = lastip;
    }
    public Set<String> getManBoards() {
        return manBoards;
    }
    public void setManBoards(Set<String> manBoards) {
        this.manBoards = manBoards;
    }
    
  
}
