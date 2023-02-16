//Lab04 Polymorphism Exercise5
public class TaxPaymentTest {
    public static void main(String[] args) {
        // Ex5 Part A)
        FullTime employee01_FullTime = new FullTime("Erika Parker", "secretary", "InfoTech", 32500.00);
        PartTime employee02_PartTime = new PartTime("Brian Lee", "driver", "InfoTech", 15, 100);
        Employee employee03 = new FullTime("James Knein", "tecnician", "InfoTech", 35500.00);
        Employee employee04 = new PartTime("Anne Lin", "accountant", "InfoTech", 30, 150);
        TaxPayer employee05_TaxPayer = new FullTime("Jamie Fox", "Manager", "InfoTech", 57300.00);

        employee01_FullTime.printInfo(); //Erika Parker
        employee02_PartTime.printInfo(); //Brian Lee
        employee03.printInfo(); //James Knein
        employee04.printInfo(); //Anne Lin
        ((FullTime)employee05_TaxPayer).printInfo(); //Jamie Fox, try casting


        //Ex5 Part b)
        // Without changing the class-types declaration of the following variables:
        // what do you need to do to be able to call payTax() of ft, pt, and t1. (Hint: casting)

        ((FullTime)employee03).payTax();
        ((PartTime)employee04).payTax();
         employee05_TaxPayer.payTax();

    }
}
