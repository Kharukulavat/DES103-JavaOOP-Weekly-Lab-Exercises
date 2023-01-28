package LAB01_INTRO_TO_OOP.Rectangle;
//Lab01 Exercise 1 
public class Rectangle {
    double width;
    double lenght;

    Rectangle(){
        width = 1;
        lenght = 1;
    }

    Rectangle(double w, double l){
        width = w;
        lenght = l;
    }

    double findArea(){
        return width * lenght;
    }

    double findPerimeter(){
        return 2*(width+lenght);
    }

    double findDiagonal(){
        return Math.sqrt((width*width) + (lenght*lenght));
    }

    boolean isSquare(){
        return width == lenght;
    }

    void printBasicInfo(){
        System.out.println("The width is " + width);
        System.out.println("The lenght is " + lenght);
    }

    
}
