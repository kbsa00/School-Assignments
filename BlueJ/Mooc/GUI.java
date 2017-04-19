import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout; 
import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent;
/**
 * Write a description of class GUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GUI extends JFrame
{
    private JTextField item1;
    private JTextField item2;
    private JTextField item3;
    private JPasswordField passord; 
    
    
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
    
    public void MeatOrFish()
    {
        
        JPanel panel = new JPanel();
        JLabel label = new JLabel();
        
        setVisible(true); 
        setTitle("Survey");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
        panel.setLayout(new BorderLayout()); 
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        label = new JLabel("CHOOSE MEAT OR FISH?"); 
        panel.add(label, BorderLayout.NORTH); 
        add(panel);
        
        JRadioButton r1 = new JRadioButton("Meat"); 
        JRadioButton r2 = new JRadioButton("Fish");
        panel.add(r1); 
        panel.add(r2, BorderLayout.SOUTH);
        
        JButton b1 = new JButton(); 
        b1 = new JButton("DONE");
        pack();
        

        
        
    }
    
    public void Survery()
    {
        JPanel p = new JPanel();
        JLabel l = new JLabel(); 
        
        setTitle("Survey");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(200, 200);
        setVisible(true);
        
        
        p.setLayout(new GridLayout(4, 1));
        add(p, BorderLayout.NORTH); 
        l = new JLabel("Are you Sure?"); 
        p.add(l); 
        JRadioButton b1 = new JRadioButton("Yes"); 
        JRadioButton b2 = new JRadioButton("No");
        JButton b3 = new JButton("Done");
        p.add(b1); 
        p.add(b2); 
        p.add(b3);
    
    }
    
    public void telphone()
    {
        JPanel p = new JPanel();
        JPanel ps = new JPanel();
        JLabel l = new JLabel();
        
        setTitle("Telephone"); 
        setSize(300, 300); 
        setVisible(true); 
        
        ps.add(new JTextField(10));
        add(ps, BorderLayout.SOUTH);
        l = new JLabel("Numbers"); 
        ps.add(l);
        p.setLayout(new GridLayout(4,3));
        add(p); 
        
        for(int i = 1; i <= 9; i++)
        {
            JButton b = new JButton("" + i); 
            p.add(b);
        }
        
      
        JButton b1 = new JButton("*");
        JButton b2 = new JButton("#");
        JButton b3 = new JButton("0"); 
        p.add(b1); 
        p.add(b3);
        p.add(b2);  
    }
    
    
    public void input()
    { 
       
    
    }
}
