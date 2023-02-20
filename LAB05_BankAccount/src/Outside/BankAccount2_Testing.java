package Outside;

import Developer.BankAccount;

public class BankAccount2_Testing {
    public static void main(String[] args) {
        BankAccount account2 = new BankAccount("Paris Hilton", "127-983-3847", 1000000.00);

//         account2.printInfo(); //because printInfo() is default method
//         account2.withdraw(300.00); //withdraw() is protected method, can't use in different packages if it's not subclass
         System.out.println("The balance of account2 is $" + account2.getBalance()); //balance is private visibility
    }
}