/**
 * Write a description of class Forekomst here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Forekomst
{
    public int forekomst(int [] array , int num) {

        int antall = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i] == num)
            antall++;
        }
        return antall;
    }
}
