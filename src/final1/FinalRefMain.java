package final1;

public class FinalRefMain {

    public static void main(String[] args) {
        final Data data = new Data();
        //data = new Data(); //변수 선언 시점에 참조값을 이미 할당함 .참조값이 이미 들어있는 final이라 변경 불가

        //참조 대상의 값은 변경 가능
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
