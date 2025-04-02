class Patient{
    public static String hospitalName = "NIMS";
    public static int totalPatients=0;
    public String name;
    public int age;
    public String ailment;
    final int patientId;
    
    public Patient( String name, int age, String ailment, int patientId) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientId = patientId;
        totalPatients++;
    }

    //get total patients
    public static int getTotalPatients(){
        return totalPatients;
    }
    public void display(){
        System.out.println("Patient Name: "+name);
        System.out.println("Patient Age: "+age);
        System.out.println("Patient Ailment: "+ailment);
        System.out.println("Patient ID: "+patientId);
        System.out.println("Total patients : " + getTotalPatients());
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        Patient p1 = new Patient("John", 25, "Diabetes", 101);
        if(p1 instanceof  Patient){
            p1.display();
        }
        
    }
}
