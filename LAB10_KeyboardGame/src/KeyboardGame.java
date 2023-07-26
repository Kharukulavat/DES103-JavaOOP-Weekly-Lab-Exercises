import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class KeyboardGame extends JPanel implements ActionListener, KeyListener{
    Timer timer = new Timer(1000,this);
    char displayedChar = 'Z';
    char response = '?';
    int score = 0;
    Font myfont = new Font("SansSerif",Font.BOLD,45);

    public KeyboardGame() {
        this.addKeyListener(this);
        this.setFocusable(true);
        timer.start();
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.setFont(myfont);
        g.drawString("Letter: " + displayedChar,75,75);
        g.drawString("You Typed ",75,150);

        g.setColor(Color.BLUE);
        g.drawString("" + response, 350,150);

        g.setColor(Color.BLACK);
        g.drawString("Your Score = " + score,75,225);
    }
    public char getRandomChar() {
        Random random = new Random();
        return (char) (65 + random.nextInt(26));
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        displayedChar = getRandomChar();
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        response = e.getKeyChar();
        if (response == displayedChar) {
            score++;
        }
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
