package com.lizhao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lizhao.mapper.LoginLogMapper;
import com.lizhao.service.LoginLogService;

/** 
* @author by lizhao
* @version 2019年7月2日 下午4:39:38 
* 类说明 

*/
@Service("loginLogService")
public class LoginLogServiceImpl implements LoginLogService{
    @Autowired
    private LoginLogMapper loginlogMapper;//属性注入

    @Override
    public int insertLoginLog(int userId, String ip, long loginTime) {
        // TODO Auto-generated method stub
        return loginlogMapper.insertLoginLog(userId, ip, loginTime);
    }

}
