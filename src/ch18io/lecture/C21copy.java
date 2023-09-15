package ch18io.lecture;

import java.io.*;

public class C21copy {
    // buffered 사용해서 그림파일 복사하기
    public static void main(String[] args) {
        String src = "";
        String des = "";

        try {
            InputStream is = new FileInputStream(src);
            OutputStream os = new FileOutputStream(des);

            try (is; os) {
                byte[] buf = new byte[1024];

                int len = 0;
                while ((len = is.read(buf)) != -1) {
                    os.write(buf,0,len);
                }
            }

            os.flush();
        }catch (IOException e) {
            throw new RuntimeException();
        }
    }

}
