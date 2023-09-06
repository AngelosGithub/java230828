package ch12api.lecture;

public class C20wrapper {
    // wrapper class : 기본타입을 감싸고 있는 클래스

    // 기본타입 : byte, short, int, float, double, char, boolean
    //

    public static void main(String[] args) {
        // boxing
        int i = 500;
//        Integer j = new Integer(i); // boxing
        Integer k = Integer.valueOf(i); // boxing

        System.out.println(i);
//        System.out.println(j);
        System.out.println(k);

        // unboxing
        Integer l = Integer.valueOf(1000);
        int m = l.intValue(); // unboxing

        System.out.println(l);
        System.out.println(m);

        // auto boxing
        int n = 777;
        Integer o = n; // auto boxing

        // auto unboxing
        Integer p = Integer.valueOf(888);
        int q = p;
    }



}
