import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class GUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GUI
{
    public void Panel()
    {
        //The assignment said that we had to alling the label "Hello" in the middle of the textbox. 
 
        JFrame frame = new JFrame();
        JPanel panel = new JPanel(); 
        JLabel label = new JLabel(); 
        
        panel.setLayout(new GridBagLayout());
        label = new JLabel("HELLO");
        panel.add(label);
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    
    
    
    }
    
    public void Survey()
    {
        JFrame frame = new JFrame(); 
        JPanel panel = new JPanel();
        JLabel label = new JLabel();
        
        
        
        frame.setVisible(true); 
        frame.setSize(200, 200);
        frame.setTitle("Survey");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
        panel.setLayout(new BorderLayout()); 
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        label = new JLabel("CHOOSE MEAT OR FISH?"); 
        panel.add(label, BorderLayout.NORTH); 
        frame.add(panel);
        
        JRadioButton r1 = new JRadioButton("Meat"); 
        JRadioButton r2 = new JRadioButton("Fish");
        panel.add(r1); 
        panel.add(r2, BorderLayout.SOUTH);
        
        JButton b1 = new JButton(); 
        b1 = new JButton("DONE");

        
        
    }
}
