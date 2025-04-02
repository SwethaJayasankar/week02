import java.util.Scanner;

class Item{
	
	int itemCode;
	String item;
	int price;
	Item(int a, String b, int c){
		itemCode = a;
		item = b;
		price = c;
	}
	
	void display(){
		System.out.println("Item Code : " + itemCode);
		System.out.println("Name of the item : " + item);
		System.out.println("Price of the item : " + price);
	}
	int totalCost(int q){
		return q*price;
	}
	
}

public class ItemCost{
	public static void main(String[] args){
		Item i = new Item(20314,"Milk",32);
		i.display();
		int quantity = 5;
		System.out.println("Total price for item with " + quantity +" is"+ i.totalCost(quantity));
		
	}
}