package ch06class;

public class C05class {
    public static void main(String[] args) {
        MyClass05 o1 = new MyClass05();
        MyClass05 o2 = new MyClass05();

        System.out.println("o1 의 참조값 = " + System.identityHashCode(o1));

        o1.age = 30;
        o1.model = "java"; // 값을 넣은게 인스턴스인지 클래스인지 모호해서 권장x
        MyClass05.model = "spring"; // 클래스에 변수를 넣은게 명확함 (권장)

        System.out.println("o1.age = " + o1.age); // 30
        System.out.println("o2.age = " + o2.age); // 0

        System.out.println("o1.model = " + o1.model); // java
        System.out.println("o2.model = " + o2.model); // java
    }
}
class MyClass05 {
    // 속성(fields)
    int age; // instance field

    // static field, class field, 정적필드
    static  String model;
}