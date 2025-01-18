package access.ex;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(); // ShoppingCart라는 객체 생성(클래스를 사용하기위해서는 반드시 생성해야함)

        Item item1 = new Item("마늘", 2000, 2); //Item 객체 item1,2 생성(생성자로 값 입력받음)
        Item item2 = new Item("상추", 3000, 4);

        cart.addItem(item1); // ShoppingCart 클래스 안에 있는 addItem 메서드를 가져옴. 매개변수로는 item을 받음
        cart.addItem(item2);

        cart.displayItems(); // 결과물 출력하는 메서드 호출
    }
}
