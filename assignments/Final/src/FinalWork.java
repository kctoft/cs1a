/**
 * Write a for loop that sums up all the numbers in an array and prints the total.
 * I have started the program by allocating the array and filling it with random numbers,
 * so you only have to write the code that sums up all the numbers in the array and prints the total.
 */
import java.util.Random;


public class FinalWork {
    public static void main(String[] args) {
        Random random;
        random = new Random();
        double[ ] arrayOfDouble;
        final int NUMBER_OF_ELEMENTS = 7;
        arrayOfDouble = new double[NUMBER_OF_ELEMENTS];
        for (int i=0; i < arrayOfDouble.length; i++ ) {
            arrayOfDouble [i] = random.nextInt();
            System.out.println(arrayOfDouble[i]);
        }
        // declare value for 'sum'
        double sum = 0;

        // for loop that takes random numbers and gets total sum
        for (int i = 0; i < arrayOfDouble.length; i++ ) {
            sum = arrayOfDouble[i] + sum;
        }
        System.out.println("The total sum is: " + sum);
    }
}

/**
 Output:

 -3.5174291E8
 7.28986582E8
 1.700441233E9
 8.58731078E8
 9.38778812E8
 2.05500053E8
 1.771880464E9
 The total sum is: 5.852575312E9

 Process finished with exit code 0

 */