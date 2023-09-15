package ch18io.lecture;

import java.io.*;
import java.util.Scanner;

public class C03tryWithResource {
    OutputStream os = null;
    public void method1() {
        try {
            os = new FileOutputStream("");
            os.write(110);
            os.write(111);
            os.write(112);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void method2() {
        // try-with-resource 문법
        // 변수 타입은 AutoCloseable 이어야 함
        try(OutputStream os = new FileOutputStream("")) {
            os.write(33);
            os.write(67);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void method3() {

        try (
                FileOutputStream fos = new FileOutputStream("");
                FileInputStream fis = new FileInputStream("");
                ) {
            fos.write(234);
            fis.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void method4() {
        Scanner scanner = new Scanner("");
        try (scanner) {
            scanner.hasNext();
            scanner.next();
        }

    }

    public void method5() {

        try {
            FileInputStream fis = new FileInputStream("");
            FileOutputStream fos = new FileOutputStream("");

            try (fis;fos;) {
                fis.read();
                fos.write(33);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void method6() throws IOException {
        // 안좋은 코드임...

        FileOutputStream fos = new FileOutputStream("");
        FileInputStream fis = new FileInputStream("");

        fos.write(33);
        fis.read();

        fos.close();
        fis.close();
    }
}
