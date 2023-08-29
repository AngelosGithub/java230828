package ch07extends.book.sec04.exam02;

public class SuperSonicAirplaneExample {
    public static void main(String[] args) {
        SupersonicAirplane sa = new SupersonicAirplane();
        sa.takeOff();
        sa.fly();
        sa.flyMode = SupersonicAirplane.supersonic;
        sa.fly();
        sa.flyMode = SupersonicAirplane.normal;
        sa.fly();
        sa.land();
    }
}
