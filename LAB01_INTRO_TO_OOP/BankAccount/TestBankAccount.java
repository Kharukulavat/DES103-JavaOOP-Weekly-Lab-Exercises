//Lab01 Exercise 5
public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount BankAccount = new BankAccount("Wang", "TaLu", "Male", "Actor", "SIIT", "000-000-0000",10);

        BankAccount.printInfo();

        BankAccount.person.name = "Nipun";
        BankAccount.person.surname = "Kharuehapaisarn";
        BankAccount.person.sex = "Male";

        BankAccount.printInfo();

        BankAccount.deposit(15);

        System.out.println("Balance: " + BankAccount.balance);

        BankAccount.withdraw(5);

        System.out.println("Balance: " + BankAccount.balance);

        System.out.println(BankAccount.convertBalanceToTHB());

    }
    
}
