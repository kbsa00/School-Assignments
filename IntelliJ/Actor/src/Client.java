import java.util.*;
public class Client {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();

        list.add(new Actor("Jane Johnson", "24020K", 32, "10 years"));
        list.add(new Actor("Johnny Bravo", "2021G", 21, "5 years"));
        list.add(new Musician("Nancy Daniels", "20202P", 15, "5 years"));
        list.add(new Musician("Oliver Queen", "21232U", 40, "20 years"));

        System.out.println("As a talent agency here's one of our top talents:");

        for (Person p : list)
        {
            System.out.println(p);
        }

        Actor a1 = new Actor();

        System.out.println("\nOur actors can:");
        a1.Dance("Dance");
        a1.readlines("Read lines");
        a1.Sing("Sing to some degree");

        Musician m1 = new Musician();
        System.out.println("\nOur musicians can");
        m1.Sing("Sing");
        m1.Dance("Dance");


    }

}
