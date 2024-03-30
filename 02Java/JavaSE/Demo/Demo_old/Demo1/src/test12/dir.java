package test12;

import java.io.File;

public class dir {
    public static void main(String[] args) {
        String path = "D:\\test";
        printer(path);
    }

    public static void printer(String pathname){
        File file1 = new File(pathname);
        if(!file1.exists()) return; // 若不存在 则直接返回

        if(file1.isDirectory()){
            String[] pathnames = file1.list(); // 创建文件(夹)数组

            assert pathnames != null;
            for(String name : pathnames){
                String Abpath = file1.getAbsolutePath() + "\\" + name;
                System.out.println(Abpath);
                printer(Abpath);  // 递归
            }
        }
    }
}
