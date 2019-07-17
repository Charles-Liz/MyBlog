package com.lizhao.pojo;

import java.io.Serializable;

/** 
* @author by lizhao
* @version 2019年7月2日 下午3:46:58 
* 类说明 
*登录日志类
*/
public class LoginLog extends BaseDomain{
    
    private int loginLogId;
    private String ip;
    private long loginTime;
    private User user;
    public int getLoginLogId() {
        return loginLogId;
    }
    public void setLoginLogId(int loginLogId) {
        this.loginLogId = loginLogId;
    }
    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public long getLoginTime() {
        return loginTime;
    }
    public void setLoginTime(long loginTime) {
        this.loginTime = loginTime;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    
}
