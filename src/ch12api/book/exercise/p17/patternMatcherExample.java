package ch12api.book.exercise.p17;

import java.util.regex.Pattern;

public class patternMatcherExample {
    public static void main(String[] args) {
        String id = "5Angel1004";
//        String regExp = "[a-zA-Z][a-zA-Z_0-9]{8,12}";
        String regExp = "[a-zA-Z][a-zA-Z_0-9]{7,11}";
        System.out.println("5Angel1004".matches(regExp));
        System.out.println("Angel1004".matches(regExp));
//        boolean isMatch = id.matches(regExp);
        boolean isMatch = Pattern.matches(regExp, id);

        if (isMatch) {
            System.out.println("사용 가능");
        } else {
            System.out.println("사용 불가");
        }
    }
}
