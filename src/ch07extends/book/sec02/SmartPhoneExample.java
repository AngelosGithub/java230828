package ch07extends.book.sec02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("갤럭시","은색");

        System.out.println("model = " + myPhone.model);
        System.out.println("color = " + myPhone.color);

        System.out.println("와이파이 상태 = "+myPhone.wifi);

        myPhone.bell();
        myPhone.sendVoice("여보세요?");
        myPhone.receiveVoice("안녕하세요! 홍길동이에요");
        myPhone.sendVoice("아~ 네 반갑습니다");
        myPhone.hangUp();

        myPhone.setWifi(true);
        myPhone.internet();
    }
}
