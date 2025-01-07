package class1.ex;

public class ProductOrderMain1 {
    public static void main(String[] args) {
        ProductOrder[] prodcutorders = new ProductOrder[3];
        int sum = 0;

        ProductOrder productorder1 = new ProductOrder();
        productorder1.productName = "두부";
        productorder1.price = 2000;
        productorder1.quantity = 2;
        prodcutorders[0] = productorder1;

        ProductOrder productorder2 = new ProductOrder();
        productorder2.productName = "김치";
        productorder2.price = 5000;
        productorder2.quantity = 1;
        prodcutorders[1] = productorder2;

        ProductOrder productorder3 = new ProductOrder();
        productorder3.productName = "콜라";
        productorder3.price = 1500;
        productorder3.quantity = 2;
        prodcutorders[2] = productorder3;

        for (ProductOrder prodcutorder : prodcutorders) {
            System.out.println("상품명: " + prodcutorder.productName + ". 가격: " + prodcutorder.price + ", 수량: " + prodcutorder.quantity);
            sum += prodcutorder.price * prodcutorder.quantity;
        }
        System.out.println("총 결제 금액: " + sum);










    }
}
