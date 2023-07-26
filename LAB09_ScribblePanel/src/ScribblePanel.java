import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ScribblePanel extends JPanel implements MouseListener, MouseMotionListener{
    int r = 20;
    int x = 0;
    int y = 0;

    public ScribblePanel() {
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        super.paintComponent(getGraphics());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Graphics g = getGraphics();
        if(e.getModifiersEx() == InputEvent.BUTTON1_DOWN_MASK) {
            g.setColor(Color.BLACK);
            g.drawLine(x,y,e.getX(),e.getY());
        }
        else {
            g.setColor(getBackground());
            g.fillOval(x-r,y-r,2*r,2*r);
        }
        x = e.getX();
        y = e.getY();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
