package poly.ex.paypractice;

public class PayService {

    public void processPay(String option, int amount) {

        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

        Pay pay;
        pay = PayOption.pay;

        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }

    public void result() {
        boolean result = false;
        
        result =pay.pay(amount);
        for (Object o : ) {
            
        }
    }
}
