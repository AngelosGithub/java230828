package ch13generic.lecture;

public class C02generic {
    public static void main(String[] args) {
        MyClass02<Object> o1 = new MyClass02<Object>();
        MyClass02<String> o2 = new MyClass02<String>();
        MyClass02<Integer> o3 = new MyClass02<Integer>();
        MyClass02<Boolean> o4 = new MyClass02<Boolean>();

//        MyClass02<int> o5 = new MyClass02<int>();  // 기본타입은 불가능

        MyClass02<Object> o6 = new MyClass02<>();  // 뒤에 오는 타입파라미터는 생략 가능
    }
}

// generic type : 정해지지 않은 타입
class MyClass02<T> {
    // <T> : 타입 파라미터
    private T a;
}