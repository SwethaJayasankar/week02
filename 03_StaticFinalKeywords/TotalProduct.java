class Product{
	String productName;
	int price;
	int quantity;
	static int totalProduct=0;
	final int productId;
	static int discountPercentage = 5;
	
	
	public Product(String productName,int price,int quantity,int productId) {
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.productId = productId;
		totalProduct++;
	}
	public void modifyDiscount(int d){
		discountPercentage = d;
	}
	
	public void display(){
		System.out.println("Product name : "+ productName);
		System.out.println("Product price : "+ price);
		System.out.println("Product quantity : "+ quantity);
		System.out.println("Product id : "+ productId);
		System.out.println("Total Product  : "+ totalProduct);
		System.out.println("Discount percentage : "+ discountPercentage);
		System.out.println("Discount amount : "+ (price * discountPercentage / 100));
		System.out.println("modifying discount percentage to 15........");
		modifyDiscount(15);
		System.out.println("Discount amount after modification : "+ (price * discountPercentage / 100));

	}
}

public class TotalProduct{
	public static void main(String[] args){
		Product m = new Product("Milk",10,4,23);
		Product c = new Product("Curd",15,3,43);
		if(c instanceof  Product){
			c.display();
		}
		
		
	}
}