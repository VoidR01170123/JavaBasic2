package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentScores = {90, 80};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름:" + studentNames[i] + " 나이:" + studentAges[i] + " 성적:" + studentScores[i]);
        }
    }
}
//배열을 사용하여, ClassStart1을 리팩토링 할 수 있지만, 학생별로 관리하기가 어렵다.