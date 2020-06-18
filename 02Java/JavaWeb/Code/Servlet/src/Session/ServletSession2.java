package Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/ServletSession2")
public class ServletSession2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 在Servlet5中获取到Session存进去的属性
        // 获取到从Servlet4的Session存进去的值
        HttpSession httpSession = request.getSession();
        String value = (String) httpSession.getAttribute("name");
        System.out.println(value);
    }
}
