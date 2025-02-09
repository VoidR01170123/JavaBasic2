package review_복습.ex_review;

public class Item {

    String name;
    int price;

    Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void print() {
        System.out.println("이름:" + name + ", 가격:" + price);
    }

    public int getPrice() {
        return price;
    }


}
