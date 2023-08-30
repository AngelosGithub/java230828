package ch07extends.lecture;

public class C25abstract {
    public static void main(String[] args) {
        Dog25 d1 = new Dog25();
        Cat25 c1 = new Cat25();

        Animal25 a1 = d1;
        Animal25 a2 = c1;

//        Animal25 a3 = new Animal25(); // 안되게
    }
}

// 추상클래스로(abstract class)는 인스턴스 생성불가
abstract class Animal25 {
    // 필드
    // 생성자
    // 메소드
    // 입력 가능
}
class Dog25 extends Animal25 {

}
class Cat25 extends Animal25 {

}