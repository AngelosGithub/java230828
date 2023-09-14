package ch11exception.lecture;

public class C09catch {
    public static void main(String[] args) {
        try {
            int[] arr = {1,0};
            int i = 3 / arr[2];
            System.out.println("try내의 흐름");
            // 예상되는 exception이 여러개일 경우 catch 를 여러번 쓴다
        } catch (ArithmeticException e) {
            System.out.println("산술연산 오류!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("잘못된 인덱스!");
        }

        System.out.println("실행흐름 이어짐");

    }
}
