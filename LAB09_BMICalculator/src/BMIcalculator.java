import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BMIcalculator extends JPanel {
    JPanel panel1_UserInformation = new JPanel();
    JPanel panel2_HeightAndWight = new JPanel();
    JPanel panel3_BMIResult = new JPanel();
    JLabel text = new JLabel("Enter for your information");
    JLabel your_height = new JLabel("Your height (cm):");
    JLabel your_weight = new JLabel("Your weight (kg): ");
    JTextField height_tf = new JTextField(40);
    JTextField weight_tf = new JTextField(40);
    JButton button_BMIcalculation = new JButton("Compute BMI");
    JLabel BMI = new JLabel("BMI = ");
    public BMIcalculator() {
        panel1_UserInformation.setLayout(new BorderLayout());
        panel1_UserInformation.add(text, BorderLayout.WEST);
        panel2_HeightAndWight.setLayout(new GridLayout(2,2));
        panel2_HeightAndWight.add(your_height);
        panel2_HeightAndWight.add(height_tf);
        panel2_HeightAndWight.add(your_weight);
        panel2_HeightAndWight.add(weight_tf);
        panel3_BMIResult.setLayout(new GridLayout(2,1));
        panel3_BMIResult.add(button_BMIcalculation);
        panel3_BMIResult.add(BMI);

        setLayout(new GridLayout(3,1));
        add(panel1_UserInformation);
        add(panel2_HeightAndWight);
        add(panel3_BMIResult);

        new ActionInterpretor();
    }
    public class ActionInterpretor implements ActionListener {
        public ActionInterpretor() {
            height_tf.addActionListener(this);
            weight_tf.addActionListener(this);
            button_BMIcalculation.addActionListener(this);
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button_BMIcalculation) {
                double w = Double.parseDouble(weight_tf.getText());
                double h = Double.parseDouble(height_tf.getText())/100;
                double bmi = w/(h*h);

                BMI.setText("BMI = " + String.format("%.2f", bmi));
            }
        }
    }
}

