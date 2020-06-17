package Cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/ServletDemo1")
public class ServletDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        response.setContentType("text.html;charset=UTF-8");
        PrintWriter printWriter = response.getWriter();

        //获取⽹⻚上所有的Cookie
        Cookie[] cookies = request.getCookies();
        //判断Cookie的值是否为空
        String cookieValue = null;
        for (int i = 0; cookies != null && i < cookies.length; i++) {
            //获取到以time为名的Cookie
            if (cookies[i].getName().equals("time")) {
                printWriter.write("您上次登陆的时间是：");
                cookieValue = cookies[i].getValue();
                printWriter.write(cookieValue);
                cookies[i].setValue(simpleDateFormat.format(new Date()));
                response.addCookie(cookies[i]);
                //既然已经找到了就可以break循环了
                break;
            }
        }

        //如果Cookie的值是空的，那么就是第⼀次访问
        if (cookieValue == null) {
            //创建⼀个Cookie对象，⽇期为当前时间
            Cookie cookie = new Cookie("time", simpleDateFormat.format(new Date()));
            //设置Cookie的⽣命期
            cookie.setMaxAge(20000);
            //response对象回送Cookie给浏览器
            response.addCookie(cookie);
            printWriter.write("您是第⼀次登陆啊！");
        }
    }
}
