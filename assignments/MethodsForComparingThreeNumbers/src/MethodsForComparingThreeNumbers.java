/*
* name: Methods For Comparing Three Numbers
* created on: 5/28/2018
* author: Kitana Toft
* desc: Contains five methods that compare three numbers in different ways
 */
public class MethodsForComparingThreeNumbers {
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

    public static double average(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

    public static boolean allTheSame(double num1, double num2, double num3) {
        if (num1 == num2 && num2 == num3) {
            return true;
        }
        return false;
    }

    public static boolean allDifferent(double num1, double num2, double num3) {
        if (num1 != num2 && num2 != num3 && num1 != num3) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        double num1 = 3.5;
        double num2 = 6.7;
        double num3 = -8.5;

        System.out.println("smallest: "+ smallest(num1, num2, num3));
        System.out.println("largest: " + largest(num1, num2, num3));
        System.out.println("average: " + average(num1, num2, num3));
        System.out.println("allTheSame: " + allTheSame(num1, num2, num3));
        System.out.println("allDifferent: "+ allDifferent(num1, num2, num3));
    }
}

/*
Output:

smallest: -8.5
largest: 6.7
average: 0.5666666666666664
allTheSame: false
allDifferent: true

Process finished with exit code 0
 */
