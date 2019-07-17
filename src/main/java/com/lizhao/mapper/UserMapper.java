package com.lizhao.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.lizhao.pojo.User;

/** 
* @author by lizhao
* @version 2019年6月27日 下午9:27:30 
* 类说明 

*/
public interface UserMapper {
    @Select("select count(*) from users where username=#{username} and password=#{password}")
    int checkLogin(@Param("username")String username,@Param("password")String password);
    
    @Select("select *from t_user where username=#{username} and password=#{password}")
    User checkUser(@Param("username")String username,@Param("password")String password);
    
    @Update("update t_user set credits=#{credits},lastvisit=#{loginTime},lastip=#{lastVisit} where userid=#{userId}")
    int updateLoginInfo(@Param("credits")int credits,@Param("loginTime")long loginTime,@Param("lastVisit")String lastVisit,@Param("userId")int userId);
}
