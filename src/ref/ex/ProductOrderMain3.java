package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int size1 = scanner.nextInt();
        scanner.nextLine();//int 받은 뒤에는 이거 해주기

        ProductOrder[] productorders = new ProductOrder[size1];

        for (int i = 0; i < productorders.length; i++) {
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = scanner.nextLine();

            System.out.print("가격: ");
            int price = scanner.nextInt();

            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            productorders[i] = createOrder(productName, price, quantity);
        }

        printOrders(productorders);
        int totalAmount = getTotalAmount(productorders); //ctrl alt v 단축키
        System.out.println("총 결제 금액: " + totalAmount);
    }

    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder productorder = new ProductOrder();
        productorder.productName = productName;
        productorder.price = price;
        productorder.quantity = quantity;
        return productorder;
    }

    static void printOrders(ProductOrder[] productorders) {
        for (ProductOrder prodcutorder : productorders) {
            System.out.println("상품명: " + prodcutorder.productName + ". 가격: " + prodcutorder.price + ", 수량: " + prodcutorder.quantity);
        }
    }
    static int getTotalAmount(ProductOrder[] productorders) {
        int totalAmount = 0;
        for (ProductOrder productorder : productorders) {
            totalAmount += productorder.price * productorder.quantity;
        }
            return totalAmount;
        }
}


