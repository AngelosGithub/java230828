package ch11exception.lecture;

public class C19throws {
    public static void main(String[] args) throws ClassNotFoundException {
        method1();
    }
    public static void method1() throws ClassNotFoundException{
        System.out.println("code1");
        method2();
        // 여기서 code2를 출력(실행)하고싶다 하면 여기서 try-catch 사용한다
        System.out.println("code2");
    }
    public static void method2() throws ClassNotFoundException {
        method3();
    }
    public static void method3() throws ClassNotFoundException {

    }

}
