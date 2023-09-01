package ch09nested.book.sec03.exam02;

public class A {
    static class B {
        int field1 = 1;

        static int field2 = 2;

        B() {
            System.out.println("B.B 생성자");
        }

        void method1() {
            System.out.println("B.method1");
        }

        static void method2() {
            System.out.println("B.method2");
        }
    }
}
