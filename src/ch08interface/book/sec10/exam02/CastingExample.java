package ch08interface.book.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {
        // 인터페이스 변수선언, 구현 객체 대입
        Vehicle vehicle = new Bus();

        //인터페이스로 호출
        vehicle.run();
//        vehicle.checkFare();  // X

        //강제 타입 변환 후 호출
        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();
    }
}
