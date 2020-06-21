package servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Random;

@WebServlet("/ServletDemo3")
public class ServletDemo3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int width = 100;
        int height = 50;

        // 创建一对象，在内存中得图片(验证码图片对象)
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        // 优化图片
        // 填充颜色
        Graphics graphics = bufferedImage.getGraphics();  // 创建画笔对象
        graphics.setColor(Color.PINK);    // 设置画笔颜色
        graphics.fillRect(0,0,width,height);

        // 画边框
        graphics.setColor(Color.BLUE);
        graphics.drawRect(0, 0, width-1, height-1);

        // 随机验证码
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghizklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        for(int i = 0; i < 4; i ++) {
            // 生成随机角标

            int index = random.nextInt(str.length());
            char ranstr = str.charAt(index);

            // 写验证码
            graphics.drawString(String.valueOf(ranstr), width/5*i, height/2);
        }

        // 画出干扰线
        graphics.setColor(Color.GREEN);
        for(int i = 0; i < 10; i ++)
            graphics.drawLine(
                    random.nextInt(width),
                    random.nextInt(width),
                    random.nextInt(height),
                    random.nextInt(height) );


        // 将图片输出到页面展示
        ImageIO.write(bufferedImage, "jpg", response.getOutputStream());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
