package ch09nested.book.sec04.exam01;

public class A {
    // p402
    A() {
        class B {

        }
        B b = new B();
    }

    void method() {
        class B {

        }
        B b = new B();
    }
}
