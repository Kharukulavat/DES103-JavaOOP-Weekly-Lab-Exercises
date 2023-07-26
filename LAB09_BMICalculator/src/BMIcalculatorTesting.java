import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class BMIcalculatorTesting {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My BMI Calculator");
        BMIcalculator bmi = new BMIcalculator(); //create an object of BMICaculator
        frame.add(bmi); //add JPanel into JFrame
//        frame.setLayout(new BorderLayout());

        frame.setSize(400, 200); //set a frame's resolution
        frame.setLocationRelativeTo(null); //set a location at center the frame
        frame.setVisible(true); //set visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set default Close Operation
    }
}
