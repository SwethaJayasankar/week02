import java.util.ArrayList;
import java.util.List;
class CartItem{
	String name;
	int price;
	int quantity ;	
	CartItem(String a,int b,int c){
		name = a;
		price = b;
		quantity = c;
	}
	String getName(){
		return name;
	}	
	int getPrice(){
		return price;
	}
	
	int getCost(){
		return price*quantity;
	}	
}

class Cart{
	List<CartItem> cart = new ArrayList<CartItem>();
	
	//additem
	public void addItem(String name,int price,int quantity){
		cart.add(new CartItem(name,price,quantity));
	}
	//remove item
	public void removeItem(String name){
		cart.removeIf((i)->i.getName().equalsIgnoreCase(name));
	}
	//total cost
	public void displayCost(){
		int total = 0;
		for(CartItem c : cart ){
			total += c.getCost();
		}
		System.out.println("Total cost is : " + total);
	}
	//display cart
}

public class ShoppingCart{
	
	public static void main(String[] args){
		
		Cart c = new Cart();
		c.addItem("Milk",10,2);
		c.addItem("Curd",10,6);
		c.removeItem("Milk");
		c.displayCost();
		
	}
}