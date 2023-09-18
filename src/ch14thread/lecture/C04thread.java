package ch14thread.lecture;

import javax.tools.Tool;
import java.awt.*;

public class C04thread {
    public static void main(String[] args) {
        Thread thread = new MyThread();

        thread.start();

        Thread thread2 = new YourThread();

        thread2.start();
    }
}

class YourThread extends Thread {
    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i=0; i<5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }
}
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i=0; i<5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }
}
