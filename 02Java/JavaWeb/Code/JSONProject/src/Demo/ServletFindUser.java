package Demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/ServletFindUser")
public class ServletFindUser extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取用户名
        String username = request.getParameter("username");
        // 设置编码
        response.setContentType("application/json;charset=utf-8");
        Map<String, Object> map = new HashMap<>();

        // 查询数据库 调用service层判断用户名是否存在
        if("lmc".equals(username)){
            // 存在
            map.put("userExsit", true);
            map.put("msg", "此用户名已存在");
        }else{
            // 不存在
            map.put("userExsit", false);
            map.put("msg", "此用户名可以使用");
        }
        // 将 map 转为 json 并作为响应传递回去
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(response.getWriter(), map);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
