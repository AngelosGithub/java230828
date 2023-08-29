package ch06class;

public class C09static {
}

class MyClass09 {
    String name;

    static String model;

    // instance 메소드
    void printName() {
        // instance 멤버끼리 접근 가능
        System.out.println("name = " + name);

        // instance 멤버에서 static 멤버에 접근가능
        System.out.println("model = " + model);
    }
    // static 메소드
    static void printModel() {
        // static 멤버에서 instance 멤버에게 접근 불가능
//        System.out.println("name = " + name);  // 오류

        // static 멤버끼리 접근 가능
        System.out.println("model = " + model);
    }
}
