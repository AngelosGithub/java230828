package ch12api.book.sec06;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        //Boxing
        Integer obj = 100;
        System.out.println("obj = " + obj.intValue());

        //unBoxing
        int value = obj;
        System.out.println("value = " + value);

        // 연산시 unboxing
        int result = obj + 100;
        System.out.println("result = " + result);
    }
}
