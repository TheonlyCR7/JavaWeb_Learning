package Session;

import Cookie.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/ServletSession5")
public class ServletSession5 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession httpSession = request.getSession();
        PrintWriter printWriter = response.getWriter();
        List<Book> list = (List) httpSession.getAttribute("list");

        //此时得到的数据已经是被ISO 8859-1编码后的字符串了，这个是乱码
        String string1 ="对不起，你还没有买过任何商品";
        String string2 = "您购买过以下商品：";
        String string3 = "<br/>";
        String string4 = "<br/>";

        // java中字符串通过unicode 进行的编码
        byte[] bytes1 = string1.getBytes("unicode");
        byte[] bytes2 = string2.getBytes("unicode");
        byte[] bytes3 = string3.getBytes("unicode");
        byte[] bytes4 = string4.getBytes("unicode");

        String str1 = new String(bytes1, "ISO8859-1");
        String str2 = new String(bytes2, "ISO8859-1");
        String str3 = new String(bytes3, "ISO8859-1");
        String str4 = new String(bytes4, "ISO8859-1");

        if (list == null || list.size() == 0) {
            printWriter.write(str1);

        } else {
            printWriter.write(str2);
            printWriter.write(str3);
            for (Book book : list) {
                printWriter.write(book.getName());
                printWriter.write(str4);
            }
        }
    }
}
