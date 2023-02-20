public class FamilyMemberTesting {
    public static void main(String[] args) {

        //Exercise 2-a: use  the dot operator to print out  familyName with commonFund
        System.out.println("# COMMON FUND OF THE FAMILY");
        System.out.println("The " + FamilyMember.familyName + " family has $" + FamilyMember.commonFund);

        System.out.println("-------------------------- \n");
        //initialize arrays

        //Exercise 2-b: create an array arrayFamily for adding four members.
        FamilyMember[] arrayFamily = new FamilyMember[4];
        arrayFamily[0] = new FamilyMember("John", 254639.12);
        arrayFamily[1] = new FamilyMember("Erika", 187346.56);
        arrayFamily[2] = new FamilyMember("James", 56783.12);
        arrayFamily[3] = new FamilyMember("Paris", 12124.88);

        //Exercise 2-b: print private fund for all family members.
        System.out.println("# PRIVATE FUND");
        arrayFamily[0].printPrivateFund();
        arrayFamily[1].printPrivateFund();
        arrayFamily[2].printPrivateFund();
        arrayFamily[3].printPrivateFund();

        System.out.println("-------------------------- \n");

        //Exercise 3-b: contribute private fund to common fund
        System.out.println("# CONTRIBUTION OF PRIVATE FUND");
        //Erika
        arrayFamily[1].contributeToCommonFund(100000);
        //Paris
        arrayFamily[3].contributeToCommonFund(10000);

        arrayFamily[0].printPrivateFund();
        arrayFamily[1].printPrivateFund();
        arrayFamily[2].printPrivateFund();
        arrayFamily[3].printPrivateFund();

        System.out.println("-------------------------- \n");

        //Exercise 3-d: print the updated common fund of the family.
        System.out.println("# UPDATED COMMON FUND OF THE FAMILY");
        FamilyMember.printFamilyFund();
        System.out.println("-------------------------- \n");

    }
}