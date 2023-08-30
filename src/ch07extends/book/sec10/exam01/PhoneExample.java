package ch07extends.book.sec10.exam01;

public class PhoneExample {
    public static void main(String[] args) {
//        Phone p = new Phone(); // 추상클래스여서 인스턴스 만들기 불가능

        SmartPhone smartphone = new SmartPhone("홍길동");

        smartphone.turnOn();
        smartphone.internetSearch();
        smartphone.turnOff();
    }
}
