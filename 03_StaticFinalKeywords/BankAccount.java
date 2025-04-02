

class AccountA {
    final int accountNumber;
    protected String accountName;
    private double balance;
    static String bankName = "SBI";
    static int totalaccounts = 0;

    public AccountA(int accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
        totalaccounts++;

    }

    public double getBalance() {
        return balance;
    }

    public void modifyBalance(double balance) {
        this.balance = balance;
    }

}

class Account extends AccountA {
    public Account(int accountNumber, String accountName, double balance) {
        super(accountNumber, accountName, balance);
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Name: " + accountName);
        System.out.println("Balance: " + super.getBalance());
        System.out.println("Modifying balance to 4000");
        super.modifyBalance(4000);
        System.out.println("Balance after modification: " + super.getBalance());
        System.out.println("Total accounts : " + totalaccounts);
    }

}

public class BankAccount {
    public static void main(String[] args) {

        Account a = new Account(2354, "Priya", 50000);
        if (a instanceof Account) {
            a.displayAccountInfo();
        }

    }
}
