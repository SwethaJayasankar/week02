import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
class Order{

    private String orderId;
    private String date;
    public Order( String orderId,String date){
        this.orderId=orderId;
        this.date=date;
    }
    public  String getDate(){
        
        return this.date;
    }
    public String getId(){
        return this.orderId;
    }
}

class ShippedOrder extends Order{
    private int trackingNumber;
    public ShippedOrder(String o,String d,int t){
        super(o,d);
        this.trackingNumber = t; 
    }
    public int getTrackingNumber(){
        return this.trackingNumber;
    }
}
public class DeliveredOrder extends ShippedOrder{
    public String deliveryDate;
    public DeliveredOrder(String o,String d,int t,String deliveryDate){
        super(o, d, t);
        this.deliveryDate = deliveryDate;
    }
    public void getCurrentStatus(){
        System.out.println("Order ID : "+super.getId());
        System.out.println("Date ordered : " + super.getDate());
        System.out.println("Tracking Number : " + super.getTrackingNumber());
        System.out.println("Delivery Date : " + this.deliveryDate);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate formattedDeliveryDate = LocalDate.parse(deliveryDate, dtf);
        LocalDate today = LocalDate.now();
        if(today.isAfter(formattedDeliveryDate)){
            System.out.println("Order is delivered");
        }
        else{
            System.out.println("your delivery is on the way ! ");
        }
    }

    public static void main(String[] args) {
        DeliveredOrder d = new DeliveredOrder("891AF2", "2025-02-25", 30653241, "2025-03-10");
        d.getCurrentStatus();
        
    }
}
