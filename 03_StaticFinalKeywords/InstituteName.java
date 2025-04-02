class Course{

	public final int rollno;
	public String grade;
	String name;
	static String institue="SRM";
	static int totalStudents=0;
	
	public Course(String name,int rollno,String grade){
		this.name = name;
		this.rollno = rollno;
		this.grade = grade;
		totalStudents++;
		
	}
	
	public void display(){
		System.out.println("......Course Details......");
		System.out.println("Course name : "+ name);
		System.out.println("Roll No : "+ rollno);
		System.out.println("Grade : "+ grade);
		System.out.println("Institute name : "+ institue);
		System.out.println("Total Students : "+ totalStudents);
	}
	
}

public class InstituteName{
	public static void main(String[] args){
		Course c = new Course( "Java", 1, "A");
		if(c instanceof  Course){
			c.display();
		}
	}
}