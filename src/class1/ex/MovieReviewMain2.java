package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview[] reviews = new MovieReview[2]; //MovieReview 타입을 담을 수 있는 배열을 형성함

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프"; //inception 인스턴스의 내용을 입력
        reviews[0] = inception; //위에서 만든 reviews 배열의 0번 인덱스에 inception 인스턴스의 참조값을 넣어줌

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화";
        reviews[1] = aboutTime;

        for (MovieReview review : reviews) {
            System.out.println("영화 제목: " + review.title + ", 리뷰: " + review.review);
        }//reviews 배열의 첫번째요소부터 끝까지 왼쪽에 선언한 review변수에 차례로 할당하여 블록 내 문장을 실행.
        //즉, reviews 배열내의 0번요소인 inception의 참조값을 가져와서, 왼쪽에 적은 review라고 선언한 변수에 대입.
        //그 상태에서 블록 내 문장을 실행하여 review.title(즉,inception.title), review.review(inception.title)에 접근하고
        //이를 반복해서 다음요소에도 실행하여 reviews배열 내의 모든 요소를 적용한다.
    }
}// 이 부분이 약간 이해가 부족한 듯. 배열과 for each 문 복습 필요.(복습완료)