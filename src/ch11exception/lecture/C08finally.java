package ch11exception.lecture;

public class C08finally {
    public static void main(String[] args) {
        try {
            System.out.println("코드 실행");
            return;
        } finally {
            // catch 사용 안하고 바로 쓸 수도 있다
            System.out.println("무조건 실행");
        }
    }
}
