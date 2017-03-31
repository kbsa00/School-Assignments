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
    
    public void fillArray()
    {
        ArrayList<String> name = new ArrayList<>(); 
        Scanner scr = new Scanner(System.in);
        int num; 
        System.out.println("Write how many people you want to add to the list"); 
        num = scr.nextInt(); 
        for (int i = 0; i < num; i++)
        {
            System.out.println("Write your name"); 
            name.add(scr.nextLine());
            
        
        }
        
        System.out.println("Heres the list"); 
        Collections.sort(name);
        for(String p : name)
        {
            System.out.println(p);
        }
        
        System.out.println("Your list size is " + name.size());
    
    
    }
    
    public void Combine()
    {
        //This method allows you too 
        
        ArrayList<Integer> list1 = new ArrayList<>(); 
        ArrayList<Integer> list2 = new ArrayList<>(); 

        list1.add(1); 
        list1.add(2); 
        list2.add(3); 
        list2.add(4); 

        //This code allows you to put an ArrayList and combine it too one ArrayList. 
        list1.addAll(list2);
        
        for(int p : list1)
        {
            System.out.println(p);
        }
    }
    
    public void ClearArrayList()
    {
        ArrayList<String> list = new ArrayList<>();
        
        
        
        list.add("Khalid"); 
        list.add("Mudasar"); 
        list.add("Robert"); 
        list.add("Petter"); 
        for(String p : list)
        {
            System.out.println(p);
        }
        
        
        System.out.println("The size of the list is " + list.size());

        list.clear(); 
        System.out.println("After deleting the list " + list.size());
    
    
    
    }
}