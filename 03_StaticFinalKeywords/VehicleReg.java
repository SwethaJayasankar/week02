class Vehicle{
	String name;
	String type;
	static int regFee= 500;
	int regNo;
	
	
	public Vehicle(String name,String type,int regNo){
		this.name = name;
		this.type = type;
		this.regNo = regNo;
		
	}
	
	public void display(){
		System.out.println("......Vehicle Details......");
		System.out.println("Owner name : "+ name);
		System.out.println("Vehicle Type : "+ type);
		System.out.println("Registration number : "+ regNo);
		System.out.println("Registration fee : "+ regFee);
	}
	public void updateRegFee(int i){
		regFee = i;
		System.out.println("......Registration fee  changed......");
	}
}

public class VehicleReg{
	public static void main(String[] args){
		Vehicle c = new Vehicle("Priya","Waganor",2354);
		if(c instanceof  Vehicle){
			c.display();
			System.out.println("Changing fee ");
			c.updateRegFee(1500);
			c.display();
		}
		
	}
}