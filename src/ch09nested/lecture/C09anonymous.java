package ch09nested.lecture;

public class C09anonymous {
    public static void main(String[] args) {
        MyClass09 o1 = new MySubClass091();

        o1.method1();

        // anonymous class (익명클래스) = 이름없는 클래스
        // 클래스 상속과 인스턴스 생성을 동시에 해서 클래스 이름이 없음
        MyClass09 o2 = new MyClass09() {
            // 자식클래스 몸통
            // 필드, 메소드
            // 생성자는 불가능


            @Override
            void method1() {
                System.out.println("C09anonymous.method1");
            }
        };
        o2.method1();
    }
}

class MyClass09 {
    void method1() {
        System.out.println("MyClass09.method1");
    }
}

class MySubClass091 extends MyClass09 {
    @Override
    void method1() {
        System.out.println("MySubClass091.method1");
    }
}