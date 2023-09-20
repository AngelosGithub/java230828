package ch12api.lecture;

public class C35annotation {
    @MyAnnotation35(name = {"son", "lee"})
    int feild;

    @MyAnnotation35(name = "son")
    int feild2;
}
@interface MyAnnotation35 {
    String[] name();
}
