 

import java.util.Scanner;

/**
 * Write a description of class StringsOfCaracters here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringsOfCaracters
{
    public void mainMethod() {

        String banana = "banana";
        String cucumber = "cucumber";
        String together = banana + cucumber;

        System.out.println("The length of banana word is " + banana.length());
        System.out.println("The length of cucumber word is " + cucumber.length());
        System.out.println("The word " + together + " length is " + together.length());
    }

    public void mainMethod1() {

        String myname = "MudasarAhmadCheema";

        char characters = myname.charAt(5);
        System.out.println("The 6th character of the name is " + characters);
    }

    public void mainMethod2() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Write your name");
        String myname = scan.nextLine();
        System.out.println();
        System.out.println("Numbers of characters: " + myname.length());
        System.out.println("First letter in this name is: " + myname.charAt(0));
        System.out.println("Last letter in this name is: " + myname.charAt(myname.length()-1));
    }

    public void mainMethod3() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Type your word");
        String word = scan.nextLine();

        if(word.length() < 3) {
            System.out.println("Numbers of first word: " + word.length());
            System.out.println("First letter in this word is: " + word.charAt(0));
            System.out.println("Second letter in this word is: " + word.charAt(0 + 1));
            System.out.println("Third letter in this word is: " + word.charAt(0 + 2));
            System.out.println("Last letter in this word is: " + word.charAt(word.length() - 1));
        }
        else {
            System.out.println("Sorry!");
        }
    }
}