package ch09nested.lecture;

public class C04access {
    // static 멤버는 instance 멤버에 접근할 수 없다

    int inatanceField ;

    static int staticField;

    static class StaticNestedClass {
        void method() {
//            System.out.println(instanceField);  // x
            System.out.println(staticField);
        }
    }

    class InnerClass {
        void method1() {
            System.out.println(inatanceField);
            System.out.println(staticField);
        }
    }
}
