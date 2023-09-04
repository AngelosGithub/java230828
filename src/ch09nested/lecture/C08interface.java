package ch09nested.lecture;

public class C08interface {
    public static void main(String[] args) {
        class concreteClass implements MyClass08.NestedInterface {
            @Override
            public void method2() {

            }
        }
    }
}

class MyClass081 implements MyClass08.NestedInterface {
    @Override
    public void method2() {
        System.out.println("MyClass081.method2");
    }
}

class MyClass08 {
    interface NestedInterface {
        void method2();
    }

    void method1() {
        class ConcreteClass implements NestedInterface {
            @Override
            public void method2() {
                System.out.println("ConcreteClass.method2");
            }
        }
    }
}
