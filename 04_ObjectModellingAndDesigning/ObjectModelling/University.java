
import java.util.ArrayList;
import java.util.List;
class Faculty{
    private String facultyName;
    private String role;

    public Faculty(String facultyName,String role){
        this.facultyName = facultyName;
        this.role = role;
    }
    public String getFacultyName() {
        return facultyName;
    }
    public void displayFaculty(){
        System.out.println("Faculty name : "+ this.facultyName + " Role : "+ this.role);
    }

}
class Department{
    private String departmentName;
    public List<Faculty> faculties;
    public Department(String departmentName){
        this.departmentName = departmentName;
        this.faculties = new ArrayList<>();
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public void addFaculty(Faculty faculty){
        this.faculties.add(faculty);
    }
    public void displayDepartment(){
        System.out.println("Department Name : "+ this.departmentName);
        for(Faculty faculty : this.faculties){
            faculty.displayFaculty();
        }
    }



}
public class University {
    private String universityName;
    private List<Department> departments;
    private List<Faculty> faculties;
    public University(String universityName){
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }
    public String getUniversityName() {
        return universityName;
    }
    public void addDepartment(Department department){
        this.departments.add(department);
    }
    public void addFaculty(Faculty faculty){
        this.faculties.add(faculty);
    }

   
    public void displayDeptFaculties(){
        for(Department department : this.departments){
            System.out.println("Department Name : "+ department.getDepartmentName());
            for(Faculty faculty : department.faculties){
                faculty.displayFaculty();
            }
        }
    }

    public static void main(String[] args) {
        University university = new University("ABC University");
        Department cs = new Department("Computer Science");
        Department maths = new Department("Maths");
        Faculty faculty1 = new Faculty("Jay Doe","Professor");
        Faculty faculty2 = new Faculty("Jane Doe","Lecturer");
        Faculty faculty3 = new Faculty("Bob Smith","Professor");
        cs.addFaculty(faculty1);
        cs.addFaculty(faculty2);
        maths.addFaculty(faculty3);

        
        university.addDepartment(cs);
        university.addDepartment(maths);
        university.displayDeptFaculties();
        
        
    }
    
}
