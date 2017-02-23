/**
 * The GroceryItem class represents a class where you can put in the name of the grocery 
 * and the price for it. 
 * 
 * @author Khalid B.Said
 * @version (0.1)
 */
public class GroceryItem
{
  // This field represents the name of the GroceryItem. 
  private String Name;
  //This field represents the price of the GroceryItem.
  private double pricePerUnit;
  private int quantity;
 
    /**
     * Constructor for objects of the class GrocceryItem
     */
    
    public GroceryItem()
   {
      Name = "Ukjent";
      pricePerUnit = 0;
      quantity = 0; 
  } 
 
  /**
  *  Constructor for the objects of the class and their new names. 
  *  You will be able to set the name and the Price at the same time.
  */
 
    public GroceryItem(String NewItemName, double NewItemPrice, int quantity)
  {
   pricePerUnit = NewItemPrice; 
   Name = NewItemName; 
   this.quantity = quantity; 
  }
  
   /**
    * In here you will be able to add the Name of the GroceryItem. 
    */
   
   public void setName(String NewItemName)
    {
     Name = NewItemName; 
  } 
   
  /**
   * In here you will be able to set the price of the product that you've previously put under 
   * setName
   */ 
    
    public void setPriceperUnit(double NewItemPrice)
  {
    pricePerUnit = NewItemPrice; 
  }
 
  /**
  *  This code will return the name of the GroceryItem.
  */ 
 
    public String getName()
  {
   return Name;
  }
 
  /**
  * This code will return the price of the GroceryItem. 
  */
 
    public double getpricePerUnit()
  {
   return pricePerUnit; 
  }
  
   /**
    * You will be able to set the amount of the quantity here.  
    */
    public void setQuantity(int quantity)
  {
      this.quantity = quantity; 
    }
    
  /**
    * You will be able to get returned how many quantity there is. 
    */
    public int getquantity()
    {
        return quantity; 
    }
    
  /**
    * Printing out your recipt of the purchase that you've made from the Grocery Store.
    */
     
     public void getCost()
      {
        System.out.println("#######################");
        System.out.println("Grocery Store Kiwi");
        System.out.println("Grocery Recipt"); 
        System.out.println("Your Grocery; "+ Name); 
        System.out.println( Name + " Cost; " + pricePerUnit + " Kroner");
        System.out.println("Items; " + quantity);
        System.out.println("######################");
     
      }
      
  public String getData()
  {
    return getquantity() + " " + 
    getName() + " "+ 
    getpricePerUnit(); 
   }
}