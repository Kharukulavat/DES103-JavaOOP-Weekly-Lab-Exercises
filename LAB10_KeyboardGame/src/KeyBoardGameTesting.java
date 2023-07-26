import javax.swing.*;
public class KeyBoardGameTesting {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); //create an object of this frame
        KeyboardGame myKeyboardGame = new KeyboardGame(); //create an object of KeyBoardGame
        frame.add(myKeyboardGame); //add the created object from KeyBoardGame
//Configure the frame
        frame.setTitle("My Keyboard Game"); //set Title of this frame
        frame.setSize(500, 300); //set a frame's size
        frame.setLocationRelativeTo(null); //set a location at the center of the frame
        frame.setVisible(true); //set visibility of this frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//set default Close Operation
    }
}
