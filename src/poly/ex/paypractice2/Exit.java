package poly.ex.paypractice2;

public class Exit {
    public static boolean paymentExit(String payOption) {
        if (payOption.equals("exit")) {
            System.out.println("결제를 종료합니다.");
            return false;
        } else {
            return true;
        }
    }
}
