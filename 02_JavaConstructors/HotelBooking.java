class Booking{
	String guestName;
	String roomType;
	int nights;
	
	public Booking(){
		this.guestName = "Praveen";
		this.roomType = "Single";
		this.nights = 5;
	}
	public Booking(String guestName,String roomType,int nights){
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
	}
	
	public Booking(Booking b){
		this.guestName = b.guestName;
		this.roomType = b.roomType;
		this.nights = b.nights;
	}
	
	public void display(){
		System.out.println("Name of the Guest is "+ guestName + " and booked a room of type " + roomType + " . And is staying here for "+ nights+" days");
	}
}

public class HotelBooking{
	public static void main(String[] args){
		Booking b = new Booking();
		System.out.println("Using default constructor");
		b.display();
		Booking bb = new Booking("Priya","Deluxe",2);
		System.out.println("Using parameterized constructor");
		bb.display();
		Booking bbb = new Booking(bb);
		System.out.println("Using copy constructor");
		bbb.display();
	}
}