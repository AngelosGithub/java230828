package ch07extends.book.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = child;

        child.method1();
        child.method2();
        child.method3();

        parent.method1();
        parent.method2();
//        parent.method3();  //  호출 불가
    }
}
