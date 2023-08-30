package ch07extends.book.sec3.exam02;

import ch07extends.book.sec3.exam01.SmartPhone;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        System.out.println("model = " + myPhone.model);
        System.out.println("color = " + myPhone.color);
    }
}
