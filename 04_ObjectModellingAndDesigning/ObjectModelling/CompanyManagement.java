import java.util.ArrayList;
import java.util.List;

class Company{
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }
    public void addDepartment(String departmentname){
        this.departments.add(new Department(departmentname));
    }
    public String getCompanyName(){
        return this.name;
    }
    public List<Department> getDepartments(){
        return this.departments;
    }
    public Department getDepartmentByName(String departmentName) {
        for (Department dept : departments) {
            if (dept.getDept().equalsIgnoreCase(departmentName)) {
                return dept;
            }
        }
        return null; 
    }
    


}
class Department{
    private String deptName;
    private List<Employee> employees;

    public Department(String deptName){
        this.deptName=deptName;
        this.employees=new ArrayList<>();
    }

    public String getDept(){
        return this.deptName;
    }
    public void addEmployee(String name , int age){
        this.employees.add(new Employee(name, age));

    }
    public void removeEmployee(String name){
        this.employees.removeIf(employee -> employee.getName().equals(name));
    }
   public List<Employee> getEmployees(){
    return this.employees;
   }


}
class Employee{
    private String name;
    private int age;

    public Employee(String name,  int age) {
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
   
    public void displayEmployee(){
        System.out.println(" Name: "+this.name + " | Department: "+this.age);
    }

}

public class CompanyManagement {
    public static void main(String[] args) {

        List<Company> companies = new ArrayList<>();
        Company capgemini = new Company("Capgemini");
        capgemini.addDepartment("marketing");
        capgemini.addDepartment("IT");
        capgemini.getDepartmentByName("marketing").addEmployee("JOhn", 20);
        capgemini.getDepartmentByName("IT").addEmployee("Rahul", 25);
        capgemini.getDepartmentByName("IT").addEmployee("Sree", 20);
        
        companies.add(capgemini);

        Company tcs = new Company("TCS");
        tcs.addDepartment("IT");
        tcs.getDepartmentByName("IT").addEmployee("Rahul", 25);
        tcs.getDepartmentByName("IT").addEmployee("Ram", 20);

        companies.add(tcs);

        for (Company company : companies) {
            System.out.println("\n--------Company Name: "+company.getCompanyName());
            for (Department department : company.getDepartments()) {
                System.out.println("\n-------Department Name: "+department.getDept());
                for (Employee employee : department.getEmployees()) {
                    employee.displayEmployee();
                }
            }
        }
     

        companies.remove(0);

       
        System.out.println("\nAFTER DELETING ONE COMPANY!!!!\n");
        for (Company company : companies) {
            System.out.println("\n--------Company Name: "+company.getCompanyName());
            for (Department department : company.getDepartments()) {
                System.out.println("\n-------Department Name: "+department.getDept());
                for (Employee employee : department.getEmployees()) {
                    employee.displayEmployee();
                }
            }
        }

        

       
        

        
    }
}
