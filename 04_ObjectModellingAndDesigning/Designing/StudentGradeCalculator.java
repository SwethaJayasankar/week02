import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int age;
    private List<Subject> subjects; 

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.subjects = new ArrayList<>();
    }

    public void enrollSubject(Subject subject) {
        subjects.add(subject);
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void displayStudent() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Subject {
    private String subjectName;
    private int subjectId;
    private int marks;

    public Subject(String subjectName,  int marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String calculateGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 80) return "B";
        else if (marks >= 70) return "C";
        else if (marks >= 60) return "D";
        else return "F";
    }

    public void displayGrade() {
        System.out.println("Subject: " + subjectName);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}

class GradeCalculator {
    public static double calculateAverage(List<Subject> subjects) {
        if (subjects.isEmpty()) return 0;
        int totalMarks = 0;
        for (Subject subject : subjects) {
            totalMarks += subject.getMarks();
        }
        return (double) totalMarks / subjects.size();
    }

    public static void displayResults(Student student) {
        student.displayStudent();
        System.out.println("\nSubjects and Grades:");
        for (Subject subject : student.getSubjects()) {
            subject.displayGrade();
        }
       
    }
}

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 20);

        Subject maths = new Subject("Maths",  90);
        Subject science = new Subject("Science",  85);

        student.enrollSubject(maths);
        student.enrollSubject(science);

        GradeCalculator.displayResults(student);
    }
}
