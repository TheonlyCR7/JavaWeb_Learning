package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

// 过滤器
@WebFilter("/Filter2")   // 访问所有资源之前，都会执行该过滤器
public class FilterDemo2 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        System.out.println("init执行");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter执行");
        // 放行请求或响应
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("filter2 回来了");
    }

    @Override
    public void destroy() {
        System.out.println("destroy执行");
    }
}
