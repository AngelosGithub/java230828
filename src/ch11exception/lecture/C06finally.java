package ch11exception.lecture;

public class C06finally {
    public static void main(String[] args) {
        System.out.println("code1");
        System.out.println("code2");

        try {
            int i = 0;
            int j = 3/i;
            System.out.println("code3");

        } catch (ArithmeticException e) {
            System.out.println("exception code1");
        } finally {
            // exception 발생과 관계 없이 실행
            System.out.println("꼭 실행됨!");
        }

        System.out.println("code4");
    }
}
