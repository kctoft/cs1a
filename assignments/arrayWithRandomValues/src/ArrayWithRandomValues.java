/*
* name: "Array with Random Values"
* created: 5/19/2018
* author: Kitana Toft
* desc: Prints a number of randomly generated numbers based on user input
 */

import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class ArrayWithRandomValues {
    public static void main(String [] args) {
        // declare vars & initialize defaults
        int arrayLength = 0;
        Scanner s = new Scanner(System.in);
        Random randGen = new Random();

        // get user input & store it into arrayLength
        System.out.println("Please enter a number: ");
        arrayLength = s.nextInt();

        // Allocate an array containing arrayLength integers
        int[] randomArray = new int[arrayLength];

        // and fill the array with random integers between 1 and 10.
        for (int i = 0; i < arrayLength; i++) {
            randomArray[i] = Math.abs(randGen.nextInt()) % 10 + 1;
        }

        // Finally print the array.
        for (int i = 0; i < arrayLength; i++) {
            System.out.println(randomArray[i]);
        }
    }
}

/*
Please enter a number:
12
3
3
5
5
4
5
4
2
3
8
2
10

Process finished with exit code 0
 */