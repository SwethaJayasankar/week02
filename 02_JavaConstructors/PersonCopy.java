class Person{
	String name;
	int age;
	
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public Person(Person p){
		this.name = p.name;
		this.age = p.age;
	}
	
	public void displayPerson(){
		System.out.println("Name of the Person is "+ name + " and is " + age + " years old ");
	}
}

public class PersonCopy{
	public static void main(String[] args){
		Person p = new Person("Priya",25);
		Person pp = new Person(p);
		pp.displayPerson();
	}
}