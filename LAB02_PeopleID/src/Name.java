//Lab02 Exercise 2
public class Name {
    String firstName;
    String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    void printName() {
        System.out.println(firstName + " " + lastName);
    }
}
