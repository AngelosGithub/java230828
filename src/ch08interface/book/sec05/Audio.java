package ch08interface.book.sec05;

public class Audio implements RemoteControl{
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("오디오 켠다");
    }

    @Override
    public void turnOff() {
        System.out.println("오디오 끈다");
    }

    @Override
    public void setVolume(int volume) {
        if(volume>RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume<MIN_VOLUME) {
            this.volume = MIN_VOLUME;
            // RemoteControl << 생략가능
        } else {
            this.volume = volume;
        }
        System.out.println("현재 오디오 볼륨 : "+volume);
    }

    private int memoryVolume; // 추가 필드 생성

    //------------------------------------------------추가된 내용
    @Override
    public void setMute(boolean mute) {
        if (mute) {
            this.memoryVolume = this.volume;
            System.out.println("무음처리 합니다");
            setVolume(RemoteControl.MIN_VOLUME);
        } else {
            System.out.println("무음해제 합니다");
            setVolume(this.memoryVolume); // mute 가 false 일때 원래 볼륨으로 복원 하는 코드
        }
    }
    //----------------------------------------------------------
}
