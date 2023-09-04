package ch16lambda.lecture;

public class C05return {
    public static void main(String[] args) {
        MyInterface05 o1 = () -> {
            System.out.println("명령문1");
            System.out.println("명령문2");
            return 0;
        };

        MyInterface05 o2 = () -> 0;
        MyInterface05 o3 = new MyInterface05() {
            @Override
            public int method1() {
                return 0;
            }
        };
    }
}
interface MyInterface05 {
    int method1();
}
class MyClass05 implements MyInterface05 {
    @Override
    public int method1() {
        if (true) {
            return 0;
        }
        return 0;
    }
}
