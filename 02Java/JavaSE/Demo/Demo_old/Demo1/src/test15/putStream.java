package test15;

import java.io.*;

public class putStream {
    public static void main(String[] args) throws IOException {
        // 定义文件路径
        String fileName = "Q:\\test\\test1.txt";
        // 创建流对象,默认UTF8编码
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(fileName));
        // 写出数据
        osw.write("你好");
        osw.close();

        // 定义文件路径
        String fileName2 = "Q:\\test\\test2.txt";
        // 创建流对象,指定GBK编码
        OutputStreamWriter osw2 = new OutputStreamWriter(new FileOutputStream(fileName2),"GBK");
        // 写出数据
        osw2.write("你好");
        osw2.close();
    }
}
