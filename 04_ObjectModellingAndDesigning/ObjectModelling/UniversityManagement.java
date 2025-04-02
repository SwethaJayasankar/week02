import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int age;
    private List<Course> courses;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void displayStudent() {
        System.out.println("Name: " + this.name + " | Age: " + this.age);
    }

    public void enrollCourse(Course course) {
        this.courses.add(course);
    }

    public List<Course> getEnrolledCourses() {
        return this.courses;
    }
}

class Professor {
    private String professorName;
    private List<Course> courses;

    public Professor(String professorName) {
        this.professorName = professorName;
        this.courses = new ArrayList<>();
    }

    public String getProfessorName() {
        return this.professorName;
    }

    public void assignCourse(Course course) {
        this.courses.add(course);
    }

    public List<Course> getCourses() {
        return this.courses;
    }

    public void displayProfessor() {
        System.out.println("Professor: " + this.professorName);
        System.out.println("Teaching courses: ");
        for (Course course : courses) {
            System.out.print(course.getCourseName() + " ");
        }
        System.out.println();
    }
}

class Course {
    private String courseName;
    private List<Student> students;
    private Professor professor;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        this.students.add(student);
        student.enrollCourse(this);
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
        professor.assignCourse(this);
    }

    public String getCourseName() {
        return this.courseName;
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public Professor getProfessor() {
        return this.professor;
    }
}

public class UniversityManagement {
    private String universityName;
    private List<Student> students;
    private List<Course> courses;
    private List<Professor> professors;

    public UniversityManagement(String universityName) {
        this.universityName = universityName;
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.professors = new ArrayList<>();
    }

    public void addStudent(Student student, Course course) {
        if (!students.contains(student)) {
            this.students.add(student);
        }
        course.enrollStudent(student);
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public void addProfessor(Professor professor) {
        this.professors.add(professor);
    }

    public void assignProfessorToCourse(Professor professor, Course course) {
        course.assignProfessor(professor);
    }

    public String getUniversityName() {
        return this.universityName;
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public List<Course> getCourses() {
        return this.courses;
    }

    public List<Professor> getProfessors() {
        return this.professors;
    }

    public static void main(String[] args) {
        UniversityManagement university = new UniversityManagement("SCTRCS");
        
        Course math = new Course("Math");
        Course science = new Course("Science");
        
        university.addCourse(math);
        university.addCourse(science);
        
        Student john = new Student("John", 15);
        Student jane = new Student("Jane", 16);
        Student sam = new Student("Sam", 17);

        university.addStudent(john, math);
        university.addStudent(jane, math);
        university.addStudent(sam, science);
        university.addStudent(john, science);

        Professor drSmith = new Professor("Dr. Smith");
        Professor drJohnson = new Professor("Dr. Johnson");
        
        university.addProfessor(drSmith);
        university.addProfessor(drJohnson);
        
        university.assignProfessorToCourse(drSmith, math);
        university.assignProfessorToCourse(drJohnson, science);

        System.out.println("*** Students in university and their enrolled courses ***");
        for (Student student : university.getStudents()) {
            student.displayStudent();
            System.out.println("Enrolled in:");
            for (Course course : student.getEnrolledCourses()) {
                System.out.print(course.getCourseName() + " " + course.getProfessor().getProfessorName());
            }
            System.out.println();
        }
        
      
    }
}