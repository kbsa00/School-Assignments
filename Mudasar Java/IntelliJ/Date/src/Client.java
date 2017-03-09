import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Mudasar on 09.03.2017.
 */
public class Client {

    public static void main(String[] args) {
        Date d1 = new Date(17, 1, 2012);
        Date d2 = new Date(18, 1, 2012);
        Date d3 = new Date(19, 1, 2012);
        Date d4 = new Date(31, 12, 2011);
        Date d5 = new Date(1, 1, 2012);
        Date d6 = new Date(2, 1, 2012);
        Date d7 = new Date(30, 4, 2011);
        Date d8 = new Date(1, 5, 2011);
        Date d9 = new Date(2, 5, 2011);
        Date d10 = new Date(28, 2, 2011);
        Date d11 = new Date(1, 1, 2011);
        Date d12 = new Date(2, 3, 2011);

        Date d13 = new Date(17, 1, 2012);

        System.out.println(d1 + "\n"+ d2 + "\n" +  d3 + "\n"+ "\n" + d4 + "\n"+ d5 + "\n" + d6 + "\n" + "\n" + d7 + "\n" +
                d8 + "\n" + d9 + "\n" + "\n" +  d10 + "\n" + d11 + "\n" +  d12 + "\n");

 /*
            Sjekker opp D1 og D22 objektene opp mot hverandre og ser om disse er like ved hjelp av en metode
            jeg har laget.
         */

        System.out.println("Resultatet på equals metoden. (For Date)");
        System.out.println("Sjekker opp d1 mot d13 , to like objekter? :  " + d1.equals(d13));
        System.out.println("Sjekke opp d1 mot d2, to like objekter? :  " + d1.equals(d2) + "\n");

        System.out.println();

        System.out.println("** Your Appointment ** " + "\n");
        Appointment a1 = new Appointment(d1,  " 03:45PM ", " Docter Appointment");
        Appointment a2 = new Appointment(d2, " 05.00PM ", " Project Meeting");
        Appointment a3 = new Appointment(d3, " 07.00PM ", " Jogging ");
        Appointment a4 = new Appointment(d1, " 03.45PM ", " Doctor Appointment");
        System.out.println();
        System.out.println("Resultatet på equals metoden. (For Appointment)");

        /*
               Fortsett på denne metoden
        */
        System.out.println("Sjekker opp a1 mot a4, to like objekter?: " + a1.equals(a1));
        System.out.println("Sjekker opp a1 mot a2, to like objekter?: " + a1.equals(a2));
    }




}
