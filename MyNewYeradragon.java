import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;

public class MyNewYeradragon extends JPanel{
    public static void main(String[] args) {
        MyNewYeradragon m = new MyNewYeradragon();

        JFrame f = new JFrame();
        f.add(m);
        f.setTitle("First Swing");
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    public void paintComponent(Graphics g) {
        BufferedImage buffer = new BufferedImage(600, 600, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = buffer.createGraphics();

        g2.setColor(Color.WHITE);
        g2.fillRect(0, 0, 600, 600);
        g2.setColor(Color.BLACK);
        Poster.poster(g2);
        mydraw.lefteye(g2);
        mydraw.righteye(g2);
        mydraw.face(g2);
        mydraw.horn(g2);
        mydraw.arm(g2);
        mydraw.body(g2);
        mydraw.leg(g2);
        bg.background(g2);
        mydraw.heard(g2);
        peint.colorpent(buffer);
        g.drawImage(buffer, 0, 0, null);
    }


    

}
