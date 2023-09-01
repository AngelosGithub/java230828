package ch09nested.book.sec04.exam02;

public class A {
    //p403
    void useB() {
        class B {
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
        B b = new B();

        System.out.println(b.field1);
        b.method1();

        // 자바 17부터 허용
        System.out.println(B.field2);
        B.method2();
    }
}
