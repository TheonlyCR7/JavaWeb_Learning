# Servlet

>   server applet
>
>   运行在服务器端的小程序
>
>   Servlet 是一个接口，定义了 Java类被浏览器访问到(tomcat识别)的规则
>
>   我们自定义类，实现Servlet接口，复写方法



步骤：

*   创建 JavaEE项目
*   定义一个类，实现Servlet接口
*   实现接口中的抽象方法
*   配置Servlet

在web.xml中配置servlet

![image-20200602095539500](img/image-20200602095539500.png)

添加代码

```xml
<!--    配置servlet-->
    <servlet>
        <servlet-name>demo1</servlet-name>
        <servlet-class>Demo.ServletDemo</servlet-class>
    </servlet>
    
    <servlet-mapping>
        <servlet-name>demo1</servlet-name>
        <url-pattern>/Demo</url-pattern>  通过 /Demo进行访问
    </servlet-mapping>
```



启动服务，输入/Demo （区分大小写)

成功访问

![image-20200602100451496](img/image-20200602100451496.png)

输出台显示：

![image-20200602100533522](img/image-20200602100533522.png)

调用了ServletDemo中的方法

每次刷新都会再次执行



执行原理：

*   当服务器接受到客户端浏览器得请求后，会解析请求URL路径，获取访问的Servlet的资源路径
*   查找web.xml文件，是否有对应的<url-pattern>标签体内容
*   如果有，则在找到对应的<servlet-class>全类名
*   tomcat会将字节码文件加载进内存，并且创建其对象
*   调用其方法

![image-20200602104058703](img/image-20200602104058703.png)