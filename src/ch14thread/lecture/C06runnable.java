package ch14thread.lecture;

import java.awt.*;
import java.util.TreeMap;

public class C06runnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<5;i++) {
                    System.out.println("띵");

                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {

                    }
                }
            }
        });
        thread.start();
        Thread thread1 = new Thread(new Runnable() {
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
        });
        thread1.start();
    }
}
