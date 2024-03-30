package test13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Filetream {
    public static void main(String[] args) throws FileNotFoundException {
        // 使用File对象创建流对象
        File file = new File("D:\\test\\dir2\\a.txt");
        // 创建写入 a.txt 的文件流
        FileOutputStream fos1 = new FileOutputStream(file);
        // 使用文件名称创建流对象
        FileOutputStream fos2 = new FileOutputStream("D:\\test\\dir2\\b.txt");
    }
}
