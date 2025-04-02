abstract class Employee {
    String empId;
    String empName;
    int empBaseSalary;

    abstract int calculateSalary();

    public Employee(String empId, String empName, int empBaseSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empBaseSalary = empBaseSalary;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpBaseSalary() {
        return empBaseSalary;
    }

    public void setEmpBaseSalary(int empBaseSalary) {
        this.empBaseSalary = empBaseSalary;
    }

    void display() {
        System.out.println("\n................\n");
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Base Salary: " + empBaseSalary);
        System.out.println("Employee Salary: " + calculateSalary());
    }
}

interface Department {
    public void assignDepartment(String dept);

    public void getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements Department {
    int workhours = 200;
    String dept;

    FullTimeEmployee(String empId, String empName, int empBaseSalary) {
        super(empId, empName, empBaseSalary);
    }

    @Override
    int calculateSalary() {
        return empBaseSalary * workhours;
    }

    public void assignDepartment(String dept) {
        this.dept = dept;
    }

    public void getDepartmentDetails() {
        System.out.println(" Department Details: " + dept + "\n..............\n");
    }

    public void display() {
        super.display();
    }

}

class PartTimeEmployee extends Employee implements Department {
    int workhours = 100;
    String dept;

    PartTimeEmployee(String empId, String empName, int empBaseSalary) {
        super(empId, empName, empBaseSalary);
    }

    public void assignDepartment(String dept) {
        this.dept = dept;
    }

    public void getDepartmentDetails() {
        System.out.println("Department: " + dept + "\n..............\n");
    }

    @Override
    int calculateSalary() {
        return empBaseSalary * workhours;
    }

    public void display() {
        super.display();
    }
}

public class Department1 {

    public static void main(String[] args) {
        FullTimeEmployee emp1 = new FullTimeEmployee("E001", "John Doe", 5000);
        PartTimeEmployee emp2 = new PartTimeEmployee("E002", "Jane Smith", 3000);
        emp1.assignDepartment("HR");
        emp2.assignDepartment("Finance");
        emp1.display();
        emp1.getDepartmentDetails();
        emp2.display();
        emp2.getDepartmentDetails();

    }
}