class Phone{
	
	String brand;
	String model;
	int price;
	
	Phone(String a,String b,int c){
		brand = a;
		model = b;
		price = c;
	}
	
	void display(){
		System.out.println("**********Phone details**********");
		System.out.println("Brand of the phone is : " + brand);
		System.out.println("Model of the phone is : " + model);
		System.out.println("Price of the phone is : " + price);
	}
	
}

public class MobilePhone{
	public static void main(String[] args){
		Phone one = new Phone("Vivo","v5",15000);
		Phone two = new Phone("Iphone","16pro",125000);
		one.display();
		two.display();
		
	}
}