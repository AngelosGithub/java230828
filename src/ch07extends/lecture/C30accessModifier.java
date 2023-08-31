package ch07extends.lecture;

public class C30accessModifier {
    // 접근제한자 (access modifier)
    // public : 가장 넓은 범위 어디서든 접근 가능
    // protected : 같은 패키지 내, 다른 패키지에 있는 상속한 자식클래스에서 접근 가능
    // (package private, default) : 같은 패키지 내 에서만 접근 가능
    // private : 가장 좁은 범위 클래스 내 에서만 접근 가능

    public static void main(String[] args) {
        MyClass30 o1 = new MyClass30();

        o1.publicMethod();
        o1.packagePrivateMethod();
//        o1.privateMethod();  //  안됨
        o1.protectedMethod();
    }




}
