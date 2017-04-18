import java.util.Scanner; 
import java.util.Random;

/**
 * Write a description of class array here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class array
{
   
     
   public void main()
   {
       Scanner scr = new Scanner(System.in); 
       Random rnd = new Random(); 
       int[] array = new int[7]; 
       int resultat; 
       
       System.out.println("")
       for(int i = 0; i < array.length; i++)
       {
           array[i] = rnd.nextInt(20);
       }
  
   }
}
