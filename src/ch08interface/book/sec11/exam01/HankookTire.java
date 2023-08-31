package ch08interface.book.sec11.exam01;

public class HankookTire implements Tire{
    @Override
    public void roll() {
        System.out.println("한국타이어 굴러감");
    }
}
