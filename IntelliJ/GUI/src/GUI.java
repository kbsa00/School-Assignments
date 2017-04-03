import javax.swing.*;
import java.awt.*;
public class GUI {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel(new GridBagLayout() );

        JButton b1 = new JButton("Button 1 ");
        JButton b2 = new JButton("Button 2");

        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 1;
        p.add(b1,c);
        c.gridx = 0;
        c.gridy = 1;
        p.add(b2);

        f.add(p);

        if (b1.isSelected())
        {
            JOptionPane.sho
        }
        }
    }
