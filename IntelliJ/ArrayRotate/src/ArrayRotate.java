import java.util.*;

/**
 * Created by khalidsaid on 15.06.17.
 * A simple and fun way of moving the Array indexes to the leftside every single time
 * So that the all of the numbers will at least go through every index.
 */
public class ArrayRotate {
    public void ArrayRotate() {
        int[] array = new int[10];
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(20);
        }

        System.out.println("\nOrginal tall");
        System.out.println(Arrays.toString(array));
        int temp = 0;
        int[] array2 = new int[10];

        for (int i = 0; i < array.length; i++) {
            temp = array[0];
            for (int k = 1; k < array.length; k++) {

                array[k - 1] = array[k];

            }

            array[9] = temp;


            for (int j = 0; j < array2.length; j++) {
                array2[j] = array[j];
            }
            System.out.println("\nRunde: " + (i + 1) + " " + Arrays.toString(array2));
        }
    }

    public static void main(String[] args) {
        ArrayRotate a = new ArrayRotate();
        a.ArrayRotate();
    }
}
