import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JFRAME extends JFrame implements ActionListener
{
    //private JFrame f; 
    //private JTextArea j;
    public JFRAME()
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
        
        if(text.equals("Avslutt")){
        System.out.println("Avslutter..");
        System.exit(0);
        
      } 
      else if(text.equals("Lagre")){
    
        System.out.println("Lagret og Avsluttet.");
        System.exit(0); 
        
      }
      else if(text.equals("Hent"))
      {
          System.out.println("Henter..");
      }
    }
}
