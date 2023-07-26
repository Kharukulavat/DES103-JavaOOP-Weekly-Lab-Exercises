import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class KeyboardEvent extends JPanel implements KeyListener {
//    JLabel l1 = new JLabel();
    String message = "";
    public KeyboardEvent() {
        this.addKeyListener(this);
        setFocusable(true);
    }
    protected void paintComponent(Graphics g) {
        g.setColor(Color.BLUE);
        g.setFont(new Font("SansSerif", Font.BOLD,32));
        g.drawString(message,0,100);
    }
    @Override
    public void keyTyped(KeyEvent e) {
        message = message + e.getKeyChar();
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
