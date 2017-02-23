import java.util.Random;
import java.util.Scanner;

/**
 * Write a description of class Tipping here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tipping
{
    private char [] ukensRekke;

    public Tipping() {
        ukensRekke = new char[12];
    }

    public void weekResult() {
        Random rnd = new Random();
        int i = 0;
        while(i < ukensRekke.length) {
            int tilfeldig = rnd.nextInt(2);
            if(tilfeldig == 0) {
                ukensRekke[i] = 'H';
            }
            if(tilfeldig == 1) {
                ukensRekke[i] = 'U';
            }
            if(tilfeldig == 2) {
                ukensRekke[i] = 'B';
            }
            i++;
        }
    }

    public char [] getWeekResult() {
        return ukensRekke;
    }

    public void print(char[] ukensRekke) {
        for(char list : ukensRekke) {
            System.out.printf("%2s", list);
        }
    }

    public char[] register() {
        Scanner input = new Scanner(System.in);
        char [] minRekke = new char[12];

        for(int i = 0; i < minRekke.length; i++) {
            System.out.print("Skriv inn tippetegn " + (i+1) + ": ");
            minRekke[i] = input.nextLine().toUpperCase().charAt(0);
        }
        return minRekke;
    }

    public int check(char[] ukensRekke, char[] minRekke) {
        int rette = 0;
        
        for(int i = 0; i < ukensRekke.length; i++) {
            if(ukensRekke[i] == minRekke[i]) 
                rette++;
        }
        return rette;
    }
}
