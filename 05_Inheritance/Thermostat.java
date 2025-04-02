class Device{
   private String deviceId;
   private boolean status;

   public Device(String deviceId, boolean status){
    this.deviceId = deviceId;
    this.status = status;
   }
   public String getId(){
    return this.deviceId;
   }
   public boolean getStatus(){
    return this.status;
   }
   
}

public class Thermostat extends Device{
    public int temperatureSetting;

    public Thermostat( String deviceId, boolean status,int temperatureSetting){
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    public void displayInfo(){
        String st = super.getStatus() ? "On":"Off";
        System.out.println("DeviceId: " + super.getId());
        System.out.println("Status: " + st);
        System.out.println("Temperature setting " + this.temperatureSetting);

    }
    public static void main(String[] args) {
        Thermostat th = new Thermostat( "123", true, 20);
        th.displayInfo();
    }
}