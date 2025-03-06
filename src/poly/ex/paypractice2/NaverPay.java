package poly.ex.paypractice2;

public class NaverPay implements Pay{

    @Override
    public boolean pay(int amount) {
        if (1 <= amount && amount <= 1000000) {
            System.out.println("네이버페이 시스템과 연결합니다.");
            System.out.println(amount + "원 결제를 시도합니다.");
            return true;
        } else {
            return false;
        }
    }
}
