import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class CatchingFlashBall extends JPanel {
    Timer timer = new Timer(1000,new TimerListener());
    int xcenter = 15;
    int ycenter = 15;
    int r = 15;
    public CatchingFlashBall() {
        this.addMouseListener(new Catcher());
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.BLACK);
        g.setColor(Color.ORANGE);
        g.fillOval(xcenter-r,ycenter-r,r*2,r*2);
    }

    public class TimerListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            Random random = new Random();
            xcenter = random.nextInt(getWidth());
            ycenter = random.nextInt(getHeight());
            repaint();
        }

    }
    public class Catcher implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {
            int distance = (int) calculateDistance(e.getX(),e.getY(),xcenter,ycenter);
            if (distance <= r) {
                timer.stop();
            }
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
    }
    double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1-y2, 2));
    }

}
