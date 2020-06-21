package Cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/ServletDemo1")
public class ServletDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 设置编码
        response.setContentType("text/html;charset=utf-8");

        // 默认没有访问的Cookie
        boolean flag = false;
        // 获取所有的Cookie
        Cookie[] cookies = request.getCookies();
        // 遍历Cookie数组
        if(cookies != null && cookies.length > 0 ){
            flag = true;
            for(Cookie cookie : cookies){
                // 获取cookie的名称
                String name = cookie.getName();
                // 判断名称是否是 lastTime
                if("lastTime".equals(name)){ // 若有
                    // 获取Cookie数据
                    String value = cookie.getValue();
                    response.getWriter().write(
                            "<h1>欢迎回来, 您上次访问时间为: " + value + " </h1>");

                    // 再记录当前登录时间，下次登录显示
                    Date date = new Date();
                    SimpleDateFormat simpleDateFormat =
                            new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
                    String string_date = simpleDateFormat.format(date);

                    cookie.setValue(string_date);
                    cookie.setMaxAge(60 * 60 * 24 * 30 );  // 保存一个月
                    response.addCookie(cookie);
                }
                }
        }else {
            response.getWriter().write(
                    "<h1>您好！欢迎您首次访问！</h1>");

            // 再记录当前登录时间，下次登录显示
            Date date = new Date();
            SimpleDateFormat simpleDateFormat =
                    new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
            String string_date = simpleDateFormat.format(date);
            Cookie cookie = new Cookie("lastTime", string_date);
            cookie.setValue(string_date);
            cookie.setMaxAge(60 * 60 * 24 * 30 );  // 保存一个月
            response.addCookie(cookie);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
