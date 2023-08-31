package ch08interface.lecture;

import java.io.Serializable;
import java.lang.constant.Constable;

public class C10instanceof {
    public static void main(String[] args) {
//        instanceof
//        연산결과 : boolean
//        좌변 : 참조변수
//        우변 : 타입(클래스, 인터페이스 등등)
        CharSequence c = "java";

        boolean r1 = c instanceof String;
        boolean r2 = c instanceof Serializable;
        boolean r3 = c instanceof Constable;

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
    }
}
