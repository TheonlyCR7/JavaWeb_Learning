package test11;

import java.io.File;
import java.io.IOException;

public class test2 {
    public static void main(String[] args) throws IOException {

        File dir = new File("D:\\test");
        //获取当前目录下的文件以及文件夹的名称
        File[] names = dir.listFiles();
        assert names != null;
        for(File File : names){
            System.out.println(File);
        }
    }
}
