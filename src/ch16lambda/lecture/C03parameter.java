package ch16lambda.lecture;

public class C03parameter {
    public static void main(String[] args) {
        MyInterface03 o1 = (int x, int y) -> {/*몸통*/};
        MyInterface03 o2 = (x, y) -> {/*몸통*/};

    }
}

@FunctionalInterface
interface MyInterface03 {
    void method(int x, int y);
}