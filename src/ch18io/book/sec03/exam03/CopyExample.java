package ch18io.book.sec03.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {
    public static void main(String[] args) throws Exception {
        String originalFN = "C:/Temp/test.jpg";
        String targetFN = "C:/Temp/test2.jpg";

        InputStream is = new FileInputStream(originalFN);
        OutputStream os = new FileOutputStream(targetFN);

        byte[] data = new byte[1024];

        while (true) {
            int num = is.read(data);
            if(num == -1) break;
            os.write(data,0,num);
        }
        os.flush();
        os.close();
        is.close();

        System.out.println("복사됨");
    }
}
