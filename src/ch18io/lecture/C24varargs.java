package ch18io.lecture;

public class C24varargs {
    public static void main(String[] args) {
        // varargs (가변인자) : ...
        // 없었을 때..
        method1(3);
        method1(3,5);
        method1(new int[] {10, 20, 30});

        // 만들어진 후
        method2(2);
        method2(3,4);
        method2(10, 20, 30);
    }
    // 주의할 점 : 파라미터 목록 마지막에만 작성 가능
    public static void method2 (int... nums) {
        // 사용법
        // 배열로 사용
        for (int i=0; i<nums.length; i++) {
            System.out.println("nums[i] = " + nums[i]);
        }
    }
    public static void method1(int a) {

    }
    public static void method1(int a, int b) {

    }
    public static void method1(int[] arr) {

    }
}
