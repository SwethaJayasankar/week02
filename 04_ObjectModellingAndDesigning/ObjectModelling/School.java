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

class Course {
    private String courseName;
    private List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        this.students.add(student);
        student.enrollCourse(this);
    }

    public String getCourseName() {
        return this.courseName;
    }

    public List<Student> getStudents() {
        return this.students;
    }
}

public class School {
    private String schoolName;
    private List<Student> students;
    private List<Course> courses;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
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

    public String getSchoolName() {
        return this.schoolName;
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public List<Course> getCourses() {
        return this.courses;
    }

    public static void main(String[] args) {
        School school = new School("SCTRCS");
        Course math = new Course("Math");
        school.addCourse(math);

        Student john = new Student("John", 15);
        Student jane = new Student("Jane", 16);
        Student sam = new Student("Sam", 17);

        school.addStudent(jane, math);
        school.addStudent(john, math);
       

        Course science = new Course("Science");
        school.addCourse(science);
        school.addStudent(john, science);
        school.addStudent(sam, science);

        System.out.println("*** Students in school and their enrolled courses ***");
        for (Student student : school.getStudents()) {
            student.displayStudent();
            System.out.println("enrolled in.........");
            for (Course course : student.getEnrolledCourses()) {
                System.out.print(course.getCourseName() + " ");
            }
            System.out.println();
        }
    }
}
