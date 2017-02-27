import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a description of class arrayList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class arrayList
{
    private ArrayList<String> studentList;

    public void mainMethod() {
        studentList = new ArrayList<>();

        studentList.add("mudasar");
        studentList.add("khalid");
        studentList.add("robert");
        studentList.add("aras");
        studentList.add("iris");

        System.out.println("The numbers of students " + studentList.size());

        System.out.println("The first student in the list " + studentList.get(0));
        System.out.println("The last student in the list " + studentList.get(studentList.size() - 1));

        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to add or remove student?");
        String yesorno = scan.nextLine();

        if(yesorno.contains("yes")) {
            System.out.println("What do you want to do?");
            System.out.println("Type 'add' to add a student, or type 'remove' to remove a student");
            String addremove = scan.nextLine();
            if (addremove.contains("add")) {
                System.out.println("Type the name of student you want to add");
                String name = scan.nextLine();
                if(name.contains(name)) {
                    studentList.add(name);
                    System.out.println(name + " has been added to the list");
                    System.out.println("The size is now " + studentList.size());
                }
            }
            if (addremove.contains("remove")) {
                System.out.println("Type the name of student you want to remove");
                String newname = scan.nextLine(); {
                    if(newname.contains(newname)) {
                        studentList.remove(newname);
                        System.out.println(newname + " has been removed from the list");
                        System.out.println("The size is now " + studentList.size());
                    } 
                }
            }
        }
        else {
            System.out.println("Have a nice day");
        }

        int place = 0;
        while(place < studentList.size()) {
            System.out.println(studentList.get(place));
            place++;
        }
    }
}
