package Developer;

public class TestBankAccount1 {
    public static void main(String [] args){
        BankAccount acc = new BankAccount("Paris Hilton","127-983-3847", 1000000.00 );
//        System.out.println(acc.balance); //balance is private
        System.out.println(acc.getBalance());
    }
}
