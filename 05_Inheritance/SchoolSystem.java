// Description: Create a hierarchy for a school system where Person is the superclass, and Teacher, Student, and Staff are subclasses.
// Tasks:
// Define a superclass Person with common attributes like name and age.
// Define subclasses Teacher, Student, and Staff with specific attributes (e.g., subject for Teacher and grade for Student).
// Each subclass should have a method like displayRole() that describes the role.
// Goal: Demonstrate hierarchical inheritance by modeling different roles in a school, each with shared and unique characteristics.

class Person{
    private String name;
    private int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}

class Teacher extends Person{
    private String sub;
    public Teacher(String name,int age,String sub){
        super(name,age);
        this.sub=sub;
        
    }
    public String getSub(){
        return this.sub;
    }

    public void displayRole(){
        System.out.println(super.getName() + " is a teacher and teaching subject "+ this.sub);
    }

}

class Student extends Person{
    char grade;
    public Student(String name,int age,char grade){
        super(name,age);
        this.grade=grade;
    }
    public char getGrade(){
        return this.grade;
    }
    public void displayRole(){
        System.out.println(super.getName() + " is a student with grade  "+ this.grade);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        Student s = new Student("Riya", 12, 'A');
        Teacher t = new Teacher("Bhavana", 30, "Maths");
        s.displayRole();
        t.displayRole();
    }
}
 