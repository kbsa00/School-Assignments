import java.util.ArrayList;

/**
 * Write a description of class Client here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Client
{
    private ArrayList<Bok> boks;

    public void mainMethod() {

        boks = new ArrayList<Bok>();

        boks.add(new TryktBok(12345, "Joseph Heller", "Cath 22", "Penguin", 10, 5, 230));
        boks.add(new TryktBok(23456, "Heidi Linde", "Norsk sokkel", "Gyldendal", 8, 10, 295));
        boks.add(new LydBok(34567, "Linn Ullmann", "De utrolige", "Oktober", 8, 410, 5, "Lisa Kolben"));
        boks.add(new LydBok(45678, "Jan-Philipp Sandker", "Mørke skygger", "Cappelen Damm", 4, 352, 8, "Kim Haugen"));

        System.out.println("Alle forfattere:\n");
        for (Bok b: boks){
            System.out.println(b.getForfatter());
        }
        System.out.println();

        System.out.println();

        System.out.println("Alle bøker:\n");
        for (Bok c: boks){
            System.out.println(c);
            System.out.println();
        }
    }
}
