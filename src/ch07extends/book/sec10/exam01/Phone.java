package ch07extends.book.sec10.exam01;

public abstract class Phone {
    String owner;

    Phone (String owner) {
        this.owner = owner;
    }

    void turnOn() {
        System.out.println("전원 켜짐");
    }
    void turnOff() {
        System.out.println("전원 꺼짐");
    }
}
