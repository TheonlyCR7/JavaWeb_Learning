package Listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.io.FileInputStream;

public class ContextLoaderListener implements ServletContextListener {

    /*
    * 当服务器启动时, 自动调用
    * */
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

        //加载资源文件
        //1.获取ServletContext对象
        ServletContext servletContext = servletContextEvent.getServletContext();

        //2.加载资源文件
        String contextConfigLocation = servletContext.getInitParameter("contextConfigLocation");

        //3.获取真实路径
        String realPath = servletContext.getRealPath(contextConfigLocation);

        //4.加载进内存
        try{
            FileInputStream fis = new FileInputStream(realPath);
            System.out.println(fis);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("ServletContext对象被创建");
    }

    /*
    * 在服务器关闭后，ServletContext 对象被销毁，当服务器关闭后调用
    *
    * */
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

        System.out.println("ServletContext对象被销毁了");
    }
}
