import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.Random; 
/**
 * Couple of assigments for myself that i'm currently working with on Mooc.fi
 * 
 * @author (Khalid) 
 * @version (a version number or a date)
 */
public class ArrayListMethods
{ 
    public void Remove()
    {
        /**
         * This is a method for removing the last person in the ArrayList.
         */
        ArrayList<String> brotherslist = new ArrayList<>(); 
        brotherslist = new ArrayList<String>(); 
        brotherslist.add("Khalid"); 
        brotherslist.add("Hal");
        brotherslist.add("Mudasar");
        brotherslist.add("Julius"); 
        brotherslist.add("Cesar"); 
        brotherslist.add("Barry"); 
        brotherslist.add("Bruce");
        
        System.out.println("Here's the list of the brothers");
        for(String liste : brotherslist)
        {
            System.out.println(liste);
        }
        String answer;
        int amount; 
        Scanner scr = new Scanner(System.in);
      
        
        System.out.println("\nHow many people do you want to delete from the family list");
        amount = scr.nextInt();
        
      
       for(int y = 0; y <= amount; y++){
       System.out.println("Whats the name of the person you want to delete");
       answer = scr.nextLine();  
        for(int i = 0; i < brotherslist.size(); i++){
        
        if(brotherslist.get(i).equals(answer))
        {
            brotherslist.remove(i);
            System.out.println("The brother has in index " +  i + " has been deleted.\n");
            System.out.println("List of the Brothers ");
              for(String liste : brotherslist)
            {
                
                System.out.println(liste + "\n");
            }
        }
       }
       
       }
    }
    public void SortByAlphabetical()
    {
        /**
         * This is a method on how to sort ArrayList in alphabetical order
         */
        ArrayList<String> teachers = new ArrayList<>(); 
        teachers = new ArrayList<String>();
        teachers.add("Per");
        teachers.add("Stein");
        teachers.add("Petter");
        teachers.add("Hasse");
        teachers.add("Øystein");
        teachers.add("Åse"); 
        teachers.add("Barkved");
        teachers.add("Anders"); 
        teachers.add("Andreas");
        
        Collections.sort(teachers);
        for (int i = 0; i < teachers.size(); i++)
        {
            System.out.println(teachers.get(i));
        }
    }
    
    public void SortNumbers()
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        numbers.add(55);
        numbers.add(21);
        numbers.add(34); 
        numbers.add(92); 
        numbers.add(100); 
        numbers.add(12); 
        
        //This is the code that allows us to sort the whole Arraylist. 
        Collections.sort(numbers);
        
        //Printing out the ArrayList.
        for(Integer p : numbers)
        {
            System.out.println(p);
        }
    }   
}