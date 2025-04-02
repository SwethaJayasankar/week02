class Ticket{
	
	String name;
	int seat;
	int price;
	
	Ticket(String a,int b,int c){
		name = a;
		seat = b;
		price = c;
	}
	
	
	void display(){
		System.out.println("**********Movie ticket details**********");
		System.out.println("Movie name : " + name);
		System.out.println("Seat number : " + seat);
		System.out.println("Price : " + price);
	}
	
}

public class MovieTicket{
	public static void main(String[] args){
		Ticket t = new Ticket("KGF",17,350);
		t.display();
		
	}
}