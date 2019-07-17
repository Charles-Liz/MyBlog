package com.lizhao.controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/** 
* @author by lizhao
* @version 2019年6月25日 下午2:36:40 
* 类说明 

*/
@Controller
public class ValidateCodeController{
    @RequestMapping("/validate")
    protected void getCode(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //create a photo ,just like a glass transparent
        BufferedImage image = new BufferedImage(100, 50, BufferedImage.TYPE_INT_RGB);
        //放一张玻璃在上面
        Graphics2D gra = image.createGraphics();
        gra.setColor(Color.WHITE);
        //从哪个坐标开始填充，宽，高;原点左上角
        gra.fillRect(0, 0, 100, 50);
        List<Integer> randList = new ArrayList<>();
        Random random = new Random();
        StringBuffer buffer = new StringBuffer();
        //生成随机数字
        for(int i=0;i<4;i++) {
            randList.add(random.nextInt(10));
            buffer.append(randList.get(i));
        }
        //设置字体 颜色
        gra.setFont(new Font("宋体",Font.BOLD|Font.ITALIC,20));
        Color[] colors=new Color[] {
                Color.red,Color.BLACK,Color.blue,Color.green,Color.orange
                };
        //画上去
        for(int i=0;i<randList.size();i++) {
            gra.setColor(colors[random.nextInt(colors.length)]);
            gra.drawString(randList.get(i)+"", i*20, 50);
        }
       //画几条横线
        for(int j =0;j<2;j++) {
            gra.setColor(colors[random.nextInt(colors.length)]);
            gra.drawLine(random.nextInt(101), random.nextInt(101), 50, 50);
        }
       
        ServletOutputStream outputStream = resp.getOutputStream();
        ImageIO.write(image, "jpg", outputStream);
        
        
        HttpSession session = req.getSession();
        session.setAttribute("validatecode", buffer);
        
       
    }
  
    
    
    
    
}
