package ch19network.lecture;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;

public class C01client {
    public static void main(String[] args) {
        // C09server와 연동해서 채팅프로그램 만들기 가능
        try {
            Socket socket = new Socket("172.30.1.81",7000);
            Writer writer = new OutputStreamWriter(socket.getOutputStream());
            BufferedWriter bw = new BufferedWriter(writer);

            try (socket; writer; bw) {
                bw.write("");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
