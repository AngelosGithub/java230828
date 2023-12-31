package ch05reference.lecture;

public class C14enum {
    public static void main(String[] args) {
        MySeason v1 = MySeason.FALL;

        System.out.println("v1.toString() = " + v1.toString());
        System.out.println("v1.hashCode() = " + v1.hashCode());
        System.out.println("v1.equals(null) = " + v1.equals(null));

        // 값 이름
        System.out.println("v1.name() = " + v1.name());
        // 순서
        System.out.println("v1.ordinal() = " + v1.ordinal());

        System.out.println("v1 = " + v1);
    }
}

// Enum 을 상속받음
// 일반 class 처럼 사용 가능하나 그렇게 쓰지는 않음
enum MySeason {
    SPRING,
    SUMMER,
    FALL,
    WINTER
}
