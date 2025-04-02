class Book{
	
	String title;
	String author;
	int price;
	
	void display(String title,String author,int price){
		System.out.println("Title of the book : " + title);
		System.out.println("Author of the book : " + author);
		System.out.println("Price of the book : " + price);
	}
	
}

public class BookDisplay{
	public static void main(String[] args){
		Book b = new Book();
		b.display("God of small things " ,"Arundathi Roy",500);
		
	}
}