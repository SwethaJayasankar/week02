
class Book {
    public String isbn;
    protected String title;
    private String author;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String setAuthor(String name) {
        this.author = name;
        return author;
    }
}

class EBook extends Book {
    public EBook(String isbn, String title, String author) {
        super(isbn, title, author);
    }

    public void display() {
        System.out.println("Accessing protected variable title name through this subclass");
        System.out.println("Title: " + title);
        System.out.println("ISBN: " + isbn);
        System.out.println("Author: " + super.getAuthor());
        System.out.println(
                "After setting author name through public method setAuthor, author is :" + super.setAuthor("John"));

    }
}

public class Library {
    public static void main(String[] args) {
        EBook eb = new EBook("Isbn01", "Ikigai", "MuraKami");
        eb.display();
    }
}
