package ch07extends.lecture;

public class C24constructor {
}
class MyClass24 {
    int age;
    //파라미터 있는 생성자 작성하면
    //파라미터 없는 생성자(기본생성자)가 자동으로 삽입되지 않는다
    MyClass24(int age) {
        this.age = age;
    }
}

class MySubClass24 extends MyClass24 {
    // 명시적으로 상위클래스의 생성자 호출코드 작성
    MySubClass24() {
        super(30);
    }
}