//Lab03 Inheritance Exercise1
public class Person {
    Name name;
    Date dateOfBirth;
    static int numPerson = 0;
    Person(String firstName, String lastName, int day, int month, int year) {
        this.name = new Name(firstName,lastName);
        this.dateOfBirth = new Date(day, month, year);
        numPerson++;
    }
    void printInfo() {
        System.out.println("Name: " + name.firstName + " " + name.lastName);
        System.out.println("DOB: " + dateOfBirth.day + "-" + dateOfBirth.month + "-" + dateOfBirth.year);
        System.out.println("Age: " + (2017 - dateOfBirth.year));
    }
    void printAgeAtYear(int year) {
        System.out.println("Age: " + (2017-year));
    }
    void printNumberOfPerson() {
        System.out.println("The total number of Persons is " + numPerson + "persons.");
    }
}
