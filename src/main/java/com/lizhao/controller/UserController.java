package com.lizhao.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lizhao.pojo.User;
import com.lizhao.service.impl.UserServiceImpl;
/** 
* @author by lizhao
* @version 2019年7月5日 上午11:57:56 
* 类说明 

*/
@Controller
public class UserController{
    @Autowired
    private UserServiceImpl userService;
    @RequestMapping("/login")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mav = null;
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = userService.checkUser(username, password);
        if(user!=null) {
            mav = new ModelAndView("success.jsp");
            mav.addObject("user", user);
        }else {
            mav = new ModelAndView("error.jsp");
        }
        return mav;
    }
    
    @RequestMapping("/jump")
    public ModelAndView jump() {
        ModelAndView mav = new ModelAndView("redirect:/index.jsp");
        return mav;
    }
}
