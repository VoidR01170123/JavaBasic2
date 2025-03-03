package poly.ex.pay1;

public abstract class PayStore {

        public static Pay findPay(String option) {
            if (option.equals("kakao")) { //문자열 비교는 ==가 아니라 .equals
                return new KakaoPay();
            }
            else if (option.equals("naver")) {
                return new NaverPay();
            }
            else if (option.equals("payPay")) {
                return new PayPay();
            }
            else {
                return new DefaultPay();
            }
        }
}
