import java.util.ArrayList;
/**
 * Write a description of class Client here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Client
{
    private ArrayList<Bok> list;
   
    public void mainMethod()
    {
         list = new ArrayList<Bok>();
         list.add(new TryktBok(12345, "Joseph Heller", "Cath22", "Penguin", 10, 5, 230));
         list.add(new TryktBok(23456, "Heide Linde", "Norsk sokkel", "Gyldendaal", 8, 10, 295));
         list.add(new Lydbok(34567, "Linn Ullmann", "De urolige", "Oktober", 8, 10, 410, 5, "Lisa Kolben"));
         list.add(new Lydbok(45678, "Jan-Philipp Sendker", "Mørke skygger","Cappelen Damm", 4, 1, 352, 8, "Kim Haugen")); 
         
         System.out.println("Alle forfattere: ");
         System.out.println();
         for(Bok print : list)
         {
             System.out.println(print.getForfatter());
         }
         System.out.println("\n"); 
         System.out.println("Alle Bøker:");
         System.out.println("\n"); 
         
         for(Bok p : list)
         {
             System.out.println(p);
             System.out.println(); 
         }
    }
}   

