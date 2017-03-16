import java.util.Scanner;
import java.util.Random; 
/**
 * Write a description of class Lotto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lotto
{
    private int[] ukensrekke; 
    private int[] minrekke; 
    
    public Lotto()
    {
      ukensrekke = new int [6];
      minrekke = new int [6];
    }
    
    public int[] generer()
    {
      Random rnd = new Random(); 
      int index = 0; 
      while(index < ukensrekke.length)
      {
        ukensrekke[index] = rnd.nextInt(20);
        index++; 
        
        
      }
      return ukensrekke; 
    }
    
    public int[] Setin()
    {
      Scanner scr = new Scanner(System.in);
      
      for (int i = 0; i < minrekke.length; i++) 
      {
        minrekke[i] = scr.nextInt();   
      
      }
      return minrekke; 
    }
    
    public int[] getMinrekke()
    {
     return minrekke; 
    }
    
    public int[] getUkensrekke()
    {
      return ukensrekke;   
    }
    
    public int compare(int[] ukensrekke, int[] minrekke)
    { 
        int riktig = 0; 
        for (int i = 0; i < 6; i++)
        {
           if (ukensrekke[i] == minrekke[i])
           {
               riktig++;  
           }
        }
        return riktig;
    }
    
    public void print(int[] ukensrekke)
    {
      for (int i = 0; i < ukensrekke.length; i++) 
      {
        System.out.println(ukensrekke[i] + " ");    
        
      }
    }
}
      