/**
 * Write a description of class Client here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Client
{
    public void mainMethod() {
        
        GroceryItem item1 = new GroceryItem("BrunOst", 15.9);
        GroceryItem item2 = new GroceryItem("Lettmelk", 8.5);
        
        System.out.println(" Varens navn: " + item1.getName());
        System.out.println(" Varens pris: " + item1.getPricePerUnit());
        System.out.println(" Varens navn: " + item2.getName());
        System.out.println(" Varens pris: " + item2.getPricePerUnit());
        
        double sum = item1.getPricePerUnit() + item2.getPricePerUnit();
        
        System.out.println(" Varene " + item1.getName() + " og " + item2.getName() + " kostet til sammen " + sum);
    }
}
