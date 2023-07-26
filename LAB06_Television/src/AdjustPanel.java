import java.awt.*;
import javax.swing.*;

//Inherit appropriate superclass
public class AdjustPanel extends JPanel{

    public AdjustPanel(String centerText) {
        this.setLayout(new FlowLayout());
        //create three buttons: Less, center text, and more
        JButton Less = new JButton("<<");
        JButton center_text = new JButton(centerText);
        JButton more = new JButton(">>");

        //Add to this AdjustPanel panel
        this.add(Less);
        this.add(center_text);
        this.add(more);
    }
}