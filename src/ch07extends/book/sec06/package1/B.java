package ch07extends.book.sec06.package1;
// 같은 패키지

public class B {
    //메소드 선언
    public void method() {
        A a = new A();
        a.field = "value";
        a.method();
    }
    // 직접 객체 생성해서 사용 가능
}
