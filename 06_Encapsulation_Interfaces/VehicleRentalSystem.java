
abstract class Vehicle {
    int vehicleNumber;
    String vehicleType;
    int rentalRate;

    Vehicle(int vehicleNumber, String vehicleType, int rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.rentalRate = rentalRate;
    }

    abstract int calculateRentalCost(int days);
}

interface Insurable {
    public int calculateInsurance();

    public void getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    Car(int vehicleNumber, String vehicleType, int rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, vehicleType, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    int calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public int calculateInsurance() {
        return (int) (rentalRate * 0.1);
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Policy Number: " + insurancePolicyNumber);
        System.out.println("Insurance Amount: " + calculateInsurance());
    }

}

class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    Bike(int vehicleNumber, String vehicleType, int rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, vehicleType, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    int calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public int calculateInsurance() {
        return (int) (rentalRate * 10);
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Policy Number: " + insurancePolicyNumber);
        System.out.println("Insurance Amount: " + calculateInsurance());
    }

}

class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    Truck(int vehicleNumber, String vehicleType, int rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, vehicleType, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    int calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public int calculateInsurance() {
        return (int) (rentalRate * 20);
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Policy Number: " + insurancePolicyNumber);
        System.out.println("Insurance Amount: " + calculateInsurance());
    }

}

public class VehicleRentalSystem {

    public static void main(String[] args) {

        Vehicle bike = new Bike(1, "Bike", 10, "BIK-123");
        Vehicle car = new Car(2, "Car", 20, "CAR-456");
        Vehicle truck = new Truck(3, "Truck", 30, "TRK-789");

        Vehicle[] vehicles = { bike, car, truck };
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Type: " + vehicle.vehicleType);
            System.out.println("Rental Cost for 5 days: " + vehicle.calculateRentalCost(5));

            Insurable insurableVehicle = (Insurable) vehicle;
            insurableVehicle.getInsuranceDetails();

            System.out.println("..............\n");
        }

    }
}
