import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
    String title;
    String author;
    public  Book(String title,String author){
        this.title = title;
        this.author = author;
    }
}

public class LibraryAndBook{
    List<Book> books = new ArrayList<Book>();
    Scanner sc = new Scanner(System.in);

    
    public void createAndAddBook(){
        System.out.println("Creating a book : ");
        System.out.println("Enter title : ");
        String t = sc.next();
        System.out.println("Enter author : ");
        String a = sc.next();
        Book b = new Book(t,a);
        System.out.println("Book is created");
        books.add(b);

    }
    public static void displayLibraryBooks(LibraryAndBook l){
        for(Book b : l.books){
            System.out.println("Title : " + b.title + " Author : " + b.author);
        }

    }

    public static void main(String[] args) {
        LibraryAndBook l = new LibraryAndBook();
        for(int i=0;i<5;i++){
            l.createAndAddBook();
        }
        displayLibraryBooks(l);
        
    }

}

