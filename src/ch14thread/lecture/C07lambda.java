package ch14thread.lecture;

import javax.tools.Tool;
import java.awt.*;

public class C07lambda {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            for (int i=0;i<3;i++) {
                toolkit.beep();
                try {
                    Thread.sleep(500);
                } catch (Exception e) {

                }
            }
        });
        t1.start();
        Thread t2 = new Thread(() -> {
            for (int i=0;i<3;i++) {
                System.out.println("띵");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {

                }
            }
        });
        t2.start();
    }
}
