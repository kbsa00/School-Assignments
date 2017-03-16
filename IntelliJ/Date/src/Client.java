/**
 * Created by khalid_bs on 3/8/17.
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
        /*
            Oppretter en annen objekt som har samme verdi som D1.
         */
        Date d22 = new Date(17, 1, 2012);


        System.out.println(d1 + "\n"+ d2 + "\n" +  d3 + "\n" + d4 + "\n"+ d5 + "\n" + d6 + "\n" + d7 + "\n" +
                d8 + "\n" + d9 + "\n" +  d10 + "\n" + d11 + "\n" +  d12);


        /*
            Sjekker opp D1 og D22 objektene opp mot hverandre og ser om disse er like ved hjelp av en metode
            jeg har laget.
         */

        System.out.println("Resultatet på equals metoden. (For Date)");

        System.out.println("To like objekter:  " + d1.check(d22));
        System.out.println("To ikke like objekter:  " + d1.check(d2) + "\n");

        System.out.println("** Your Appointment ** " + "\n");
        Appointment a1 = new Appointment(d1,  "03:45 PM", "Docters Appointment");
        System.out.println(a1);



    }
}

