import java.util.ArrayList;

abstract class Product{
    int productId;
    String productName;
    int productPrice;

    public Product(int productId, String productName, int productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public int getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }
    abstract int calculateDiscount();
}
interface Taxable{
    public int calculateTax();
    public void getTaxDetails();
}

class Electronics extends Product implements Taxable{
    int taxRate;
    Electronics(int productId, String productName, int productPrice, int taxRate) {
        super(productId, productName, productPrice);
        this.taxRate = taxRate;
    }
    @Override
    int calculateDiscount() {
        return (int) (productPrice * 0.1);
    }
    @Override
    public int calculateTax() {
        return (int) (productPrice * taxRate / 100);
    }
    @Override
    public void getTaxDetails() {
        System.out.println("Tax Rate: " + taxRate + "%");
        System.out.println("Tax Amount: " + calculateTax());
    }
    public void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + productPrice);
        System.out.println("Discount Amount: " + calculateDiscount());
        getTaxDetails();
    }
}
class Groceries extends Product implements Taxable{
    int taxRate;
    Groceries(int productId, String productName, int productPrice, int taxRate) {
        super(productId, productName, productPrice);
        this.taxRate = taxRate;
    }
    @Override
    int calculateDiscount() {
        return (int) (productPrice * 0.5);
    }
    @Override
    public int calculateTax() {
        return (int) (productPrice * taxRate / 100);
    }
    @Override
    public void getTaxDetails() {
        System.out.println("Tax Rate: " + taxRate + "%");
        System.out.println("Tax Amount: " + calculateTax());
    }
    public void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + productPrice);
        System.out.println("Discount Amount: " + calculateDiscount());
        getTaxDetails();
    }
}
class Clothing extends Product implements Taxable{
    int taxRate;
    Clothing(int productId, String productName, int productPrice, int taxRate) {
        super(productId, productName, productPrice);
        this.taxRate = taxRate;
    }
    @Override
    int calculateDiscount() {
        return (int) (productPrice * 0.8);
    }
    @Override
    public int calculateTax() {
        return (int) (productPrice * taxRate / 100);
    }
    @Override
    public void getTaxDetails() {
        System.out.println("Tax Rate: " + taxRate + "%");
        System.out.println("Tax Amount: " + calculateTax());
    }
    public void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + productPrice);
        System.out.println("Discount Amount: " + calculateDiscount());
        getTaxDetails();
    }
}



public class Products {
    static void calculateAndDisplayPrice(int price,int tax,int discount) {
        int finalPrice = price + tax - discount;
        System.out.println("Final Price: " + finalPrice);
    }
    public static void main(String[] args) {
        Electronics e = new Electronics(2, "Electronics1", 200, 10);
        Groceries g = new Groceries(3, "Groceries1", 300, 5);
        Clothing c = new Clothing(4, "Clothing1", 400, 15);
        ArrayList<Product> products = new ArrayList<>();
        products.add(e);
        products.add(g);
        products.add(c);
        
        System.out.println("..............\n");
        e.display();
        calculateAndDisplayPrice(e.getProductPrice(), e.calculateTax(), e.calculateDiscount());
        System.out.println("..............\n");
        g.display();
        calculateAndDisplayPrice(g.getProductPrice(), g.calculateTax(), g.calculateDiscount());
        System.out.println("..............\n");
        c.display();
        calculateAndDisplayPrice(c.getProductPrice(), c.calculateTax(), c.calculateDiscount());

       
    }
}
