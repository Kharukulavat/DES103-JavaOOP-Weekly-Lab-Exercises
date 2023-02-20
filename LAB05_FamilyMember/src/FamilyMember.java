//Exercise 1: Write a FamilyMember class of which its details (2 points)
public class FamilyMember {
    //Exercise 1: add properties
    static String familyName = "Hilton";
    String firstname;
    static double commonFund = 10000.00;
    double privateFund;
    //Exercise 1: add constructor
    public FamilyMember(String firstname, double privateFund) {
        this.firstname = firstname;
        this.privateFund = privateFund;
    }
    //Exercise 1: add method
    void printPrivateFund() {
        System.out.println(firstname + " " + familyName + " has $" + privateFund);
    }
    //Exercise 3-a: add two additional methods
    void contributeToCommonFund(double amount) {
        privateFund -= amount;
        commonFund += amount;
    }
    static void payFromCommonFund(double amount) {
        commonFund -= amount;
    }
    //Exercise 3-c: print the common fund of the family.
    static void printFamilyFund() {
        System.out.println("The " + familyName + " family has $" + commonFund);
    }

}