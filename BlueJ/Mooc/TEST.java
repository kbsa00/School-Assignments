import javax.swing.*; 
import java.awt.event.*;
import java.awt.*;
/**
 * Write a description of class TEST here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TEST extends JFrame
{
   private JTextField tekst;
   private JTextField tekst1;
   
    
   public TEST()
   {
     setVisible(true);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     JPanel panel = new JPanel(new GridLayout(2,2));
       
     JLabel navn = new JLabel("Navn");
     tekst = new JTextField();
       
     panel.add(navn);
     panel.add(tekst);
       
     JLabel alder = new JLabel("Alder"); 
      tekst1 = new JTextField();
       
     panel.add(alder);
     panel.add(tekst1); 
     
     add(panel,BorderLayout.CENTER);
   }
   
   
   public void actionPerformed(ActionEvent event)
   {
    
    
   }
}
