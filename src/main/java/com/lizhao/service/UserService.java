package com.lizhao.service;

import com.lizhao.pojo.User;

/** 
* @author by lizhao
* @version 2019年6月27日 下午9:16:02 
* 类说明 

*/
public interface UserService {
    int checkLogin(String username,String password);
    User checkUser(String username,String password);
    int updateLoginInfo(int credits,long loginTime,String lastVisit,int userId);
}
