import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

//Inherit appropriate superclass
public class ControlPanel extends JPanel{
    public ControlPanel() {

        //create a On/Of button and add to the power panel
        JButton On_Off = new JButton("On/Off");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(On_Off);

        //create two adjust panels and add to the layout of this control Panel
        setLayout(new GridLayout(1,3));
        add(new AdjustPanel("Channal"));
        add(new AdjustPanel("Volume"));
        add(On_Off);

    }
}