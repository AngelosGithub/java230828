package ch09nested.book.sec07.exam02;

public class HomeExample {
    public static void main(String[] args) {
        Home home = new Home();
        // 필드 사용
        home.use1();
        // 메소드 사용
        home.use2();
        // 매개변수 사용
        home.use3(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("난방을 켜다");
            }

            @Override
            public void turnOff() {
                System.out.println("난방을 끄다");
            }
        });
    }
}
