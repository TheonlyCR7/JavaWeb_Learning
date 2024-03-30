package test13;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputwrite {
    public static void main(String[] args) throws IOException {
        // 创建流对象
        FileOutputStream fop1= new FileOutputStream("D:\\test\\dir2\\a.txt");
        fop1.write(97); // a
        fop1.write(98); // b

        fop1.close(); // 一定要关闭流

        FileOutputStream fop2= new FileOutputStream("D:\\test\\dir2\\b.txt");
        byte[] name = "我想给你两拳".getBytes();
        fop2.write(name);
        fop2.close();

        FileOutputStream fop3 = new FileOutputStream("D:\\test\\dir2\\c.txt");
        byte[] Cal = "abcdefg".getBytes();
        fop3.write(Cal, 1, 4);
        fop3.close();
    }
}
