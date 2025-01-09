package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] productorders = new ProductOrder[3];


        productorders[0] = createOrder("두부", 2000, 2);
        productorders[1] = createOrder("김치", 5000, 1);
        productorders[2] = createOrder("콜라", 1500, 2);

        printOrders(productorders);
        int totalAmount = getTotalAmount(productorders);
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


