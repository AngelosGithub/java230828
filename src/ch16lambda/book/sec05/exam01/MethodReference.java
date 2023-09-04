package ch16lambda.book.sec05.exam01;

import ch07extends.book.exercise.p12.C;

public class MethodReference {
    public static void main(String[] args) {
        Person person = new Person();


        // 정적(static) 메소드 호출
        person.action(Computer :: staticMethod);

        // 인스턴스 메소드 호출
        Computer com = new Computer();

        person.action(com :: instanceMethod);
    }
}
