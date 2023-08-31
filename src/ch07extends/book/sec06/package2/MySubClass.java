package ch07extends.book.sec06.package2;

import ch07extends.book.sec06.package1.Myclass;

public class MySubClass extends Myclass {
    @Override
    public void method1() {
        super.method1();
    }

    @Override
    protected void method2() {
        super.method2();
    }

    @Override
    public void method3() {
        super.method3();
    }
}
