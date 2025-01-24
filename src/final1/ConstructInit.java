package final1;

public class ConstructInit {
    final int value; //final을 필드에서 사용할 경우에는 생성자를 통해 초기화. 이는 초기값이 없기때문이며, 초기값이 있는 경우는
    //생성자를 통해서 초기값 설정 불가능

    public ConstructInit(int value) {
        this.value = value;
    }
}
