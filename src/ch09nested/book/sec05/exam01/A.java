package ch09nested.book.sec05.exam01;

public class A {
    int field1;
    void method1() {

    }

    static int field2;
    static void method2() {

    }

    class B {
        void method() {
            field1 = 10;
            method1();
            //--------------OK
            field2 = 10;
            method2();
            //--------------OK
        }
    }
    static class C {
        void method() {
//            field1 = 10;
//            method1();
            //--------------X (static 멤버는 instance 멤버에 접근 불가능 예시)
            field2 = 10;
            method2();
            //--------------OK
        }
    }
}
