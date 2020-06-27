package Bean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;
import java.io.IOException;

public class showIp implements Tag {

    private PageContext pageContext = null;

    @Override
    public void setPageContext(PageContext pageContext) {
        this.pageContext = pageContext;
    }

    @Override
    public void setParent(Tag tag) {

    }

    @Override
    public Tag getParent() {
        return null;
    }

    @Override
    public int doStartTag() throws JspException {

        //获取到request对象
        HttpServletRequest httpServletRequest = (HttpServletRequest) pageContext.getRequest();

        //获取到客户机的ip地址
        String ip = httpServletRequest.getRemoteAddr();

        //获取输出到浏览器的对象
        JspWriter jspWriter = pageContext.getOut();

        //下面的异常只能捕获，因为子类的异常不能比父类多
        try {
            jspWriter.write(ip);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return 0;
    }

    @Override
    public int doEndTag() throws JspException {
        return 0;
    }

    @Override
    public void release() {

    }
}
