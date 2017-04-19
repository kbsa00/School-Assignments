import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  
/**
 * Write a description of class Telephone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
  public class Telephone extends JFrame implements ActionListener
{
    private JPanel p; 
    private JPanel ps; 
    private JLabel l; 
    private JTextField j;
    private JButton b;
    
    public Telephone()
    {
        gui();
    
    }
    
    
    public void gui()
    {
        
        setTitle("Telephone"); 
        setSize(300, 300); 
        setVisible(true);
        
        JPanel p = new JPanel();
        JPanel ps = new JPanel();
        JPanel panel = new JPanel();
        JLabel l = new JLabel("numbers"); 
        JTextField j = new JTextField();
        
        ps.add(new JTextField(5));
        add(ps, BorderLayout.EAST);
   
        ps.add(l);
        p.setLayout(new GridLayout(4,3));
        add(p);
         
       
        
        for(int i = 1; i <= 9; i++)
        {
            JButton b = new JButton("" + i); 
            p.add(b);
            b.addActionListener(this);
        }
        panel.setLayout(new GridLayout(1,1));
        JButton b1 = new JButton("*");
        JButton b2 = new JButton("#");
        JButton b3 = new JButton("0");
        JButton call = new JButton("Call");
        p.add(b1); 
        p.add(b3);
        p.add(b2);
        panel.add(call, BorderLayout.WEST);
    }
    
    public void actionPerformed(ActionEvent event)
    {
     String button = event.getActionCommand(); 
     JTextField j = new JTextField();
     if(button.equals("2"))
        {
               j.setText(button);
               System.out.println(button);
        }
      
    }
}
