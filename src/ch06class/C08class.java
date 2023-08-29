package ch06class;

public class C08class {
    public static void main(String[] args) {
        MyClass08 o1 = new MyClass08();
        o1.name = "java";
        o1.printName();

        // static 멤버는 클래스로 바로 접근 할 것
        MyClass08.name = "spring";
        MyClass08.printName();
    }
}

class MyClass08 {
    static String name;

    static void printName() {
        System.out.println("name = " + name);
    }
}