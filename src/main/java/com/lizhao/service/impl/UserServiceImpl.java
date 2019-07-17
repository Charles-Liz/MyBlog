package com.lizhao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lizhao.mapper.UserMapper;
import com.lizhao.pojo.User;
import com.lizhao.service.UserService;

/** 
* @author by lizhao
* @version 2019年6月27日 下午9:21:40 
* 类说明 

*/
@Service("userService")
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public int checkLogin(String username, String password) {
        // TODO Auto-generated method stub
        return userMapper.checkLogin(username, password);
    }

    @Override
    public User checkUser(String username, String password) {
        // TODO Auto-generated method stub
        return userMapper.checkUser(username, password);
    }

    @Override
    public int updateLoginInfo(int credits, long loginTime, String lastVisit, int userId) {
        // TODO Auto-generated method stub
        return userMapper.updateLoginInfo(credits, loginTime, lastVisit, userId);
    }

}
