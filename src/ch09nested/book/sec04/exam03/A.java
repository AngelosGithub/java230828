package ch09nested.book.sec04.exam03;

public class A {
    public void method1(int arg) {
        int var = 1;

        class B {
            void method2() {
                System.out.println("arg = " + arg);
                System.out.println("var = " + var);

                //로컬 변수 수정 불가능
//                arg = 2;
//                var = 3;
            }
        }
        B b = new B();
        b.method2();

        //로컬 변수 수정 불가능
//        arg = 2;
//        var = 3;
    }
}
