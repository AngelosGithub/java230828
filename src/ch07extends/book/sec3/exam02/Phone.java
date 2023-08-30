package ch07extends.book.sec3.exam02;

public class Phone {
    public String model;
    public String color;

    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
        System.out.println("Phone(String model, String color) 실행");
    }
    public Phone(String model){
        this.model = model;
    }
}
