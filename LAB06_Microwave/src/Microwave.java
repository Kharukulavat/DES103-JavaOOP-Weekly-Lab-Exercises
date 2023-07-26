import java.awt.*;
import javax.swing.*;

public class Microwave extends JFrame {
    public Microwave() {
        //Call the method: MicrowaveComponents
        super("The Front View of a Microwave Oven");
        this.MicrowaveComponents();

        //Set JFrame
//        this.setTitle(title);
        this.setSize(550,250);
        this.setVisible(true);
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void MicrowaveComponents() {
        //Create the first panel of MicrowaveLayout to position its components
        JPanel panal01_MicrowaveLayout = new JPanel();
        panal01_MicrowaveLayout.setLayout(new BorderLayout());

        //Add the first panel into the EAST of MicrowaveLayout
        add(panal01_MicrowaveLayout, BorderLayout.EAST);

        //Create a button to place foods at the CENTER of MicrowaveLayout
        JButton button_Foods = new JButton("Food to be placed here");
        add(button_Foods, BorderLayout.CENTER);

        //Create the second panel and set GridLayout for adding the button's numbers
        JPanel panal02_NumberLayout = new JPanel();
        panal02_NumberLayout.setLayout(new GridLayout(4,3));


        //At the first panel, Create a textfield to display its time at the NORTH of MicrowaveLayout
        JTextField textfield_TimeDisplay = new JTextField("Microwave Time Display");
        panal01_MicrowaveLayout.add(textfield_TimeDisplay, BorderLayout.NORTH);
        //Use a FOR loop to add the button's numbers into the NumberLayout
        for(int i = 1; i < 10; i ++){
            panal02_NumberLayout.add(new JButton("" + i));
        }

        //Create three button(Stop, 0, Start) and add them into the second JPanel
        panal02_NumberLayout.add(new JButton("Stop"));
        panal02_NumberLayout.add(new JButton("0"));
        panal02_NumberLayout.add(new JButton("Start"));

        //Add the second JPanel to the first panel at the CENTER of MicrowaveLayout
        panal01_MicrowaveLayout.add(panal02_NumberLayout, BorderLayout.CENTER);

    }
}