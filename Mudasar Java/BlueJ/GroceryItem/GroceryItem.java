
/**
 * Write a description of class GroceryItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GroceryItem
{
    private String name;
    private double pricePerUnit;
    
    public GroceryItem() {
    }
    
    public GroceryItem(String newname, double newPricePerUnit) {
        name = newname;
        pricePerUnit = newPricePerUnit;
    }
    
    public void setName(String setNewName) {
        name = setNewName;
    }
    
    public void setPricePerUnit(double setNewPricePerUnit) {
        pricePerUnit = setNewPricePerUnit;
    }
    public String getName() {
        return name;
    }
    
    public double getPricePerUnit() {
        return pricePerUnit;
    }
}