package ch18io.lecture;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class C15reader {
    public static void main(String[] args) {
        String path = "C:/Temp/out7.txt";
        // 문자단위 입력 스트림
        try (Reader reader = new FileReader(path)) {
            int read = reader.read();
//            char c1 =
            int read1 = reader.read();
            int read2 = reader.read();

            System.out.println("read = " + read);
            System.out.println("read1 = " + read1);
            System.out.println("read2 = " + read2);

            char[] chars = new char[3];
            reader.read(chars);
            System.out.println("chars = " + Arrays.toString(chars));
            reader.read(chars);
            System.out.println("chars = " + Arrays.toString(chars));
            reader.read(chars);
            System.out.println("chars = " + Arrays.toString(chars));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
