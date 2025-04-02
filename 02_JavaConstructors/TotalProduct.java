class Product{
	String productName;
	int price;
	static int totalProduct=0;
	
	
	public Product(String productName,int price){
		this.productName = productName;
		this.price = price;
		totalProduct++;
	}
	
	public void display(){
		System.out.println("Product name : "+ productName);
		System.out.println("Product price : "+ price);
		System.out.println("Total Product  : "+ totalProduct);
	}
}

public class TotalProduct{
	public static void main(String[] args){
		Product m = new Product("Milk",10);
		Product c = new Product("Curd",15);
		c.display();
		
	}
}