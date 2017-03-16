import java.util.Random;
import java.util.Scanner;
/**
 * Write a description of class Guess here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Guess
{
   public Guess()
   {
    
   }
   
   public void Start()
   {
    Random rnd = new Random(); 
    Scanner scr = new Scanner(System.in); 
    int guessnr = rnd.nextInt(25); 
    int myguess; 
    System.out.println("Tipp rett tall. Fra 1 til 25"); 
    boolean stop = false; 
    while (stop == false)
    {
      myguess = scr.nextInt(); 
      
      if (myguess < guessnr)
      {
        System.out.println("For lavt");   
      }
      else if (myguess > guessnr)
      {
        System.out.println("For høyt");   
        
      }
      else if (myguess == guessnr)
      {
        System.out.println("Du tippet riktig");
        stop = true;
        
      }
    
    }
    
    
    
    
    
    
   }
}
