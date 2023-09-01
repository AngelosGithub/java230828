package ch08interface.book.sec05;

public class Television implements RemoteControl{
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("TV 켠다");
    }

    @Override
    public void turnOff() {
        System.out.println("TV 끈다");
    }

    public void setVolume(int volume) {
        if (volume>RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume<RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("TV 현재 볼륨 : "+this.volume);
    }
}
