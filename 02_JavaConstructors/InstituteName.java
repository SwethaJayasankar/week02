class Course{
	String name;
	int duration;
	int fee;
	static String institue="SRM";
	
	
	public Course(String name,int duration,int fee){
		this.name = name;
		this.duration = duration;
		this.fee = fee;
		
	}
	
	public void display(){
		System.out.println("......Course Details......");
		System.out.println("Course name : "+ name);
		System.out.println("Course fee  : "+ fee);
		System.out.println("Course Duration in years  : "+ duration);
		System.out.println("Institute name : "+ institue);
	}
	public void changeName(String i){
		institue = i;
		System.out.println("......Name of institue  changed......");
		
	}
}

public class InstituteName{
	public static void main(String[] args){
		Course c = new Course("MCA",2,100000);
		c.display();
		System.out.println("Changing name to VIT");
		c.changeName("VIT");
		c.display();
		
	}
}