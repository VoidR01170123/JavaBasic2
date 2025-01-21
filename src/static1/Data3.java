package static1;

public class Data3 {
    public String name;
    public static int count; //static // name과 count 둘 다 멤버변수(필드)다. 이 중 static이 붙은 것은 클래스 변수(정적변수, static 변수),
    // 안붙은 것은 인스턴스 변수라고 한다.

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
