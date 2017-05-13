import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Created by khalidsaid on 13.05.17.
 */
public class College {
    private Scanner scr;
    private ArrayList<Student> student = new ArrayList<>();
    private ArrayList<Employee> employee = new ArrayList<>();
    private ArrayList<Person> persons = new ArrayList<>();



    public void run()
    {
       Student s1 = null;
       Employee e1 = null;

        try {
            scr = new Scanner(new File("tekst copy.txt"));

            while (scr.hasNextLine())
            {
               String a = scr.nextLine();
               String [] info = a.split(",");

               int num = Integer.parseInt(info[5]);

               if(info[0].equals("S"))
                {
                    s1 = new Student(info[0], info[1], info[3], info[4], num);
                    student.add(s1);
                    persons.add(s1);
                }
                else if (info[0].equals("E")){
                   e1 = new Employee(info[0], info[2], info[3], info[4], num);
                   employee.add(e1);
                   persons.add(e1);
               }

            }
        }
        catch (IOException ex)
        {
            System.out.println("Couldn't read the txt file. Error Message: " + ex.getMessage());
        }
        finally {
            scr.close();
        }

        System.out.println("\nLISTE OVER ALLE STUDENTER");
        for (Student s: student) {
            System.out.println(s);
        }


        System.out.println("\nLISTE OVER ALLE ANSATTE");
        for (Employee a : employee) {
            System.out.println(a);
        }


        System.out.println("\nLISTE OVER ALLE PERSONER");
        for (Person p : persons) {
            System.out.println(p);
        }





    }

    public static void main(String[] args) {
        College c = new College();
        c.run();
    }
}
