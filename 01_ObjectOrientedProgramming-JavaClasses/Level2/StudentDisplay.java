class Student{
	
	int roll;
	String name;
	int mark;
	
	Student(int a,String b,int c){
		roll = a;
		name = b;
		mark = c;
	}
	static char grade(int m){
		char grade;
		if(m>=89){
			grade='A';
		}else if(m>=79 && m<=88){
			grade='B';
		}else if(m>=69 && m<=78){
			grade='C';
		}else if(m>=59 && m<=68){
			grade='D';
		}else if(m>=49 && m<=58){
			grade='E';
		}else{
			grade='F';
		}
		return grade;
	}
	
	void display(){
		System.out.println("**********Student details**********");
		System.out.println("Roll no : " + roll);
		System.out.println("Name : " + name);
		System.out.println("Marks : " + mark);
		System.out.println("Grade : " + grade(mark));
	}
	
}

public class StudentDisplay{
	public static void main(String[] args){
		Student s = new Student(20,"Priya",89);
		s.display();
		
	}
}