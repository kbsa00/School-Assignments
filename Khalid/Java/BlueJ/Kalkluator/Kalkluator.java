import java.util.Scanner; 
/**
 * Just a simple class where you've got methods that can excute some calculations 
 * 
 * @author (KBSA) 
 * @version (a version number or a date)
 */
public class Kalkluator
{
    private double firstnum; 
    private double secondnum; 
    private double answer; 
    public Kalkluator()
    {
    Scanner input = new Scanner(System.in); 
    double firstnum = 0;
    double secondnum = 0; 
    double answer = 0;
    }
    
    public void Adding()
    {
      Scanner input = new Scanner(System.in); 
      for (int i = 0; i < 20; i++)
      {
      System.out.println(" "); 
      System.out.println("You chose adding this time.");  
    
      System.out.println("Write in your First nummer");
      firstnum = input.nextDouble(); 
      
      System.out.println("Write in your Second nummer");
      secondnum = input.nextDouble(); 
      
      answer = firstnum + secondnum;
      
      System.out.println("Here is your number");
      System.out.println(answer); 
    }
      
    }
    
    public void Minus()
    {
     Scanner scr = new Scanner(System.in); 
     
     for(int i = 0; i < 20; i++)
     {
     System.out.println(" "); 
     System.out.println("You chose minus this time.");
     System.out.println("Please write in your first nummer");
     firstnum = scr.nextDouble();
     
     System.out.println("Please write in your second nummer");
     secondnum = scr.nextInt(); 
     
     System.out.println("The answer is ");
     answer = firstnum - secondnum; 
     System.out.println(answer);
    }
    }
    
    public void Divide()
    {
      Scanner sc = new Scanner(System.in); 
      for (int i = 0; i < 20; i++)
      {
      System.out.println(" "); 
      System.out.println("You chose to divide this time.");
      
      System.out.println("Please write your first nummer");
      firstnum = sc.nextDouble(); 
      
      System.out.println("Please write in your second nummer");
      secondnum = sc.nextDouble(); 
      
      System.out.println("The answer is ");
      answer = firstnum / secondnum; 
      
      System.out.println(answer); 
    }
    }
    
    public void Multiply()
    {
     Scanner scn = new Scanner(System.in);
     for (int i = 0; i < 20; i++)
     {
      System.out.println(" "); 
      System.out.println("You chose to Multiply this time.");
      
      System.out.println("Please write your first nummer");
      firstnum = scn.nextDouble(); 
      
      System.out.println("Please write in your second nummer");
      secondnum = scn.nextDouble(); 
      
      System.out.println("The answer is ");
      answer = firstnum * secondnum; 
      
      System.out.println(answer); 
     }
    }
}
