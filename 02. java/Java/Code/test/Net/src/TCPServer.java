import java.net.*;
import java.io.*;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        // 1. 创建一个服务器对象 和系统要指定的端口号
        ServerSocket server = new ServerSocket(8888);
        // 2. 使用ServerSocket 对象中的方法 accept, 获取到请求的客户端对象 Socket
        Socket socket = server.accept();
        // 3. 使用Socket 对象方法 geInputStream() 获取网络字节输入流 InputStream 对象
        InputStream is = socket.getInputStream();
        // 4. 使用网络字节输入流InputStream 对象方法 read, 读取客户端发送的数据
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes, 0, len));
        // 5. 使用Socket 对象方法 getOutputStream() 获取网络字节输出流OutputStream对象
        OutputStream os = socket.getOutputStream();
        // 6. 使用网络字节输出流 OutputStream 对象方法 write 给客户端回写数据
        os.write("收到，谢谢".getBytes());
        // 7. 释放资源(Socket, ServerSocket)
        socket.close();
    }
}
