package extend1.ex1;

public class CarMain {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }
}

/*상속 : 기존 클래스의 필드와 메서드를 새로운 클래스에서 재사용하게 해준다.extends 키워드를 사용한다. extends 대상은 하나만 가능하다.

- 부모클래스(슈퍼 클래스) : 상속을 통해 자신의 필드와 메서드를 다른 클래스에 제공하는 클래스
- 자식클래스(서브 클래스) : 부모 클래스로부터 필드와 메서드를 상속받는 클래스
*/
