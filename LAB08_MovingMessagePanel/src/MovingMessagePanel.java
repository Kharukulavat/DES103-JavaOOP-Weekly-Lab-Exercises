import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class MovingMessagePanel extends JPanel implements ActionListener, ItemListener, MouseMotionListener{
    JPanel MessagePanel = new JPanel();
    JPanel ColorPanel = new JPanel();
    JPanel RadioButton = new JPanel();
    JPanel DirectionalPanel = new JPanel();
    JLabel messageLB = new JLabel("Message to be displayed");
    JTextField blankTF = new JTextField(40);
    JLabel colorLB = new JLabel("Background Color");
    JRadioButton whiteRB = new JRadioButton("white");
    JRadioButton blackRB = new JRadioButton("black");
    JRadioButton mouseRB = new JRadioButton("Use Mouse");
    Color textcolor;
    Color bgcolor;
    JButton leftBT = new JButton("Left");
    JButton rightBT = new JButton("Right");
    JButton upBT = new JButton("Up");
    JButton downBT = new JButton("Down");
    String message = " ";
    int x  = getX();
    int y = 100;

    public MovingMessagePanel(String s) {
        JFrame frame = new JFrame(s);
        frame.setLayout(new BorderLayout());
        frame.add(MessagePanel, BorderLayout.NORTH);
        frame.add(ColorPanel, BorderLayout.WEST);
        frame.add(RadioButton, BorderLayout.EAST);
        frame.add(DirectionalPanel, BorderLayout.SOUTH);
        frame.add(this, BorderLayout.CENTER);

        ColorPanel.setLayout(new GridLayout(3,1));
        ColorPanel.add(colorLB);
        ColorPanel.add(whiteRB);
        ColorPanel.add(blackRB);

        MessagePanel.add(messageLB);
        MessagePanel.add(blankTF);

        DirectionalPanel.add(leftBT);
        DirectionalPanel.add(rightBT);
        DirectionalPanel.add(upBT);
        DirectionalPanel.add(downBT);

        RadioButton.setLayout(new BorderLayout());
        RadioButton.add(mouseRB, BorderLayout.CENTER);


        blankTF.addActionListener(this);
        whiteRB.addItemListener(this);
        blackRB.addItemListener(this);
        mouseRB.addActionListener(this);
        leftBT.addActionListener(this);
        rightBT.addActionListener(this);
        upBT.addActionListener(this);
        downBT.addActionListener(this);
        this.addMouseMotionListener(this);

        frame.setVisible(true);
        frame.setSize(800,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MovingMessagePanel("My Moving Message Panel");
    }
    protected void paintComponent (Graphics g){
        super.paintComponent(g);
        Font myfont = new Font("SansSerif", Font.BOLD, 32);
        g.setFont(myfont);
        g.setColor(textcolor);
        setBackground(bgcolor);
        g.drawString(message, x, y);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == blankTF){
            message = e.getActionCommand();
        }
        else if (e.getActionCommand() == "Left") {
            x = x-5;
        }
        else if (e.getActionCommand() == "Right"){
            x = x+5;
        }
        else if (e.getActionCommand() == "Up"){
            y = y-5;
        }
        else if (e.getActionCommand() == "Down"){
            y = y+5;
        }
        repaint();
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource() == whiteRB) {
            bgcolor = Color.WHITE;
            textcolor = Color.BLACK;
            blackRB.setSelected(false);
        }
        else if (e.getSource() == blackRB) {
            bgcolor = Color.BLACK;
            textcolor = Color.PINK;
            whiteRB.setSelected(false);
        }
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if(mouseRB.isSelected()) {
            x = e.getX();
            y = e.getY();
            repaint();
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
