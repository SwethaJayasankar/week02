import java.util.ArrayList;
import java.util.List;


class Product {
    private String productName;
    private double price;
    private int productId;

    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public void displayProduct() {
        System.out.println("Product ID: " + this.productId + " | Name: " + this.productName + " | Price: " + this.price);
    }

    public double getPrice() {
        return price;
    }

    public double getTotalCost(int quantity) {
        return price * quantity;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }
}


class OrderItem {
    private Product product;
    private int quantity;

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalCost() {
        return product.getTotalCost(quantity);
    }
}


class Order {
    private int orderNumber;
    private Customer customer;
    private List<OrderItem> orderItems;
    private double totalCost;

    public Order(int orderNumber, Customer customer) {
        this.orderNumber = orderNumber;
        this.customer = customer;
        this.orderItems = new ArrayList<>();
        this.totalCost = 0;
    }

    public void addProduct(Product p, int quantity) {
        this.orderItems.add(new OrderItem(p, quantity));
        totalCost += p.getTotalCost(quantity);
    }

    public List<OrderItem> getOrderItems() {
        return this.orderItems;
    }

    public double getOrderTotalCost() {
        return this.totalCost;
    }

    public void displayOrderSummary() {
        System.out.println("\nOrder Number: " + this.orderNumber + " | Customer: " + this.customer.getCustomerName());

        for (OrderItem item : this.orderItems) {
            Product p = item.getProduct();
            int quantity = item.getQuantity();
            double cost = item.getTotalCost();

            System.out.println("Product ID: " + p.getProductId() + " | Name: " + p.getProductName() +
                    " | Quantity: " + quantity + " | Unit Price: " + p.getPrice() +
                    " | Total Cost: " + cost);
        }

        System.out.println("\n------Total Order Cost: " + this.totalCost + "------------\n");
    }
}

class Customer {
    private String customerName;
    private List<Order> orders;

    public Customer(String customerName) {
        this.customerName = customerName;
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public List<Order> getOrders() {
        return this.orders;
    }
}

public class BillGenerator {
    public static void main(String[] args) {
       
        Customer alice = new Customer("Alice");

       
        Product apple = new Product(1, "Apple", 3);
        Product milk = new Product(2, "Milk", 2);

       
        Order o1 = new Order(1, alice);
        o1.addProduct(milk, 3);
        o1.addProduct(apple, 1);
        alice.addOrder(o1);

       
       

        
        System.out.println("Order Summary for Alice:");
        for (Order order : alice.getOrders()) {
            order.displayOrderSummary();
        }

       
    }
}
