package poly.ex4;

public class Cat extends AbstractAnimal { //ctrl o 하면 자동으로 필요한 거 생성해줌
    @Override
    public void sound() {
        System.out.println("야옹");
    }

    @Override
    public void move() {
        System.out.println("고양이 이동");
    }
}
