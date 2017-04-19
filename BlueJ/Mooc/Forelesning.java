import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Forelesning extends JFrame implements ActionListener
{
    public Forelesning()
    {
     setTitle("Huskelapp");
     add(new JTextArea(), BorderLayout.CENTER);
     setVisible(true);
     JPanel p = new JPanel(new GridLayout(1, 3));
     JButton b2 = new JButton("Lagre"); 
     JButton b3 = new JButton("hente");
     JButton b1 = new JButton("Avslutt");
     p.add(b2); 
     p.add(b3);
     p.add(b1);
     
     b2.addActionListener(this); 
     b3.addActionListener(this);
     b1.addActionListener(this); 
     
     add(p, BorderLayout.SOUTH);
     b1.addActionListener(this);
     setSize(400, 200); 
    
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    public void actionPerformed(ActionEvent event)
    {
      String text = event.getActionCommand();
      int choice;   
        if(text.equals("Avslutt")){
        JOptionPane.showConfirmDialog(null, "Er du sikker på at du vil avslutte?");
        if(choice == YES_OPTION)
        {
            JOptionPane.showMessageDialog(null,"Avsluttet.");
        }
        else if(choice == NO_OPTION)
        {
            JOptionPane.showMessageDialog(null,"Ikke avsluttet");
        }
        
      } 
      else if(text.equals("Lagre")){
    
        JOptionPane.showConfirmDialog(null,"Er du sikker på at du vil lagre?");
        
        
      }
      else if(text.equals("Hent"))
      {
          JOptionPane.showMessageDialog(null, "Henter..");
      }
    }
}
