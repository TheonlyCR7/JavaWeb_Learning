import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

// 服务器端     读取客户端上传文件，保存到服务器硬盘里
public class FileUpload_Server {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器 启动.....  ");
        // 1. 创建服务端ServerSocket  指定端口号
        ServerSocket server = new ServerSocket(8888);

       // 让服务器一直处于监听状态 （死循环 accept方法）
        while(true){
            Socket socket = server.accept();
            /*
                使用多线程技术,提高程序的效率
                有一个客户端上传文件,就开启一个线程,完成文件的上传
             */
            new Thread(new Runnable() {
                //完成文件的上传
                @Override
                public void run() {
                    try {
                        //3.使用Socket对象中的方法getInputStream,获取到网络字节输入流InputStream对象
                        InputStream is = socket.getInputStream();
                        //4.判断d:\\upload文件夹是否存在,不存在则创建
                        File file =  new File("d:\\upload");
                        if(!file.exists()){
                            file.mkdirs();
                        }

                    /*
                        自定义一个文件的命名规则:防止同名的文件被覆盖
                        规则:域名+毫秒值+随机数
                     */
                        String fileName = "itcast"+System.currentTimeMillis()
                                +new Random().nextInt(999999)+".jpg";

                        //5.创建一个本地字节输出流FileOutputStream对象,构造方法中绑定要输出的目的地
                        //FileOutputStream fos = new FileOutputStream(file+"\\1.jpg");
                        FileOutputStream fos = new FileOutputStream(file+"\\"+fileName);
                        //6.使用网络字节输入流InputStream对象中的方法read,读取客户端上传的文件


                        int len =0;
                        byte[] bytes = new byte[1024];
                        while((len = is.read(bytes))!=-1){
                            //7.使用本地字节输出流FileOutputStream对象中的方法write,把读取到的文件保存到服务器的硬盘上
                            fos.write(bytes,0,len);
                        }
                        //8.使用Socket对象中的方法getOutputStream,获取到网络字节输出流OutputStream对象
                        //9.使用网络字节输出流OutputStream对象中的方法write,给客户端回写"上传成功"
                        socket.getOutputStream().write("上传成功".getBytes());
                        //10.释放资源(FileOutputStream,Socket,ServerSocket)
                        fos.close();
                        socket.close();
                    }catch (IOException e){
                        System.out.println(e);
                    }
                }
            }).start();
        }
        // server.close();
    }
}
