package ch07extends.lecture;

public class C06override {
    public static void main(String[] args) {
        MySubClass061 o1 = new MySubClass061();
        o1.method10();
    }
}

class MyClass06 {
    public void method10() {
        System.out.println("부모클래스의 메소드");
    }
}
class MySubClass061 extends MyClass06 {
    // 문장을 바꾸는(재정의 하는) 메소드 작성
    @Override // 컴파일 할때 재정의한 메소드인지 검증해줌
    public void method10() {
        System.out.println("자식클래스의 메소드");
    }
}