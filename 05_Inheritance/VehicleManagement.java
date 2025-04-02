// Description: Model a vehicle system where Vehicle is the superclass and ElectricVehicle and PetrolVehicle are subclasses. Additionally, create a Refuelable interface implemented by PetrolVehicle.
// Tasks:
// Define a superclass Vehicle with attributes like maxSpeed and model.
// Create an interface Refuelable with a method refuel().
// Define subclasses ElectricVehicle and PetrolVehicle. PetrolVehicle should implement Refuelable, while ElectricVehicle include a charge() method.
// Goal: Use hybrid inheritance by having PetrolVehicle implement both Vehicle and Refuelable, demonstrating how Java interfaces allow adding multiple behaviors.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


class Vehicle{
    private int maxSpeed;
    private String model;
    public Vehicle(int maxSpeed, String model){
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public String getModel(){
        return this.model;
    }
}
interface Refuelable{
    public void refuel();
}

class PetrolVehicle extends Vehicle implements Refuelable{
    public PetrolVehicle(int maxSpeed,String model){
        super(maxSpeed, model);
    }
    public void refuel(){
        System.out.println("Refueling...\n DONE :)");
    }
}
class ElectricVehicle extends Vehicle implements Refuelable{
    public ElectricVehicle(int maxSpeed,String model){
        super(maxSpeed, model);
    }
    public void refuel(){
        System.out.println("oops!!!!!!!!! :( \nRefueling is not possible its electric vehicle !...");
    }
    public void charge(){
        System.out.println("Charging... :) DONE YAY");
    }
}

public class VehicleManagement {
    public static void main(String[] args) {
        PetrolVehicle p = new PetrolVehicle(60, "waganor");
        ElectricVehicle e = new ElectricVehicle(50, "abcmodel");
        p.refuel();
        e.refuel();
        e.charge();
        
    }
    
}
