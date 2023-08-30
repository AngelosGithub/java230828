package ch07extends.book.sec3.exam01;

public class SmartPhone extends Phone {
    public SmartPhone(String model, String color){
        super();
        this.model = model;
        this.color = color;
        System.out.println("SmartPhone(String model, String color) 실행됨");
    }
}
