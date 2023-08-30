package ch07extends.book.sec10.exam02;

public abstract class Animal {
    public void breath() {
        System.out.println("숨을 쉰다");
    }

    // 추상메소드
    public abstract void sound();
}
