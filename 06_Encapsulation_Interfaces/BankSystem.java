abstract class BankAccount{
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getHolderName() {
        return holderName;
    }
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if(amount> balance){
            System.out.println("Insufficient balance.");
        }else{
            System.out.println("Withdraw amount must be positive.");
        }
    }
    abstract double calculateInterest();

}

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}
class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate;

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan of " + amount + " applied for Savings Account.");
    }
    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() > 1000; 
    }
}
class CurrentAccount extends BankAccount implements Loanable {
    private double interestRate;

    public CurrentAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan of " + amount + " applied for Savings Account.");
    }
    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() > 1500; 
    }
}
public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount("12345", "John Doe", 2000, 5);
        System.out.println("Current savings account balance for " + s.getHolderName() + " is " + s.getBalance());
        s.deposit(500);
        s.withdraw(200);
        System.out.println("Savings Account Interest: " + s.calculateInterest());
        s.applyForLoan(10000);
        System.out.println("Savings Account Loan Eligibility: " + s.calculateLoanEligibility());
        System.out.println("Savings Account Balance: " + s.getBalance());
        
        System.out.println("........................................");
        CurrentAccount c = new CurrentAccount("67890", "Jane Doe", 3000, 3);
        System.out.println("Current current account balance for " + c.getHolderName() + " is " + c.getBalance());
        c.deposit(1000);
        c.withdraw(500);
        System.out.println("Current Account Interest: " + c.calculateInterest());
        c.applyForLoan(20000);
        System.out.println("Current Account Loan Eligibility: " + c.calculateLoanEligibility());
        System.out.println("Current Account Balance: " + c.getBalance());

        
    }
}
