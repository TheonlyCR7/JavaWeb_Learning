import java.net.*;
import java.io.*;

public class TCPClient {
    // 必须指定抛出异常
    public static void main(String[] args) throws IOException {
        // 1. 创建一个客户端对象Socket, 构造方法绑定服务器
        Socket socket = new Socket("127.0.0.1", 8888);
        // 2. 使用 Socket 对象方法 getOutputStream() 获取网络字节输出流 OutputStream 对象
        OutputStream os = socket.getOutputStream();
        // 3. 使用网络字节输出流 OutputStream 对象中的方法 write, 以字节形式给服务器发送数据
        os.write("Hello! Server".getBytes());
        // 4. 使用Socket 对象方法 getInputSteam() 获取网络字节输入流 InputStream 对象

    }
}
