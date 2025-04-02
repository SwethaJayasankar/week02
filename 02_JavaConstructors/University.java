class Student{
	public int roll;
	protected String name;
	private int cgpa ;
	
	Student(int roll,String name,int cgpa){
		this.roll = roll;
		this.name = name ;
		this.cgpa =cgpa;
	}
	public int cgpaModify(int num){
		System.out.println("\nBefore modifying cgpa : " + cgpa);
		cgpa=num;
		System.out.println("\nAfter modifying cgpa : " + cgpa);
		return cgpa;
	}
	
	
}
class StudentExtended extends Student{
	    StudentExtended(int roll, String name, int cgpa) {
			super(roll, name, cgpa);
		}
	
		public void display(){
		System.out.println("Im accessing student name which is protected ! name is : "+ name);
	    System.out.println("roll no : " + roll);
		System.out.println("cannot acces cgpa directly...accessing cgpa through public method");
		cgpaModify(8);
			
	}
	
}

public class University{
	public static void main(String[] args){
		StudentExtended es = new StudentExtended(23,"Priya",7);
		es.display();
		
	}
}