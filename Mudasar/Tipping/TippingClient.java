
/**
 * Write a description of class TippingClient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TippingClient
{
    public void mainMethod() {
    
        System.out.println("Klassen Tipping instansieres...");
        Tipping t1 = new Tipping();
        
        System.out.println("\nUkens rekke genereres...");
        t1.weekResult();
        
        System.out.println("\nBrukers rekke registreres...");
        char[] userResult = t1.register();
        
        System.out.println("\nUkens rekke hentes...");
        char[] result = t1.getWeekResult();
        
        System.out.println("\nUkens rekke:");
        t1.print(result);
        
        System.out.println("\nBrukers rekke:");
        t1.print(userResult);
        
        System.out.println("\nBruker hadde " + t1.check(result,userResult) + " riktige tippetegn");
    }
}
