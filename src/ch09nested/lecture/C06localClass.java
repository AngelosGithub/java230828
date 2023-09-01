package ch09nested.lecture;

public class C06localClass {
    public static void method1() {
        class LocalClass {

        }
    }

    public void method2() {
        class LocalClass {
            // 필드,생성자,메소드
            // 메소드 내에서 한번만 사용하는 일회용 클래스
        }
        LocalClass o1 = new LocalClass();
    }
}


