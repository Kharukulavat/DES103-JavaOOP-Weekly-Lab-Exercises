//Lab04 Polymorphism Exercise3
public class FullTime extends Employee implements TaxPayer{
    String workplace;
    double salary;
    FullTime(String name, String position, String workplace, double salary) {
        super(name, position);
        this.workplace = workplace;
        this.salary = salary;
    }
    @Override
    void printWorkPlace() {
        System.out.println("Work at " + workplace);
    }
    @Override
    double calculateMonthlyIncome() {
        return salary;
    }
    @Override
    public double calculateYearlyIncome() {
        return 12*salary;
    }
    @Override
    public double calculateTax() {
        return calculateTaxRate(calculateYearlyIncome()) * calculateYearlyIncome();
        //(Tax = TaxRate * YearlyIncome)
    }
    @Override
    public void payTax() {
        System.out.println("Pay tax $" + calculateTax());
    }
    public void printInfo() {
        super.printInfo(); //name is a position
        printWorkPlace();
        System.out.println("Yearly income is " + calculateYearlyIncome());
        payTax();

        System.out.println("--------------------");
    }
}
