package ch09nested.lecture;

public class C01nested {
    public static void main(String[] args) {
//        MyClass01.NestedClass01 o1 = new MyClass01.NestedClass01();  // X
        MyClass01 o1 = new MyClass01();
        MyClass01.NestedClass01 o2 = o1.new NestedClass01();
        // 외부클래스 호출하기
    }
}

class MyClass01 {
    // 중첩클래스
    // 외부 클래스 내 에서만 사용하기 위해 만듬
    class NestedClass01 {
        // 필드
        // 생성자
        // 메소드
    }
    void method1() {
        // 외부클래스 내에서 사용할 때
        NestedClass01 o1 = new NestedClass01();
    }
}