package class1;

public class Ex {
    public static void main(String[] args) {
        Student student1; //Student 클래스 선언( int a; 같은 느낌)
        student1 = new Student(); //메모리 만들기 ( int a 에 메모리 할당하는 느낌)
        //1. 객체 값 읽기
        System.out.println("이름:" + student1.name);
        //2. 변수에 있는 참조값을 통해 실제 객체에 접근하고, name 멤버 변수에 접근하다.
        //System.out.println("이름:" + x001.name);
        //3. 객체의 멤버 변수값을 읽어옴
        System.out.println("이름:" + "학생1");

    }
}
