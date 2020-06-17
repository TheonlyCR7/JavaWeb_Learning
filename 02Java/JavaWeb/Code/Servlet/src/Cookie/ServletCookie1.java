package Cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


@WebServlet("/ServletCookie1")
public class ServletCookie1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    private static LinkedHashMap<String, Book> linkedHashMap = new LinkedHashMap();


    //简化开发复杂度，book的id和商品的id相同
    static {
        linkedHashMap.put("1", new Book("1", "javaweb", "zhong"));
        linkedHashMap.put("2", new Book("2", "java", "fu"));
        linkedHashMap.put("3", new Book("3", "oracle", "cheng"));
        linkedHashMap.put("4", new Book("4", "mysql", "ou"));
        linkedHashMap.put("5", new Book("5", "ajax", "zi"));
    }

    //获取到所有书籍
    public static LinkedHashMap getAll() {
        return linkedHashMap;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.getWriter().write("网页上所有的书籍："+"<br/>");

        //拿到数据库所有的书
        Set<Map.Entry<String, Book>> entry = linkedHashMap.entrySet();

        //显示所有的书到网页上
        for (Map.Entry<String, Book> stringBookEntry : entry) {
            Book book = stringBookEntry.getValue();
            response.getWriter().write(book.getId() +"           "+ book.getName()+"<br/>");
        }

        //显示所有的书到网页上
        for (Map.Entry<String, Book> stringBookEntry : entry) {
            Book book = stringBookEntry.getValue();
            response.getWriter().write("<a href='/Cookie/ServletCookie2?id=" + book.getId() + "''target=_blank' +" + book.getName() + "</a>");
            response.getWriter().write("<br/>");
        }
    }
}
