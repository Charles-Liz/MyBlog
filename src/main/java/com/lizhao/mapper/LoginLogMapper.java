package com.lizhao.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

/** 
* @author by lizhao
* @version 2019年7月2日 下午3:58:19 
* 类说明 

*/
public interface LoginLogMapper {
    @Insert("insert into t_login_log(user_id,ip,login_datetime) values(#{userId},#{ip},#{loginTime})")
    int insertLoginLog(@Param("userId")int userId,@Param("ip")String ip,@Param("loginTime")long loginTime);
}
