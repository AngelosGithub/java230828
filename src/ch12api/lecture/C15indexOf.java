package ch12api.lecture;

public class C15indexOf {
    public static void main(String[] args) {
        // indexOf : 특정 문자열이 시작하는 위치(index) 리턴

        String a = "spring";
        int index = a.indexOf("ring");
        System.out.println(index);

        System.out.println(a.indexOf("pr"));

        String b = "spring is spring";
        System.out.println(b.indexOf("ring"));

        int index1 = b.indexOf("ring", 2);
        System.out.println(index1);

        System.out.println(b.indexOf("ring", 3));
    }
}
