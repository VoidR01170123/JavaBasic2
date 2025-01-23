package static2.ex;

public class Car {

    private static int count;
    String name;

    public Car(String name) {
        System.out.println("차량 구입, 이름: " + name);
        this.name = name;
        count++;
    }

    public static void showTotalCar() {
        System.out.println("구매한 차량 수: " + count);
    }
}
