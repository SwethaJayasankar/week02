import java.util.Scanner;

class Circ{
	double radius;
	
	void  area(double radius){
		System.out.println("area of circle with radius " + radius +" is " + (3.14 * Math.pow(radius,2)));
		
	}
	void  circumference(double radius){
		System.out.println("circumference of circle with radius " + radius +" is " + (2 * 3.14 * radius));
		
	}
	
}

public class Circle{
	public static void main(String[] args){
		Circ c = new Circ();
		c.area(2.0);
		c.circumference(2.0);
		
	}
}