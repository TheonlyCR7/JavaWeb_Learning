package test14;

import java.io.FileInputStream;
import java.io.IOException;

public class Filein2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\test\\dir1\\test.txt");
        byte[] words = new byte[2];
        int len;
        while((len = fis.read(words)) != -1){
            for(byte word : words)
                System.out.print((char)word);
            System.out.println();
        }
        System.out.println("exit");
        fis.close();
    }
}
