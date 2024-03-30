package test14;

import java.io.FileInputStream;
import java.io.IOException;

public class Filein1 {
    public static void main(String[] args) throws IOException {
        int b;
        FileInputStream fis = new FileInputStream("D:\\test\\dir1\\test.txt");

        while ((b = fis.read())!=-1) {
            System.out.print((char)b);
        }
        System.out.println("\nexit");
        fis.close();
    }
}
