//From In class Class Components in more details: Exercise 3
public class Date {
    int day;
    int month;
    int year;

    Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    void printDate() {
        System.out.println(day + "-" + month + "-" + year + ".");
    }
}
