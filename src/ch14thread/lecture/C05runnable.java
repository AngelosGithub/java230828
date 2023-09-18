package ch14thread.lecture;

public class C05runnable {
    public static void main(String[] args) {
//        Runnable r1 = new MyRunnable();
//        Thread thread = new Thread(r1);
        Thread thread = new Thread(new MyRunnable());

        thread.start();
    }
}

class MyRunnable implements Runnable {
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
