package Developer;

public class BankAccount {
    //Exercise 4: add properties
	private String ownerName;
    String accountNumber;
	private double balance;
	public static int numAccount = 0;
	public BankAccount(String ownerName, String accountNumber, double balance) {
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        numAccount++;
    }
	public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposit: $" + amount);
    }
	protected void withdraw(double amount) {
        if (balance > amount) {
            balance = balance - amount;
            System.out.println("Withdraw: $" + amount);
        } else {
            System.out.println("Not enough balance!");
        }
    }
    void printInfo() {
        System.out.println(ownerName + "\t" + accountNumber + "\t" + balance);
    }

    // Exercise 4-b-2: access the encapsulated variables
	public double getBalance() {
        return balance;
    }

}
