import java.util.Scanner;

/**
 * Write a description of class UsernamePassword here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UsernamePassword
{
    public void mainMethod() {
        Scanner scan = new Scanner(System.in);

        String userName = "mudasar";
        String passWord = "mudasar123";

        System.out.println("Welcome to BlueJ !");
        System.out.println();
        System.out.println("Type your username: ");
        String username = scan.nextLine();
        System.out.println();
        System.out.println("Type your password: ");
        String password = scan.nextLine();
        System.out.println();

        if(username.equals(userName) && password.equals(passWord)) {
            System.out.println("You are now logged in");
        }
        else {
            System.out.println("FUCK OFF HACKER!");
        }
    }
}