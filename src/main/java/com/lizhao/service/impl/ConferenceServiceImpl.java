package com.lizhao.service.impl;

import org.springframework.stereotype.Component;

import com.lizhao.service.ConferenceService;

/** 
* @author by lizhao
* @version 2019年7月1日 下午7:20:55 
* 类说明 

*/
@Component("conferenceServiceImpl")
public class ConferenceServiceImpl implements ConferenceService{

    @Override
    public void conference() {
        System.out.println("do conference");
    }
    

}
