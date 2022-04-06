package test11;

import java.io.File;

public class Filetest {
    public static void main(String[] args) {
        String pathname = "D:\\Myblog\\blog\\source\\_posts\\java之File类.md";
        File file1 = new File(pathname); // 创建文件对象
        System.out.println("是否存在: " + file1.exists()); // 是否存在
        System.out.println("此File对象是否为目录: " + file1.isDirectory()); // 此File对象是否为目录
        System.out.println("此File对象是否为文件: " + file1.isFile()); // 此File对象是否为文件
        System.out.println("获取文件名字: " + file1.getName()); // 获取文件名字
        System.out.println("绝对路径: " + file1.getAbsoluteFile()); // 绝对路径
        System.out.println("绝对路径: " + file1.getPath()); // 绝对路径
        System.out.println("文件大小 单位字节: " + file1.length()); // 文件大小 单位字节
    }
}
