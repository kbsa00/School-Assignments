import java.util.ArrayList;
public class Client
{
    private ArrayList<Book> list;

    public static void main(String[] args) {



       ArrayList<Book> list = new ArrayList<Book>();
        list.add(new Published(12345, "Joseph Heller", "Cath22", "Penguin", 10, 5, 230));
        list.add(new Published(23456, "Heide Linde", "Norsk sokkel", "Gyldendaal", 8, 10, 295));
        list.add(new AudioBook(34567, "Linn Ullmann", "De urolige", "Oktober", 8, 10, 410, 5, "Lisa Kolben"));
        list.add(new AudioBook(45678, "Jan-Philipp Sendker", "Mørke skygger","Cappelen Damm", 4, 1, 352, 8, "Kim Haugen"));

        System.out.println("Alle forfattere: ");
        System.out.println();
        for(Book print : list)
        {
            System.out.println(print.getForfatter());
        }
        System.out.println("\n");
        System.out.println("Alle Bøker:");
        System.out.println("\n");

        for(Book p : list)
        {
            System.out.println(p);
            System.out.println();
        }
    }
}

