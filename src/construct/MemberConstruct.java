package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //추가
    MemberConstruct(String name, int age) {
        this(name, age, 50);
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
//생성자 이름은 클래스 이름과 같아야한다.
//생성자는 반환타입이 없으므로 비워둔다.
//나머지는 메서드와 같다.