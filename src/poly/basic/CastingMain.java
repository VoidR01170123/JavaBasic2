package poly.basic;

public class CastingMain {

    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child(); //x001
        //단, 자식의 기능은 호출할 수 없다. 컴파일 오류 발생
        //poly.childMethod();

        //다운캐스팅(부모 타입 -> 자식 타입)
        Child child = (Child)poly; //x001 //poly는 Parent 타입이라 Child타입에 대입할 수 없지만, 다음과 같이 강제로
        //대입할 수 있다. 이를 다운캐스팅이라고 한다. 이렇게 특정 타입으로 괄호를 통해 변경하는 걸 캐스팅이라고 한다.
        child.childMethod();
    }
}
