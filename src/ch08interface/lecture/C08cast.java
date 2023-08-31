package ch08interface.lecture;

public class C08cast {
    public static void main(String[] args) {
        MyInterface08 i1 = new MyClass081();
        i1.method1();

//        i1.othermethod(); // X
        MyClass081 o1 = (MyClass081) i1;
        o1.othermethod();
    }
}
interface MyInterface08 {
    void method1();
}

class MyClass081 implements MyInterface08 {
    @Override
    public void method1() {
        System.out.println("MyClass.method1");
    }

    public void othermethod() {

    }
}