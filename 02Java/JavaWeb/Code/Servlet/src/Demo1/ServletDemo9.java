package Demo1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletDemo9")
public class ServletDemo9 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 获取用户输入数据
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String hobby[] = request.getParameterValues("hobby");
//         获取数据后，会直接接受url中显示明码信息
//      get 提交数据  跳转到指定页面 并明码显示信息
//         显示多个参数值没有成功 占坑
        response.sendRedirect("/ServletDemo8?username="+username);




    }
}
