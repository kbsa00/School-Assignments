import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections; 
import java.util.ArrayList; 
/**
 * Write a description of class ArrayMethods here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayMethods
{
   public void BigAndSmallestArray()
    {   
        
        Scanner scrr = new Scanner(System.in); 
        int [] numbers = new int[7];
        
        //Her fyller jeg ut Arrayen med tall helt til størrelsen på arrayen..
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = scrr.nextInt();
        
        }
        
        System.out.println("Printing out numbers");
        //printer ut tallene
        for(int p : numbers)
        {
            System.out.println(p);
        }
        
        //Oppgir hva max er og minimum er.
        int max = numbers[0]; 
        int min = numbers[0]; 
        //kjører en for loop hvor jeg finner ut hva det største tallet og det minste
        //tallet på arrayen er. 
        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] < max)
            {
              max = numbers[i]; 
            }
            if(numbers[i] > min)
            {
                min = numbers[i];
            }
        
        }
        
        System.out.println("Høyeste tallet i Arrayen er: " + max);
        System.out.println("Laveste tallet i Arrayen er: " + min);
    }
    
    
    public void SwapNumbers()
    {
        int[] tall = {1,2,3,4,5}; 
        System.out.println("Before switching the elements"); 
        for(int p  : tall)
        {
            System.out.println(p);
        }
        
        
        //We change places of the elements 1 and 5, then 2 and 4 etc.. 
        int left = 0;
        int right = tall.length - 1; 
        System.out.println("\n"); 
        while(left < right)
        {
            int temp = tall[left];
            tall[left] = tall[right]; 
            tall[right] = temp; 
            
            left++; 
            right--; 
            
        
        
        
        
        }
        
        System.out.println("After switching the elements"); 
        for(int p : tall)
        {
            System.out.println(p);
        
        }
    }
    
    public int[] fibonacci()
    {
        int [] num = new int [7]; 
        
        System.out.println("\n");
        num[0] = 0; 
        num[1] = 1; 
        
        int index = 2; 
        while(index < num.length)
        {
            num[index] = num[index - 1] + num[index + 2]; 
            
            index++;
        
        }
        
        return num;
    }
    
    public void SortArray() {

        // initializing unsorted int array
        int nr[] = {2, 1, 9, 6, 4};
         // let us print all the elements available in list
        for (int number : nr) {
        System.out.println("Number = " + number);
       }

       // sorting array
       Arrays.sort(nr);

       // let us print all the elements available in list
       System.out.println("The sorted int array is:");
       for (int number : nr) {
        System.out.println("Number = " + number);
       }
       
   }
   
   
   public void FindInArray()
   {
       //We are checking if the Array (Letters) contains a specific letter. And we are using Boolean to help us with that.  
       
       String[] letters = {"a", "f", "s", "o", "s", "t"}; 
       
       boolean find = Arrays.asList(letters).contains("s");
       System.out.println(find);
       
       //Terminal will return true in this case. 
       
    
    
   }
   
    public void reverse()
   {
    //Currently working on a way for me to reverse the elements.. 
    int[] arraya = { 1, 2, 3, 4, 5 };
    Collections.reverse(Arrays.asList(arraya));
     
    System.out.println(Arrays.toString(arraya));
   }
   
   
   public void DeleteArray()
   {
     
     String[] name = {"Mudasar", "Petter", "Ola", "Hasse"}; 
     name[0] = name[name.length - 1]; 
     //Print efore delete: Hasse, Petter, Ola, Hasse. 
     
     //We have to create another array and make it's size to name -1. 
     String[] newName = new String[name.length - 1]; 
     for(int i = 0; i < newName.length; i++)
     {
         //We implement the values of the name in newName array. 
         newName[i] = name[i];  
     }
     
     //After that we print out the new Array also known as newName. 
     System.out.println(Arrays.toString(newName));
     //Print: Hasse Petter Ola. 
     
     
     

   }
   
   public void fillingArray()
   {
       //Just a simple way of filling the Array from 1 - 10 using a for loop.
       int[] array = new int[10];
       
       for(int i = 0; i < array.length; i++) 
       {
           array[i] = + i + 1;  
        
       }
    
       System.out.println(Arrays.toString(array));
       //print: [1,2,3,4,5,6,7,8,9,10]. 
    
    
    
   }
   
   public int similarity (int tall, int array[])
   {
       //Creating a method where, I can find how many ones there are in the array and then return the amount. 
       int antall = 0; 
       
       for(int i = 0; i < array.length; i++)
       {
           if (tall == array[i])
           {
               antall++;
           }
       }
    
       return antall;
    
   }
   
   public void ArrayToArrayList() 
   {
    //This is a method for how to make an Array to a ArrayList. 
       
    String[] array ={"Hei", "Hola", "Konichiwa"}; 
    ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
    
    for(String p : list)
    {
        System.out.println(p); 
    }
    
   }
}
    
 
     
     
