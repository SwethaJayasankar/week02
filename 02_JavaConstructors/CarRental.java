class Car{
	String customer;
	String model;
	int days;
	
	
	public Car(String customer,String model,int days){
		this.customer = customer;
		this.model = model;
		this.days = days;
	}
	
	public int getRentalCost(){
		int rentForOneDay = 1000;
		System.out.println("Rent for one day is : " + rentForOneDay);
		return (days * rentForOneDay);
	}
}

public class CarRental{
	public static void main(String[] args){
		Car c = new Car("Riya","BMW",10);
		System.out.println("Rent for 10 days is " + c.getRentalCost());
		
	}
}