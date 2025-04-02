import java.util.ArrayList;
import java.util.List;
class Bank{
    String bankName;
    List<Customer> customers;
    
    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }
    public String getBank(){
        return this.bankName;
    }
    public void addCustomer(Customer customer){
        this.customers.add(customer);
    }
    public void displayCustomers(){
        for(Customer c : customers){
            System.out.println(c.getCustomer());
        }
    }
    
}

class Customer{
    String name;
    List<Accounts> accounts;

    public Customer(String name){
        this.name = name;
        this.accounts = new ArrayList<>();
    }
    String getCustomer(){
        return this.name;
    }
    public void addAccounts(Bank bank,double balance){
        this.accounts.add(new Accounts(bank,balance));
        bank.addCustomer(this);
    }
    public void viewBalance(){
    for(Accounts a : accounts){
        System.out.println(a.getBank() + " " + a.getBalance());
    }
    }

}

class Accounts{
    Bank bank ;
    double balance;
    public Accounts(Bank bank, double balance){
        this.bank = bank;
        this.balance = balance;
    }
    String getBank(){
        return bank.bankName;
    }
    double getBalance(){
        return this.balance;
    }

}

public class BankAssociation {
    public static void main(String[] args) {
        Bank bank1 = new Bank("Bank of America");
        Bank bank2 = new Bank("SBI");
        Customer customer1 = new Customer("John");
        Customer customer2 = new Customer("Annie");
        customer1.addAccounts(bank1, 1000);
        customer1.addAccounts(bank2, 2000);
        customer2.addAccounts(bank1, 3000);
        System.out.println("\nBalance of customer 1 :");
        customer1.viewBalance();
        System.out.println("\nBalance of customer 2 :");
        customer2.viewBalance();
        System.out.println("\n******Bank 1 customers list as follows**********");
        bank1.displayCustomers();
        System.out.println("\n******Bank 2 customers list as follows**********");
        bank2.displayCustomers();
    }
}
