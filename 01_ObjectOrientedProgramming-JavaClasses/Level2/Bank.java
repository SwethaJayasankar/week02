class BankClass{
	static String accHolder;
	static int accNumber;
	static int balance;
	BankClass(String a,int b,int c){
		accHolder = a;
		accNumber = b; 
		balance = c;
	}
	static void withdraw(int amnt){
		if(balance>amnt){
			balance-=amnt;
			System.out.println("Money successfully withdrawn");
			System.out.println("Balance is : "+ balance);
		}else{
			System.out.println("Insufficient balance");
		}
	}
	static void deposit(int amnt){
		balance+=amnt;
		System.out.println("Money successfully deposited");
		System.out.println("Balance is : "+ balance);
	}
	static void display(){
		System.out.println("Your Current Balance is : "+ balance);
	}
}

public class Bank{
	public static void main(String[] args){
		BankClass b = new BankClass("Priya",547674,40000);
		b.deposit(500);
		b.withdraw(10000);
		b.display();
	}
}

