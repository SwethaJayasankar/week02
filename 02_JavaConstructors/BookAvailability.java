class Book{
	String title;
	String author;
	int price;
	boolean  available;
	
	public Book(){
		this.title = "God of Small Things";
		this.author = "Arundathi Roy";
		this.price = 500;
		this.available = true;
	}
	public Book(String title,String author,int price,boolean available){
		this.title = title;
		this.author = author;
		this.price = price;
		this.available = available;
	}
	
	public void borrow(){
		if(available){
			available = !available;
			System.out.println("You can borrow this book");
		}else{
			System.out.println("Book is not available now. Sorry ! ");
		}
	}
}

public class BookAvailability{
	public static void main(String[] args){
		Book b = new Book();
		b.borrow();
		b.borrow();
		
	}
}