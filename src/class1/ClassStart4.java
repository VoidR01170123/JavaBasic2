package class1;

public class ClassStart4 {

    public static void main(String[] args) {
        Student student1= new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.score = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.score = 80;

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        System.out.println("이름:" + students[0].name + " 나이:" + students[0].age + " 성적:" + students[0].score);
        System.out.println("이름:" + students[1].name + " 나이:" + students[1].age + " 성적:" + students[1].score);
    }

}//Student타입의 참조값을 보관한다.
//참조값은 그 메모리의 주소다.
//자바에서 대입은 항상 변수에 들어있는 값을 복사해서 전달한다
//복습완료
