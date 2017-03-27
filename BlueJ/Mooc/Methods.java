import java.util.*;
/**
 * Write a description of class Methods here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Methods
{
   public void StringMethod()
   {
       Scanner scr = new Scanner(System.in); 
       
       String name = ""; 
       System.out.println("Whats your name? ");
       name = scr.nextLine();
       
       System.out.println("\nThe length of your name: " + name.length());
       
       System.out.println("The first character is: " + name.charAt(0));
       
       for (int i = 0; i < name.length(); i++)
       {
           System.out.println(i + " "+ "Character:  " + name.charAt(i));
       }
       
       
       System.out.println("Your name in reverse. ");
       String result = new StringBuffer(name).reverse().toString();
       
       System.out.println(result);
   }
   
   public void Math()
   {
       Scanner scr = new Scanner(System.in); 
       int x; 
       int y;
       System.out.println("Write a number"); 
       y = scr.nextInt(); 
       System.out.println("Write another number:"); 
       x = scr.nextInt(); 
       
       System.out.println("The highest number of " + y + " and "+ x + " will be: " + Math.max(y,x));
       
       System.out.println("\nThe lowest number of " + y + " and "+ x + " will be: " + Math.min(y,x));
       
       double a; 
       double f; 
       System.out.println("\nWrite another decimal number:"); 
       a = scr.nextDouble();
       
       System.out.println("The number will round up " + Math.ceil(a));
       
       System.out.println("\nWrite another deicmal number: ");
       f = scr.nextDouble(); 
       
       System.out.println("The number will round down " + Math.floor(f));
       
       int o; 
       System.out.println("\n Lets find the Square Root of a number"); 
       System.out.println("Write your number:"); 
       o = scr.nextInt(); 
       System.out.println("The square root of " + o + " will be" + Math.sqrt(o));
   }
}
