//Lab01 Exercise 4
 public class BankAccount {
    Person person;
    String accountNumber;
    double balance;

    BankAccount(String name, String surname, String sex, String occupation, String organization, String accountNumber, double balance){
        person = new Person(name, surname, sex, occupation, organization);
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double x){
        balance = balance + x;
    }

    void withdraw(double x){
        balance = balance - x;
    }

    void printInfo(){
        person.printInfo();
        // System.out.println("Name: " + person.name);
        // System.out.println("Surname: " + person.surname);
        // System.out.println("Sex: " + person.sex);
        // System.out.println("Occupation: " + person.occupation);
        // System.out.println("Organization: " + person.organization);
        System.out.println("Account Number " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    void printBalance(){
        System.out.println("Balance = " + balance + " million USD");
    }

    double convertBalanceToTHB(){
        return 32.66 * balance;
    }
}
