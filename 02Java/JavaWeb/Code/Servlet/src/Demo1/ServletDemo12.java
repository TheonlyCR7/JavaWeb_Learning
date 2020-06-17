package Demo1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletDemo12")
public class ServletDemo12 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //设置response的编码
        response.setContentType("text/html;charset=UTF-8");

        //创建Cookie对象，指定名称和值
        Cookie cookie = new Cookie("username", "zhongfucheng");
        //设置Cookie的时间
        cookie.setMaxAge(1000);
        //向浏览器给⼀个Cookie
        response.addCookie(cookie);
        response.getWriter().write("我已经向浏览器发送了⼀个Cookie");
    }
}
