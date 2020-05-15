import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
    public static void main(String[] args) throws IOException {
        // 1.创建流对象
        // 1.1 指定数据源
        FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\231.jpg");
        // 1.2 指定目的地
        FileOutputStream fos = new FileOutputStream("test_copy.jpg");

        File files = new File("C:\\Users\\Administrator\\Desktop\\231.jpg");
        System.out.println(files.length());
        int  n = (int)files.length();
        System.out.println(n);
        // 2.读写数据
        // 2.1 定义数组
        byte[] b = new byte[n];
        // 2.2 定义长度
        int len;
        // 2.3 循环读取
        while ((len = fis.read(b))!=-1) {
            // 2.4 写出数据
            fos.write(b, 0 , len);
        }

        // 3.关闭资源
        fos.close();
        fis.close();
    }
}
