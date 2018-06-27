/**
 Write the definition for a method called "digitName()"
 that returns a String containing the name of the digit sent in as parameter.
 You can assume that your method will always receive an integer that is between 0 and 9, inclusive.
 ("Inclusive" means including 0 and 9.) This method performs no user input and prints no output.

 */

import java.util.Scanner;

public class FinalWork {
    public static String digitName(int digit) {
        switch(digit) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
        }
        return "not in range";
    }

    /**
     Write a program that calls the digitName()
     method that you defined in the previous question.
     Your program will ask the user to type a single digit,
     read the user's response into an int variable, and then print the name of the user's digit.
     You can assume that the user will follow instructions.
     */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int digit;
        digit = s.nextInt();

        // prompts user for single digit
        System.out.println("Enter a single digit: ");
        System.out.println(digitName(digit));
    }
}

