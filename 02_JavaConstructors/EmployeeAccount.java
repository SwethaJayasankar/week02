class Emp {
    public int id;
    protected String dep;
    private double salaray;

    public Emp(int id, String dep, int salaray) {
        this.id = id;
        this.dep = dep;
        this.salaray = salaray;
    }

    public double getSal() {
        return salaray;
    }

    public void modifySal(double sal) {
        this.salaray = sal;
    }

    public String getDept() {
        return dep;
    }

}

class ManagerClass extends Emp {

    public ManagerClass(int id, String dep, int salaray) {
        super(id, dep, salaray);
    }

    public void display() {
        System.out.println("ID : " + super.id);
        System.out.println("Department : " + super.dep);
        System.out.println("Salary : " + super.getSal());
        System.out.println("Modifying salary to 70000");
        super.modifySal(70000);
        System.out.println("Salary after modification : " + super.getSal());
    }
}

public class EmployeeAccount {
    public static void main(String[] args) {
        ManagerClass manager = new ManagerClass(1, "IT", 50000);
        manager.display();

    }
}
