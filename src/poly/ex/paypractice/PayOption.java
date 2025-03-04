package poly.ex.paypractice;

public class PayOption {
    public static Pay pay(String option) { // Pay 타입으로 바꿔줌으로서 바로 리턴. static은 객체없이 호출 가능
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
