import java.util.Random;
/**
 * Dette er lotto kupong uten duplikater
 */
public class Lotto
{
    private int [] lotto;
    public void mainMethod() {

        Random rnd = new Random();
        lotto = new int[7];

        int index = 0;
        while(index < lotto.length) {
            int tilfeldig = rnd.nextInt(34) + 1;
            if(!sameValue(lotto, tilfeldig)) {
                lotto[index] = tilfeldig;
				index++; 
            }
        }
		printMaxMinValue();
    }
		public void printMaxMinValue() {
		int min = lotto[0];
        int max = lotto[0];
        for(int i = 0; i < lotto.length; i++) {
            if(lotto[i] > max) {
                max = lotto[i];
            }
            else if (lotto[i] < min) {
                min = lotto[i];
            }
        }
        System.out.println("Your highest value in Lotto-ticket is: " + max);
        System.out.println("Your lowest value in Lotto-ticket is: " + min);
    }
    public boolean sameValue(int[] lotto, int tilfeldig) {
        for(int i = 0; i < lotto.length; i++) {
            if(lotto[i] == tilfeldig)
                return true;
        }
        return false;
    }
}
