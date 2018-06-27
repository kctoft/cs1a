/**
 Write the definition for a method called "digitName()"
 that returns a String containing the name of the digit sent in as parameter.
 You can assume that your method will always receive an integer that is between 0 and 9, inclusive.
 ("Inclusive" means including 0 and 9.) This method performs no user input and prints no output.

 */

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

    public static void main(String[] args) {
        System.out.println(digitName(8));
    }
}

