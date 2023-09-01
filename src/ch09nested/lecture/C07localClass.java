package ch09nested.lecture;

public class C07localClass {
    void method1() {
        // 로컬클래스를 감싸고 있는 메소드의 지역변수는 값을 변경할 수 없다 (final, effectively final)
        int value = 0;
//        value = 1;
        class LocalClass {
            void method() {
                System.out.println(value);
            }
        }
    }

    void method2(int param) {
        // 파라미터의 값 변경 불가능
//        param = 3;
        class LocalClass {
            void method() {
                System.out.println(param);
            }
        }
    }

}
