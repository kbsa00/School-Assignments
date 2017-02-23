/**
 * In this class we are putting in information about two groceries and their prices
 * and connecting them too the GroceryItem class. 
 * 
 * @author (Khalid B. Said) 
 * @version (0.1)
 */
 public class Client
{
    //The field for the GroceryItem (1)
    private GroceryItem Item1;
    //The field for the GroceryItem (2)
    private GroceryItem Item2; 
   
    
    
    /**
     * We are putting the price and the name of the GroceryItem in this code. 
     */
    
     public Client()
    {
      Item1 = new GroceryItem("Brunost", 15.9); 
      Item2 = new GroceryItem("Lettmelk", 8.5); 
      
      
      
      
      
    }
    
    /**
     * We are printing out the recipt of the both names and prices of the GrocceryItem
     * that we previously added and summs up both prices for you. 
     */
    
     public void clientMethod()
    {
        System.out.println("Varens navn er: " + Item1.getName()); 
        System.out.println("Varens " + "pris " + "er" + ": " + Item1.getpricePerUnit());
        System.out.println("Varens navn er: " + Item2.getName());
        System.out.println("Varens navn er " + Item2.getpricePerUnit()); 
        
        double sum = Item1.getpricePerUnit() + Item2.getpricePerUnit();
        System.out.println("Varene " + Item1.getName() + " og " + Item2.getName() + " kostet " + 
        "til " + " sammen " + sum);
    }
}

