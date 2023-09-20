package ch12api.lecture;

public class C34annotation {
    @MyAnnotation34(value = "seoul", address = "jeju")
    int field;

}

@interface MyAnnotation34 {
    // element

    // value element 는 사용시 생략 가능( element 여러개 쓸때는 생략 불가 )
    String value();
    String address();
}