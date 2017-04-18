import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout; 
import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent;
/**
 * Write a description of class Tuna here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tuna extends JFrame implements ActionListener
{
    private JTextField item1;
    private JTextField item2;
    private JTextField item3;
    private JPasswordField passord; 
    
    public Tuna()
    {
        run();
    
    }
    
    
    
    public void run()
    {
        setTitle("The title"); 
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 100);
        
        
        item1 = new JTextField(10); 
        add(item1); 
        item2 = new JTextField("Enter text here"); 
        add(item2); 
        item3 = new JTextField("uneditbale", 20); 
        item3.setEditable(false);
        add(item3); 
        passord = new JPasswordField("MyPass");
        add(passord);
        
      
        item1.addActionListener(this); 
        item2.addActionListener(this); 
        item3.addActionListener(this);
        passord.addActionListener(this); 
        
    }
    
    
    
    public void actionPerformed(ActionEvent event)
    {
          String string = ""; 
          if(event.getSource() == item1)
          {
              string = String.format("field 1: %s", event.getActionCommand()); 
          }
          else if(event.getSource() == item2)
          {
              string = String.format("field 2: %s", event.getActionCommand()); 
          }
          else if(event.getSource() == item3)
          {
              string = String.format("field 3: %s", event.getActionCommand()); 
          }
          else if(event.getSource() == passord)
          {
              string = String.format("password field is : %s", event.getActionCommand());
          }
          
          JOptionPane.showMessageDialog(null, string); 
          
        
    }
    
    
    
    
    
    }

