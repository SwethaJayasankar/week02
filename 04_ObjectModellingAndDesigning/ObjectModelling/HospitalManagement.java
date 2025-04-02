
// Description: Model a Hospital where Doctor and Patient objects interact through consultations. A doctor can see multiple patients, and each patient can consult multiple doctors.
// Tasks:
// Define a Hospital class containing Doctor and Patient classes.
// Create a method consult() in the Doctor class to show communication, which would display the consultation between a doctor and a patient.
// Model an association between doctors and patients to show that doctors and patients can have multiple relationships.
// Goal: Practice creating an association with communication between objects by modeling doctor-patient consultations.
import java.util.ArrayList;
import java.util.List;

public class HospitalManagement {

    static class Patient {
        private String patientName;
        private String patientId;
        private List<Doctor> doctorsConsulted = new ArrayList<>();

        public Patient(String patientName, String patientId) {
            this.patientName = patientName;
            this.patientId = patientId;
            doctorsConsulted = new ArrayList<>();
        }

        public String getPatientName() {
            return patientName;
        }

        public List<Doctor> getDoctorsConsulted() {
            return doctorsConsulted;
        }

        public void addDoctorConsulted(Doctor doctor) {
            doctorsConsulted.add(doctor);
            if (!doctor.getPatients().contains(this)) {
                doctor.addPatient(this);
            }
        }

    }

    static class Doctor {
        private String doctorName;
        private String doctorId;
        private List<Patient> patients = new ArrayList<>();

        public Doctor(String doctorName, String doctorId) {
            this.doctorName = doctorName;
            this.doctorId = doctorId;
            this.patients = new ArrayList<>();
        }

        public void addPatient(Patient patient) {
            this.patients.add(patient);
        }

        public String getDoctorName() {
            return doctorName;
        }

        public List<Patient> getPatients() {
            return patients;
        }

        public void displayDoctorDetails() {
            System.out.println("Doctor Name: " + this.doctorName);
            System.out.println("Doctor ID: " + this.doctorId);
            System.out.println("Number of patients : " + this.patients.size());
            for (Patient p : this.patients) {
                System.out.println("Patient Name: " + p.patientName + " |  Patient ID: " + p.patientId);
            }
        }

    }

    public static void main(String[] args) {
        Doctor d1 = new Doctor("Dr. Smith", "D001");
        Doctor d2 = new Doctor("Dr. Johnson", "D002");

        Patient john = new Patient("John", "P001");
        Patient emma = new Patient("Emma", "P002");
        Patient oliver = new Patient("Oliver", "P003");

        d1.addPatient(john);
        d2.addPatient(oliver);
        d1.addPatient(emma);

        john.addDoctorConsulted(d1);
        john.addDoctorConsulted(d2);
        emma.addDoctorConsulted(d1);
        oliver.addDoctorConsulted(d2);

        d1.displayDoctorDetails();
        d2.displayDoctorDetails();
        System.out.println("Doctors that john visited : ");
        for (Doctor d : john.getDoctorsConsulted()) {
            System.out.println(d.getDoctorName());
        }

    }
}
