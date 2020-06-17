package Demo1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletDemo10")
public class ServletDemo10 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //以username为关键字存zhongfucheng值
        request.setAttribute("username", "zhongfucheng");
        //获取到requestDispatcher对象
        RequestDispatcher requestDispatcher =
                request.getRequestDispatcher("/ServletDemo11");
        //调⽤requestDispatcher对象的forward()实现转发,传⼊request和response⽅法
        requestDispatcher.forward(request, response);
    }
}
