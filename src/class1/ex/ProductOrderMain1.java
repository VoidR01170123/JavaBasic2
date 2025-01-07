package class1.ex;

public class ProductOrderMain1 {
    public static void main(String[] args) {
        ProductOrder[] prodcutorders = new ProductOrder[3]; //ProductOrder 클래스를 받을 수 있는 크기 3의 배열 productorders 공간 할당

        ProductOrder productorder1 = new ProductOrder(); // 객체 저장 공간 할당
        productorder1.productName = "두부"; //할당한 공간으로 접근해서 작성
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

        int sum = 0; //총 결제 금액 저장을 위한 변수 선언
        
        for (ProductOrder prodcutorder : prodcutorders) { //for-each문. 배열 productorders에 접근해, 그 안의 요소들을 전부 prodcutorder에 넣고 아래 블록을 실행
            System.out.println("상품명: " + prodcutorder.productName + ". 가격: " + prodcutorder.price + ", 수량: " + prodcutorder.quantity);
            sum += prodcutorder.price * prodcutorder.quantity;
        }
        System.out.println("총 결제 금액: " + sum);










    }
}
