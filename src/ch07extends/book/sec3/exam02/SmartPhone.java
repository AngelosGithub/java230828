package ch07extends.book.sec3.exam02;

public class SmartPhone extends Phone {
    public SmartPhone(String model, String color) {
        super(model, color);
        System.out.println("SmartPhone(String model, String color) 실행");
    }
    public SmartPhone(String model) {
        super("기본모델");
        System.out.println("SmartPhone(String model, String color) 실행");
    }
}
