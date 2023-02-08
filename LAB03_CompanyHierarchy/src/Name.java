//From In class Class Components in more details: Exercise 4
public class Name {
    String firstName;
    String lastName;

    Name(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void printName() {
        System.out.println(firstName + " " + lastName);
    }
}
