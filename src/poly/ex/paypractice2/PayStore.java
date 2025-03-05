package poly.ex.paypractice2;

public class PayStore{
    public static Pay payOption(String option) {
        if (option.equals("kakao")) { //문자열 비교는 ==가 아니라 .equals
            return new KakaoPay();
        }
        else if (option.equals("naver")) {
            return new NaverPay();
        }
        else {
            return new DefaultPay();
        }
    }
}
