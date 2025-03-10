package poly.ex.paypractice;

public class PayService {

    public void processPay(String option, int amount) {

        boolean result = false;
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

        Pay pay;
        pay = PayOption.pay(option);
        result =pay.pay(amount); // 이거 다시 보기e
        
        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}
