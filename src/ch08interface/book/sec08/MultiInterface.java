package ch08interface.book.sec08;

public class MultiInterface {
    public static void main(String[] args) {
        // RemoteControl 인터페이스 변수 선언및 구현 객체 생성
        RemoteControl rc = new SmartTV();
        // RemoteControl 인터페이스에 선언된 추상 메소드만 호출 가능

        rc.turnOn();
        rc.turnOff();

        // Searchable 인터페이스 변수 선언 및 구현 객체 생성
        Searchable search = new SmartTV();
        // Searchable 인터페이스에 선언된 추상 메소드만 호출가능
        search.search("Https://www.youtube.com");
    }
}
