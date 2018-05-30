/**
* name: Methods For Comparing Three Numbers
* created on: 5/28/2018
* author: Kitana Toft
* desc: Contains five methods that compare three numbers in different ways
 */
public class MethodsForComparingThreeNumbers {

    /**
     * smallest() will take three doubles and compares values; returns the SMALLEST value
     */
    public static double smallest(double num1, double num2, double num3) {
        // declare vars & defaults
        double smallestVal = num1;

        if (smallestVal > num2) {
            smallestVal = num2;
        }

        if (smallestVal > num3) {
            smallestVal = num3;
        }

        return smallestVal;
    }

    /**
     * largest() will take three doubles and compares values; returns LARGEST value
     */
    public static double largest(double num1, double num2, double num3) {
        // declare vars & defaults
        double largestVal = num1;

        if (largestVal < num2) {
            largestVal = num2;
        }

        if (largestVal < num3) {
            largestVal = num3;
        }

        return largestVal;
    }

    /**
     * average() will take three doubles and returns the AVERAGE or mean value
     */
    public static double average(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

    /**
     * allTheSame() takes three doubles, compares the values to see if values are all the same
     * true if so, false otherwise
      */
    public static boolean allTheSame(double num1, double num2, double num3) {
        if (num1 == num2 && num2 == num3) {
            return true;
        }
        return false;
    }

    /**
     * allDifferent() takes three doubles, compares the values to see if the values are all different
     * true if so, false otherwise
     */
    public static boolean allDifferent(double num1, double num2, double num3) {
        if (num1 != num2 && num2 != num3 && num1 != num3) {
            return true;
        }
        return false;
    }

    /**
     * Testing methods: smallest(), largest(), average(), allTheSame(), and allDifferent()
     */
    public static void main(String[] args) {
        System.out.println("smallest: "+ smallest(3.5, 6.7, -8.5));
        System.out.println("largest: " + largest(3.5, 6.7, -8.5));
        System.out.println("average: " + average(3.5, 6.7, -8.5));
        System.out.println("allTheSame: " + allTheSame(3.5, 6.7, -8.5));
        System.out.println("allDifferent: "+ allDifferent(3.5, 6.7, -8.5));
    }
}

/**
 * Output:
 * smallest: -8.5
 * largest: 6.7
 * average: 0.5666666666666664
 * allTheSame: false
 * allDifferent: true
 *
 * Process finished with exit code 0
 */
