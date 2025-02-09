package review_복습.ex_review;

public class Book extends Item {

    private String author;
    private int isbn;

    Book(String name, int price, String author, int isbn) {
        super(name,price);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void print() {
     super.print();
        System.out.println("- 저자:" + author + ", isbn:" + isbn);
    }
}
