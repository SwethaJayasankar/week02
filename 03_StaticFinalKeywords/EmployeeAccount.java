class Emp {
    public int id;
    public String dep;
    public String designation;
    public static String company = "capgemini";
    public static int totalemp = 0;

    public Emp(int id, String dep, String designation) {
        this.id = id;
        this.dep = dep;
        this.designation = designation;
        totalemp++;
    }


    

}

class ManagerClass extends Emp {

    public ManagerClass(int id, String dep,String designation) {
        super(id, dep, designation);
    }

    public void display() {
        System.out.println("ID : " + super.id);
        System.out.println("Department : " + super.dep);
        System.out.println("Designation : " + super.designation);
        System.out.println("Total employees : "+ totalemp);
        System.out.println("Company name : "+ company);
    }
}

public class EmployeeAccount {
    public static void main(String[] args) {
        ManagerClass manager = new ManagerClass( 1, "IT", "Manager");
        if(manager instanceof ManagerClass) {
           manager.display();
        }
        ManagerClass m = new ManagerClass( 2, "IT", "Developer");
        if(m instanceof ManagerClass){
            m.display();
        }
      

    }
}
