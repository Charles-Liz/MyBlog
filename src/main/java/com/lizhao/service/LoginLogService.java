package com.lizhao.service;

/** 
* @author by lizhao
* @version 2019年7月2日 下午4:38:10 
* 类说明 

*/
public interface LoginLogService {
    int insertLoginLog(int userId,String ip,long loginTime);
}
