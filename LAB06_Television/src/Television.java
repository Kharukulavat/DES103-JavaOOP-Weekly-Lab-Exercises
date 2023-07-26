import java.awt.*;
import javax.swing.*;

//Inherit appropriate superclass
public class Television extends JFrame {

    public Television(String title) {
        super(title);
        //Call a method TelevisionComponents
        this.TelevisionComponents();
        //set JFrame
        this.setSize(900,600);
        this.setVisible(true);
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void TelevisionComponents() {
        //create a button_TelevisionScreen and panal_TelevisionButtonBar
        JButton button_TelevisionScreen = new JButton();
        BarPanel panal_TelevisionButtonBar = new BarPanel();

        //Add to this Television
        add(button_TelevisionScreen, BorderLayout.CENTER);
        add(panal_TelevisionButtonBar, BorderLayout.SOUTH);

    }
}