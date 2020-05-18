import java.io.*;
import java.net.Socket;
// 客户端
public class FileUPload_Client {
    public static void main(String[] args) throws IOException {
        // 1. 创建一个本地字节流FileInputStream 对象, 构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("test1_copy.jpg");
        // 2. 使用Socket中方法getOutputStream, 获取网络字节输出流OutputStream对象
        Socket socket = new Socket("127.0.0.1", 8888);
        // 3. 使用Socket 中的方法getOutputStream, 获取网络字节输出流OutputStream对象
        OutputStream os = socket.getOutputStream();
        // 4. 使用本地字节输入流FileInputStream 对象中的方法read, 读取本地文件
        int len = 0;
        byte[] bytes = new byte[1024];
        // 循环读取文件字节
        while((len = fis.read(bytes))!= -1){
            // 5. 使用网络字节输出流OutputStream对象中的方法write, 把读取到的文件上传到服务器
            os.write(bytes, 0, len);
        }
        // 关闭套接字输出流  防止while 陷入死循环
        socket.shutdownOutput();
        // 6. 使用Socket中的方法getInputStream, 获取网络字节输入流 InputStream对象
        InputStream is = socket.getInputStream();
        // 7. 使用网络字节输入流InputStream 对象中的方法 read 读取服务器的数据
        while((len = is.read(bytes)) != -1){
            System.out.println(new String(bytes, 0, len));
        }
        // 8. 释放资源 FileInputStream Socket
        fis.close();
        socket.close();
    }
}
