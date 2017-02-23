import java.util.Scanner;

/**
 * Write a description of class Loops here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Loops
{
    public void mainMethod() {
        //This method use for loop for numbers from 100 - 0
        for(int i = 100; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public void mainMethod1() {
        //This method use for loop for numbers from 0 - 100
        for(int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public void mainMethod3() {
        //This method use while loop for numbers from 100 - 0
        int index = 100;
        while(index >= 0) {
            System.out.println(index);
            index--;
        }
    }

    public void mainMethod4() {
        //This method use while loop for numbers from 0-100
        int index = 0;
        while(index <= 100) {
            System.out.println(index);
            index++;
        }
    }

    public void mainMethod5() {

        Scanner input = new Scanner(System.in);
        System.out.println("Type the first number you want to start this loop");
        int index = input.nextInt();

        System.out.println("Type the last number you end this");
        int num = input.nextInt();

        while(index <= num) {
            System.out.println(index);
            index++;
        }
    }

    public void mainMethod6() {

        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("I can program!");

            System.out.println("Continue? ('no' to quit)? ");
            String command = scan.nextLine();
            if(command.equals("no")) {
                break;
            }
        }
        System.out.println("Thank you, have a nice day!");
    }
}