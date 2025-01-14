package construct.ex;

public class Book {
    String title;
    String author;
    int page;

    Book() {//이미 생성자를 만들어버려서, 자바가 기본 생성자를 안만들어줌
        this("", "", 0);
    }

    Book(String title, String author, int page){
        this.title = title;
        this.author = author;
        this.page = page;
    }

    Book(String title, String author) {
        this(title, author,0);
    }
    
    void displayInfo(){
        System.out.println("제목: " + title + ", 저자:" + author + ", 페이지:" + page);
       }
}






