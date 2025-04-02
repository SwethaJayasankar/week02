// Description: Model a banking system with different account types using hierarchical inheritance. BankAccount is the superclass, with SavingsAccount, CheckingAccount, and FixedDepositAccount as subclasses.
// Tasks:
// Define a base class BankAccount with attributes like accountNumber and balance.
// Define subclasses SavingsAccount, CheckingAccount, and FixedDepositAccount, each with unique attributes like interestRate for SavingsAccount and withdrawalLimit for CheckingAccount.
// Implement a method displayAccountType() in each subclass to specify the account type.
// Goal: Explore hierarchical inheritance, demonstrating how each subclass can have unique attributes while inheriting from a shared superclass.

class BankAccount{
    private int accountNumber;
    private double balance;

    public BankAccount( int acc,double balance){
        this.accountNumber = acc;
        this.balance = balance;
    }
    public int getAccNo(){
        return this.accountNumber;
    }
    public double getBalance(){
        return this.balance;
    }

}

class SavingsAccount extends BankAccount{
    private int interestRate;
    public SavingsAccount(int acc,double balance,int interestRate){
        super(acc,balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType(){
        System.out.println("This is a SavingsAccount");
    }
}
class CheckingAccount extends BankAccount{
    private double withdrawalLimit;
    public CheckingAccount(int acc,double balance,double wl){
        super( acc,balance);
        this.withdrawalLimit = wl;

    }
    public double getWl(){
        return this.withdrawalLimit;
    }
    public void displayAccountType(){
        System.out.println("Account type here is Checking account..you can check your withdrawal limit ! It is "+ this.withdrawalLimit);
    }
}
class FixedDepositAccount extends BankAccount{
   
    public FixedDepositAccount(int acc,double balance){
        super(acc, balance);
    }
    public void displayAccountType(){
        System.out.println("ACCOUNT TYPE IS FIXED DEPOSIT ACCOUNT :)");
    }
   
}

public class BankAccountTypes {
    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount(654324, 560000, 10);
        CheckingAccount c = new CheckingAccount(5456, 450000, 10000);
        FixedDepositAccount f = new  FixedDepositAccount(6556,30000);
        s.displayAccountType();
        c.displayAccountType();
        f.displayAccountType();
        
    }
}
