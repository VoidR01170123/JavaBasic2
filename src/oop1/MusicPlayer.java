package oop1;

public class MusicPlayer {

    int volume = 0;
    boolean isOn = false;

    // 전원 온오프
    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    // 볼륨 증가
    void volumeUp() {
        volume += 1;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }

    // 볼륨 감소
    void volumeDown() {
        volume -= 1;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }

    // 플레이어 상태
    void status() {
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
