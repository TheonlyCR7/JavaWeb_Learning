package Demo;

import javax.servlet.*;
import java.io.IOException;

public class ServletDemo2 implements Servlet{

    // 初始化方法，创建时，执行
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("初始化方法被执行");
    }

    // 获得 ServletConfig 对象
    // Servlet 的配置对象
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    // 提供服务方法  每一次servlet 被访问时，执行多次
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("服务方法被执行");
    }

    // 获取Servlet 的一些信息，版本等
    @Override
    public String getServletInfo() {
        return null;
    }

    // 销毁方法
    // 在服务器正常关闭时，执行
    @Override
    public void destroy() {
        System.out.println("关闭服务");
    }
}
