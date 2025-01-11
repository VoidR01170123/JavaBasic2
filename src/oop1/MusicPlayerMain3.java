package oop1;

public class MusicPlayerMain3 {

    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        on(data);
        volumeUp(data);
        volumeUp(data);
        volumeDown(data);
        status(data);
        off(data);
    }
    // 전원 온오프
    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    // 볼륨 증가
    static void volumeUp(MusicPlayerData data) {
        data.volume += 1;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    // 볼륨 감소
    static void volumeDown(MusicPlayerData data) {
        data.volume -= 1;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    // 플레이어 상태
    static void status(MusicPlayerData data) {
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
// 이 프로젝트에서 발생한 문제점 : 코드 자체는 문제없이 작성하였으나, 메서드를 퍼블릭 클래스 괄호 밖에 작성하여 오류가 발생.
// 메서드명, 변수명 등을 설정할 때, 조금 더 명확하게 할 필요성이 있어보임. ex. 플레이어 상태 표시 메서드를 status로 설정하였으나
// showStatus와 같이 조금 더 명확하게 설정하는 편이 좋아보임.
// data.isOn을 보면, boolean 타입이라, 그 자체가 true, false 값을 가진다. 따라서, data.isOn == true같은 표현은 불필요하고,
// 그냥 그 자체로 대입하면 된다.