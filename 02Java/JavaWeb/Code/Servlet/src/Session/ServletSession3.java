package Session;

import Cookie.Book;
import Cookie.ServletCookie1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

@WebServlet("/ServletSession3")
public class ServletSession3 extends HttpServlet {
    private static final ServletCookie1 DB = null;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter printWriter = response.getWriter();

        printWriter.write("网页上所有的书籍：" + "<br/>");

        //拿到数据库所有的书
        LinkedHashMap<String, Book> linkedHashMap = DB.getAll();
        Set<Map.Entry<String, Book>> entry = linkedHashMap.entrySet();

        //显示所有的书到网页上
        for (Map.Entry<String, Book> stringBookEntry : entry) {

            Book book = stringBookEntry.getValue();

            String url = "/ServletSession4?id=" + book.getId();
            printWriter.write(book.getName());
            printWriter.write("<a href='" + url + "'>购买</a>");
            printWriter.write("<br/>");
        }
    }
}
