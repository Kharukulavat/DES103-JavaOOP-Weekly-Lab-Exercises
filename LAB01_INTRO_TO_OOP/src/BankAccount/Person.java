//Lab01 Exercise 3 
public class Person {
    String name;
    String surname;
    String sex;
    String occupation;
    String organization;

    Person(String name, String surname, String sex, String occupation, String organization){
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.occupation = occupation;
        this.organization = organization;
    }

    void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Sex: " + sex);
        System.out.println("Occupation: " + occupation);
        System.out.println("Organization " + organization);
    }
}
