# HTTP

> 定义了客户端和服务端通信时，发送数据的格式

特点：

* 基于TCP/IP 的高级协议

* 默认接口号：80

* 基于请求/响应模型：一次请求对应一次响应

* 无状态的：每次请求之间相互独立，不能交互数据

历史版本：

* 每一次请求响应都会建立新的连接

* 复用连接

## 请求消息数据格式

1. 请求行

2. 请求头

3. 请求空行

4. 请求体

`localhost:8080/`

请求行

* 请求方式 请求url 请求协议版本
  
  GET /login.html HTTP/1.1
  
  ![](D:\Github_NOTES\JavaWeb_Learning\02Java\JavaWeb\img\2020-06-14-09-37-53-image.png)

* 请求头：请求头值
  
  User-Agent: 浏览器告诉服务器，使用的浏览器版本信息
  
  可以在服务器端获取该头的信息，解决浏览器的兼容性问题
  
  作用：防盗链，统计工作
  
  ![](D:\Github_NOTES\JavaWeb_Learning\02Java\JavaWeb\img\2020-06-14-09-38-56-image.png)

* 请求空行
  
  为空  分隔请求头与请求体

* 请求体（正文）
  
  封装POST请求消息的请求参数的
  
  ![](D:\Github_NOTES\JavaWeb_Learning\02Java\JavaWeb\img\2020-06-14-09-43-24-image.png)

### 请求方式

HTTP协议有7种请求方式，常用为2种

* GET
  
  * 请求参数在请求行种，在url后
  
  * 请求的url长度有限制
  
  * 不太安全

* POST:
  
  * 请求参数都在请求体中
  
  * 请求的url长度没有限制
  
  * 相对安全

## Request请求原理

request, response 对象都是由服务器创建的

request对象是来获取请求消息，response对象是来设置响应消息

<img title="" src="D:\Github_NOTES\JavaWeb_Learning\02Java\JavaWeb\img\2020-06-14-10-17-44-image.png" alt="" width="736">

request 对象继承体系结构：

```java
ServletRequest        --    接口
        |    继承
    HttpServletRequest    -- 接口
        |    实现
    org.apache.catalina.connector.RequestFacade 类(tomcat)
```



## request功能

### 获取请求消息数据

* 获取请求行数据
  
  GET /Servlet?name=zhangsan HTTP/1.1
  
  1. 获取请求方式 ：GET
    
     - 方法：
       
       ```java
               1. 获取请求方式 ：GET
                   * String getMethod()  
               2. (*)获取虚拟目录：/day14
                   * String getContextPath()
               3. 获取Servlet路径: /demo1
                   * String getServletPath()
               4. 获取get方式请求参数：name=zhangsan
                   * String getQueryString()
               5. (*)获取请求URI：/day14/demo1
                   * String getRequestURI():        /day14/demo1
                   * StringBuffer getRequestURL()  :http://localhost/day14/demo1
       
                   * URL:统一资源定位符 ： http://localhost/day14/demo1    
                       类比类似：中华人民共和国
                   * URI：统一资源标识符 : /day14/demo1                    
                       类比类似：共和国
       
               6. 获取协议及版本：HTTP/1.1
                   * String getProtocol()
       
               7. 获取客户机的IP地址：
                   * String getRemoteAddr()
       ```

              2. 获取请求头数据

```java
String getHeader(String name):通过请求头的名称获取请求头的值
Enumeration<String> getHeaderNames():获取所有的请求头名称
```

              3. 获取请求体数据

                只有POST请求方式，才有请求体，在请求体中封装了POST请求的请求参数

                步骤：

   1. 获取流对象

      ```java
      BufferedReader getReader(): 获取字符输入流，只能操作字符数据
      ServletInputStream getInputStream(): 获取字符输入流，可以操作所有类型数据
      ```

   2. 再从流对象中读取数据

      ```java
      @WebServlet("/ServletDemo7")
      public class ServletDemo7 extends HttpServlet {
          protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
              // 获取请求体  请求参数
      
              // 1. 获取字符流
              BufferedReader br = request.getReader();
              // 2. 读取数据
              String line = null;
              while ((line = br.readLine()) != null){
                  System.out.println(line);
              }
          }
      
          protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          }
      }
      ```



### 其他功能：


1. 获取请求参数通用方式：不论get还是post请求方式都可以使用下列方法来获取请求参数


```java
   1. String getParameter(String name):根据参数名称获取参数值    username=zs&password=123
   2. String[] getParameterValues(String name):根据参数名称获取参数值的数组  hobby=xx&hobby=game
   3. Enumeration<String> getParameterNames():获取所有请求的参数名称
   4. Map<String,String[]> getParameterMap():获取所有参数的map集合

```

2. 请求转发：一种在服务器内部的资源跳转方式
  
    步骤：

```java
        1. 通过request对象获取请求转发器对象：RequestDispatcher getRequestDispatcher(String path)
        2. 使用RequestDispatcher对象来进行转发：forward(ServletRequest request, ServletResponse response) 
```

关于中文乱码的问题

```java
        get方式：tomcat 8 已经将get方式乱码问题解决了
        post方式：会乱码
        解决：在获取参数前，设置request的编码request.setCharacterEncoding("utf-8");
```

3. 请求转发，资源跳转的方式
  
  步骤：

```java
        1. 通过request对象获取请求转发器对象：RequestDispatcher getRequestDispatcher(String path)
        2. 使用RequestDispatcher对象来进行转发：forward(ServletRequest request, ServletResponse response) 
```
