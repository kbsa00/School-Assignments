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
           System.out.println((i + 1) + " "+ "Character:  " + name.charAt(i));
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
   
   
   public void Week1()
   {
       //Password assignment,  

       Scanner scr = new Scanner(System.in); 
       
       String username = "";  
       String password = "";  
    
       System.out.println("Please write your username."); 
       username = scr.nextLine().toLowerCase();
       System.out.println("\nPlease write your password."); 
       password = scr.nextLine();
       System.out.println("Logging in..."); 
       
       if(username.equals("khalid") && password.equals("khalid123"))
       {
           System.out.println("You have succsessfully logged in. Welcome!"); 
        
       }
       else 
       {
           System.out.println("Sorry wrong password or wrong username");
       }
   }
   
   public void UpToHundred()
   {
       //A loop from 1 to hundred. 
       for(int i = 1; i <= 100; i++)
       {
           System.out.println(i); 
        
       }
   }
   
   public void HundredToOne()
   {
       //A loop from hundred to One. 
       for (int i = 100; i >=1; i--)
       {
           System.out.println(i);
       }
    }
  
   
}
