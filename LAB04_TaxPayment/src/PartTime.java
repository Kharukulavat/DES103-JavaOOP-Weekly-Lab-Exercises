//Lab04 Polymorphism Exercise4
public class PartTime extends Employee implements TaxPayer{
    String workplace;
    double numHrPerWeek;
    double hourlyRate;
    PartTime(String name, String position, String workplace, double numHrPerWeek, double hourlyRate) {
        super(name, position);
        this.workplace = workplace;
        this.numHrPerWeek = numHrPerWeek;
        this.hourlyRate = hourlyRate;
    }
    @Override
    void printWorkPlace() {
        System.out.println("Work at " + workplace);
    }
    @Override
    double calculateMonthlyIncome() {
        return numHrPerWeek*hourlyRate*4;
    }
    @Override
    public double calculateYearlyIncome() {
        return 12 * calculateMonthlyIncome();
    }
    @Override
    public double calculateTax() {
        return super.calculateTaxRate(calculateYearlyIncome()) * calculateYearlyIncome();
        // (Tax = TaxRate * YearlyIncome)
    }
    @Override
    public void payTax() {
        System.out.println("Pay tax " + calculateTax());
    }
    void printInfo() {
        super.printInfo(); //name is a position
        printWorkPlace();
        System.out.println("Yearly income is " + calculateYearlyIncome());
        payTax();

        System.out.println("--------------------");
    }
}
