package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10]; //Item이 들어갈 수 있는 배열 items를 크기 10으로 생성함. 즉, 10개 담을 수 있는 카트
    private int itemCount; //초기값 0 // 몇 개 넣었는지 세는 용도.

    public void addItem(Item item) { //item 클래스의 Item메서드를 이용해서 입력받고, 그것을 items 배열에 넣고 카운트를 올림.
        if (itemCount >= items.length) { // 최대값 10
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {//이제 배열에 담은 것들을 하나씩 인덱스를 올려가면서 item에 대입해서 출력
            Item item = items[i];
            System.out.println("상품명:" + item.getName() + " 합계:" + item.getTotalPrice());
        }
        System.out.println("전체 가격 합:" + calculateTotalPrice());
    }

    private int calculateTotalPrice() {//이 안에서만 사용하는 메서드이므로 private 접근제어자.
        int totalprice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalprice += item.getTotalPrice();
        }
        return totalprice;
    }
}
