class Vehicle{
	String name;
	String type;
	static int regFee= 500;
	
	
	public Vehicle(String name,String type){
		this.name = name;
		this.type = type;
		
	}
	
	public void display(){
		System.out.println("......Vehicle Details......");
		System.out.println("Owner name : "+ name);
		System.out.println("Vehicle Type : "+ type);
		System.out.println("Registration fee : "+ regFee);
	}
	public void changeFee(int i){
		regFee = i;
		System.out.println("......Registration fee  changed......");
		
	}
}

public class VehicleReg{
	public static void main(String[] args){
		Vehicle c = new Vehicle("Priya","Waganor");
		c.display();
		System.out.println("Changing fee ");
		c.changeFee(1500);
		c.display();
		
	}
}