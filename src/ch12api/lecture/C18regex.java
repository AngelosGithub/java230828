package ch12api.lecture;

public class C18regex {
    public static void main(String[] args) {
        // regular expression = (정규 표현식)
        // 문자열의 패턴을 나타내는 기호들

        // 문자
        System.out.println("x".matches("x"));
        System.out.println("a".matches("a"));
        System.out.println("a".matches("x"));

        // 문자들
        System.out.println("xyz".matches("xyz"));
        System.out.println("xxx".matches("xxx"));
        System.out.println("xxx".matches("x"));

        // 수량자 (quantifiers)
        System.out.println("xxx".matches("x{3}"));
        System.out.println("aaa".matches("a{3}"));
        System.out.println("aa".matches("a{3}"));
        System.out.println("aaa".matches("a{1,3}"));
        System.out.println("a".matches("a{1,3}"));
        System.out.println("aa".matches("a{1,3}"));

        System.out.println("dog".matches("do{1,3}g"));
        System.out.println("dooog".matches("do{1,3}g"));
        System.out.println("doog".matches("do{1,3}g"));

        System.out.println("dodog".matches("do{1,3}g")); // false

        System.out.println("dodog".matches("(do){1,3}g")); // true

        // 수량 : n개 이상
        System.out.println("dog".matches("do{1,}g"));
        System.out.println("dooooooog".matches("do{1,}g"));
        System.out.println("dooog".matches("do{1,}g"));

        // ? : 없거나 한번
        System.out.println("dg".matches("do?g"));
        System.out.println("doog".matches("do?g")); // false

        // * : 0번 이상
        System.out.println("dg".matches("do*g"));
        System.out.println("dog".matches("do*g"));
        System.out.println("doog".matches("do*g"));
        System.out.println("dooog".matches("do*g"));
        System.out.println("doooog".matches("do*g")); // 전부 true

        // + : 1번 이상
        System.out.println("dg".matches("do+g")); // false
        System.out.println("dog".matches("do+g"));
        System.out.println("doog".matches("do+g"));
        System.out.println("dooog".matches("do+g"));
        System.out.println("doooog".matches("do+g"));

        // 문자 분류 (Character class)
        System.out.println("dog".matches("d[oi]g"));
        System.out.println("dig".matches("d[oi]g"));
        System.out.println("dag".matches("d[oi]g")); // false

        System.out.println("dog".matches("d[^oi]g")); // false
        System.out.println("dig".matches("d[^oi]g")); // false
        System.out.println("dag".matches("d[^oi]g"));

        // 문자 분류 기호
        System.out.println("0".matches("[0-9]"));
        System.out.println("7".matches("[0-9]"));
        System.out.println("7".matches("\\d"));
        System.out.println("7".matches("[\\d]"));
        // java에서 역슬래시를 따옴표 안에 쓸 경우 2번 쓴다

        System.out.println("a".matches("[a-zA-Z_0-9]"));
        System.out.println("_".matches("\\w"));
        System.out.println("8".matches("\\w"));

        // 예제 자바 변수명 작성 규칙 : 숫자로 시작안됨, 영문 대소문자, _, $
        String pattern = "[a-zA-Z_$][a-zA-Z_$0-9]*";
        System.out.println("23$page".matches(pattern));
        System.out.println("page$23".matches(pattern));
        System.out.println("$page23".matches(pattern));

        // 전화번호 패턴
        // 숫자 2~3개로 시작
        String ptn = "\\d{2,3}-?\\d{3,4}-?\\d{4}";
        System.out.println("01099999999".matches(ptn));
        System.out.println("010-9999-9999".matches(ptn));
        System.out.println("029999999".matches(ptn));
        System.out.println("02-9999-9999".matches(ptn));

        // 모든 문자 : .
        System.out.println(" ".matches("."));
        System.out.println("a".matches("."));
        System.out.println("3".matches("."));
        System.out.println("+".matches("."));
        System.out.println(".".matches("."));

        // . : \.
        System.out.println(" ".matches("\\.")); // false
        System.out.println("a".matches("\\.")); // false
        System.out.println("3".matches("\\.")); // false
        System.out.println("+".matches("\\.")); // false
        System.out.println(".".matches("\\.")); // true

        // 이메일 패턴
        // 영문 소문자 숫자 여러개 @ 영문 소문자 숫자 여러개 . 영문 소문자 숫자 여러개
        String eptn = "[a-z_0-9]+@[a-z_0-9]+\\.[a-z_0-9]+";
        String demo = "[a-z_0-9]*";
        System.out.println("fsda34@ffsaf.sd2d".matches(eptn));
        System.out.println("ffew34".matches(demo));

        // or : | ( pipe, or )
        System.out.println("asdfsddogfasdf".matches(".*dog.*"));
        System.out.println("asdfsddogfasdf".matches(".*(dog|cat).*"));
        System.out.println("asdfa23catfasdf5".matches(".*cat.*"));
        System.out.println("asdfa23catfasdf5".matches(".*(dog|cat).*"));



    }
}
