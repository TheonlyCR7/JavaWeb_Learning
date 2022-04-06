package test14;

import java.io.FileInputStream;
import java.io.IOException;

public class Filein {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\test\\dir1\\test.txt");

        int letter = fis.read();
        System.out.println(letter);
        System.out.println((char)letter);

        byte[] bytes = new byte[4];
        int words = fis.read(bytes);
        System.out.println(words);
        for(byte by : bytes)
            System.out.print(by);

        fis.close();
    }
}
