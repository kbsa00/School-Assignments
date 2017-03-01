import java.util.Scanner; 
/**
 * Write a description of class L_Client here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Client
{
   public void MainMethod()
   {
     Lotto t1 = new Lotto(); 
    
     System.out.println("Generer Ukens lottokupong...");
     int[] ukensrekke = t1.generer(); 
     
     System.out.println("Vær så grei å tast inn dine tall til din kupong");
     int[] minrekke = t1.Setin();
     
     System.out.println("Her er din kupong");
     t1.print(minrekke);
     
     System.out.println("Her er ukenskupong");
     t1.print(ukensrekke);  
     
    
     System.out.println("Du tippet altså " + t1.compare(ukensrekke, minrekke) + " riktig"); 
    
    
    
    
    }
   
   
   
   
}
