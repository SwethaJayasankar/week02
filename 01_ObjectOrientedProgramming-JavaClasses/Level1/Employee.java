import java.util.Scanner;

class Emp{
	int id;
	String name;
	int salary;
	
	void display(int id,String name,int salary){
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Salary : " + salary);
	}
	
}

public class Employee{
	public static void main(String[] args){
		Emp e = new Emp();
		e.display(1,"priya",50000);
		
	}
}