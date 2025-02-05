package extends1.overriding;

public class ElectricCar extends Car {

    @Override //에노테이션. 없어도 되지만, 실수했을 때 컴파일 오류가 뜨게 해줌. 따라서 거의 필수
    public void move() {

        System.out.println("전기차를 빠르게 이동합니다.");
    }


    public void charge() {
        System.out.println("충전합니다.");
    }
}
