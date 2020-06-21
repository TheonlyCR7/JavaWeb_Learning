package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ServletDemo1")
public class ServletDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 获取流对象之前，设置流得默认编码: ISO-8859-1 设置为：GBK
        // response.setCharacterEncoding("GBK");

        // 告诉浏览器消息得编码，建议浏览器使用该编码解码
        response.setHeader("content-type", "text/html;charset=utf-8");

        // 获取字符输出流
        PrintWriter printWriter = response.getWriter();
        // 输出数据
        printWriter.write("<h1>hello response</h1>");
        printWriter.write("你好");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
