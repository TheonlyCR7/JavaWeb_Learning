## Tomcat

web服务器软件

Tomcat目录结构

![image-20200530095501557](img/image-20200530095501557.png)

通过bin目录下的 startup.bat来开启服务

保持开启状态

浏览器输入 http://localhost:8080

![image-20200530101709252](img/image-20200530101709252.png)

http://别人的IP:8080

可能遇到的问题：

*   黑窗口一闪而过：

    原因：没有正确配置环境变量JAVA_HOME

*   启动报错：

    找到占用的端口号，杀死进程

    cmd运行

    ```cmd
    netstate -ano
    ```

    找到本地地址对应的端口号，关闭即可

    ![image-20200530102406872](img/image-20200530102406872.png)

    

    或者是修改自身的端口号

    在conf中的server.xml中修改端口号

    ```xml
    <Connector port="8888" protocol="HTTP/1.1"
    		               connectionTimeout="20000"
    		               redirectPort="8445" />
    ```

    一般会将tomcat的默认端口号修改为80。80端口号是http协议的默认端口号
    好处：在访问时，就不用输入端口号

*   关闭

    运行 shutdown.bat

    或者在startup.bat   运行 ctrl + c

*   配置

    部署项目的方法：

    *   将项目直接放到webapps文件夹中即可

        /hello：项目的访问路径-->虚拟目录
        简化部署：将项目打成一个war包，再将war包放置到webapps目录下。
        war包会自动解压缩

    *   在配置文件中设置con/server.xml文件

        在<Host> 标签体中配置

        <Context docBase="D:\hello" path="/hehe" />
        docBase:项目存放的路径
        path：虚拟目录

    * 在conf.Catalina/localhost 创建任意名称的 xml 文件，在文件中编写

        <Context docBase="D:\hello" />

        虚拟目录：xml文件的名称