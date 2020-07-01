package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

// 浏览器直接请求ServletDemo3资源  而不是转发请求  该过滤器会被执行
@WebFilter(value = "/ServletDemo3", dispatcherTypes = DispatcherType.REQUEST)
public class FilterDemo3 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        chain.doFilter(req, resp);
        System.out.println("FilterDemo3");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
