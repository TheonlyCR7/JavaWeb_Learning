package test14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author just it
 */
public class Copyimg {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\test\\test.jpg");
        FileOutputStream fos = new FileOutputStream("D:\\test\\dir1\\test_copy.jpg");

        byte[] dataStream = new byte[2048];
        int len;
        while ((len = fis.read(dataStream)) != -1){
            fos.write(dataStream, 0 , dataStream.length);
        }

        fos.close();
        fis.close();
    }
}
