/**
 * Fibonacci oppgave med for loop og while loop
 */
public class Fibonacci
{
    public int[] fib(int size) {
        int [] retur = new int[size];
        retur[0] = 0;
        retur[1] = 1;
        for(int i = 2; i < size; i++) {
            retur[i] = retur[i - 2] + retur[i - 1];
        }
        return retur;
    }

    public void printValues(int size) {
        int [] fibonacci = fib(size);
        for(int list : fibonacci) {
            System.out.println(list);
        }
    }
}
