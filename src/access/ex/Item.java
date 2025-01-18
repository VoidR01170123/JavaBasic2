package access.ex;

public class Item {

        private String name; // 접근제어자는 private로 해서 클래스 내에서만 접근 가능.
        private int price;
        private int quantity;

        public Item(String name, int price, int quantity) { //생성자. 매개변수를 받아 초기값을 정한다.
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public String getName() { //name을 reuturn해서 다른 클래스의 출력 메소드에서 응용하기때문에 public으로 한다.
            return name;
        }

    public int getTotalPrice() {
            return price * quantity;
    }
}
