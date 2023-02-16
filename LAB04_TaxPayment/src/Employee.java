//Lab04 Polymorphism Exercise1 
public abstract class Employee {
    String name;
    String position;
    Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }
    abstract double calculateMonthlyIncome();
    abstract void printWorkPlace();
    void printInfo() {
        System.out.println(name + " is a " + position);
    }
    double calculateTaxRate(double salary) {
        if (salary <= 200000){
            return 0.0;
        } else if (salary <= 400000){
            return 0.05;
        } else if (salary <= 600000) {
            return 0.1;
        } else if (salary <= 800000) {
            return 0.15;
        } else{
            return 0.2;
        }
        /* using Ternary operator
        return salary <= 200000 ? 0.0 :
                salary <= 400000 ? 0.05 :
                        salary <= 600000 ? 0.1 :
                                salary <= 800000 ? 0.15 :
                                        0.2; */
    }
}
