import javax.swing.*;
public class CatchingFlashBallTesting {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); //create an object of this frame
        CatchingFlashBall myCatchingFlashball = new CatchingFlashBall();//create an object of CatchingFlashingBall
        frame.add(myCatchingFlashball); //add JPanel into JFrame
        // Configure the frame
        frame.setTitle("My Catching FlashBall"); //set Title of this frame
        frame.setSize(600, 400); //set a frame's size
        frame.setLocationRelativeTo(null); //set a location at the center of the frame
        frame.setVisible(true); //set visibility of this frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//set default Close Operation
    }

}
