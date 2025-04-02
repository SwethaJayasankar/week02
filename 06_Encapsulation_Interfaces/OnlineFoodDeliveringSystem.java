// Define an abstract class FoodItem with fields like itemName, price, and quantity.
// Add abstract methods calculateTotalPrice() and concrete methods like getItemDetails().
// Extend it into classes VegItem and NonVegItem, overriding calculateTotalPrice() to include additional charges (e.g., for non-veg items).
// Use an interface Discountable with methods applyDiscount() and getDiscountDetails().
// Demonstrate encapsulation to restrict modifications to order details and use polymorphism to handle different types of food items in a single order-processing method.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;
    private String orderId;
    private static int orderCounter = 0;
    
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.orderId = generateOrderId();
        }
       
        public abstract double calculateTotalPrice();
        
        public String getItemDetails() {
            return "Item Name: " + itemName + ", Price: " + price + ", Quantity: " + quantity + ", Order ID: " + orderId;
        }
       
        private String generateOrderId() {
            Random random = new Random();
            orderCounter++;
            return "ORD" + orderCounter + "-" + random.nextInt(1000);
        }
       
        public String getItemName() {
            return itemName;
        }
        public void setItemName(String itemName) {
            this.itemName = itemName;
        }
        public double getPrice() {
            return price;
        }
        public void setPrice(double price) {
            this.price = price;
        }
        public int getQuantity() {
            return quantity;
        }
        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
        public String getOrderId() {
            return orderId;
        }
        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }
    
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + calculateTotalPrice());
    }
}

class VegetarianFoodItem extends FoodItem {
    public VegetarianFoodItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
}

class NonVegetarianFoodItem extends FoodItem {
    public NonVegetarianFoodItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }
    @Override
    public double calculateTotalPrice() {
        return (getPrice() + (0.10*getPrice())) * getQuantity();
    }
}

interface Discountable {
    double applyDiscount(double discountPercentage);
    String getDiscountDetails();
}

class DiscountableFoodItem extends FoodItem implements Discountable {
    private double discountPercentage;
    public DiscountableFoodItem(String itemName, double price, int quantity, double discountPercentage) {
        super(itemName, price, quantity);
        this.discountPercentage = discountPercentage;
    }
    @Override
    public double applyDiscount(double discountPercentage) {
        double totalPrice = calculateTotalPrice();
        return totalPrice - (totalPrice * discountPercentage / 100);
    }
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
    @Override
    public String getDiscountDetails() {
        return "Discount Percentage: " + discountPercentage + "%";
    }
    public double calculateTotalPriceWithDiscount() {
        double totalPrice = calculateTotalPrice();
        return totalPrice - (totalPrice * discountPercentage / 100);
    }
    @Override

    public String getItemDetails() {
        return super.getItemDetails() + ", Discount: " + discountPercentage + "%";
    }
    }

public class OnlineFoodDeliveringSystem {
    private List<FoodItem> foodItems;
    public OnlineFoodDeliveringSystem() {
        foodItems = new ArrayList<>();
    }
    public void addFoodItem(FoodItem foodItem) {
        foodItems.add(foodItem);
    }
    public void removeFoodItem(FoodItem foodItem) {
        foodItems.remove(foodItem);
    }
    public void processOrder() {
        System.out.println("Processing Order...");
        for (FoodItem foodItem : foodItems) {
            foodItem.displayOrderDetails();
        }
    }
    public static void main(String[] args) {
        OnlineFoodDeliveringSystem system = new OnlineFoodDeliveringSystem();
       
        system.addFoodItem(new VegetarianFoodItem("Veg Pizza", 10.99, 2));
        system.addFoodItem(new NonVegetarianFoodItem("Chicken Burger", 8.99, 1));
        system.addFoodItem(new DiscountableFoodItem("Pasta", 12.99, 3, 10));
       
        system.processOrder();
        
        
    }
}
