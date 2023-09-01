package ch08interface.lecture;

public class C14staticMethod {
    public static void main(String[] args) {
        MyInterface14.method(); // public static 메소드 실행
        MyInterface14.method2();

//        MyInterface14.common(); // X
    }
}

interface MyInterface14 {
    // 필드 : public static final

    // 인스턴트 메소드 :
    // 추상메소드
    // 디폴트 메소드
    // 프라이빗 메소드

    // 정적(static)메소드 :
    // 퍼블릭 스태틱 메소드
    // 프라이빗 스태틱 메소드

    static void method() {
        System.out.println("MyInterface14.method");
        common();
    }
    static void method2() {
        System.out.println("MyInterface14.method2");
        common();
    }
    private static void common() {
        System.out.println("어떤 기능");
    }
}