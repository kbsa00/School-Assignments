import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
/**
 * Couple of assigments for myself that i'm currently working with on Mooc.fi
 * 
 * @author (Khalid) 
 * @version (a version number or a date)
 */
public class ArrayListMethods
{
    private ArrayList<String> brotherslist;
    private ArrayList<String> teachers; 
    private ArrayList<String> members;
    
    
    public void RemoveLast()
    {
        /**
         * This is a method for removing the last person in the ArrayList.
         */
        
        brotherslist = new ArrayList<String>(); 
        brotherslist.add("Khalid"); 
        brotherslist.add("Hasse");
        brotherslist.add("Mudasar");
        
        System.out.println("Here's the list of the brothers");
        for(String liste : brotherslist)
        {
            
            System.out.println(liste);
        }
        String answer;
        Scanner scr = new Scanner(System.in);
        answer = scr.nextLine().toLowerCase();
        if(answer.equals("remove"))
        {
            brotherslist.remove(brotherslist.size() - 1);
            System.out.println("List of the Brothers");
              for(String liste : brotherslist)
            {
                
                System.out.println(liste);
            }
        }
    }
  
    public void SortByAlphabetical()
    {
        /**
         * This is a method on how to sort ArrayList in alphabetical order
         */
        
        teachers = new ArrayList<String>();
        teachers.add("Per");
        teachers.add("Stein");
        teachers.add("Petter");
        teachers.add("Hasse");
        
        Collections.sort(teachers);
        for(String print : teachers)
        {
            System.out.println(teachers);
        }
    
    }
  
    public void WordLength()
    {
        /**
         * Ikke ferdig med denne delen her. Jobber med den fortsatt! 
         */
        
        members = new ArrayList<String>(); 
        members.add("Ronaldo");
        members.add("Messi");
        members.add("Aguero");
        members.add("Pogba"); 
       
        System.out.println("The length of the word is " + members.size(members.length()));
      
    }
    }   
