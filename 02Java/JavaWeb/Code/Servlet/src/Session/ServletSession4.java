package Session;

import Cookie.Book;
import Cookie.ServletCookie1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/ServletSession4")
public class ServletSession4 extends HttpServlet {
    private static final ServletCookie1 DB = null;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //得到用户想买书籍的id
        String id = request.getParameter("id");

        //根据书籍的id找到用户想买的书
        Book book = (Book) DB.getAll().get(id);

        //获取到Session对象
        HttpSession httpSession = request.getSession();

        //由于用户可能想买多本书的，所以我们用一个容器装着书籍
        List list = (List) httpSession.getAttribute("list");
        if (list == null) {

            list = new ArrayList();

            //设置Session属性
            httpSession.setAttribute("list",list);
        }
        //把书籍加入到list集合中
        list.add(book);

        String url = "/ServletSession5";
        response.sendRedirect(url);
    }
}
