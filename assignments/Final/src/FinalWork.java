/**
 Assume that you are given a price in a String variable,
 and you need to take a discount off of that price in order to calculate the total.
 Recall that you cannot perform numeric calculations on String values.
 You will need to convert the String value into a double value in order to perform arithmetic on it.
 Luckily, there is a method in the Java API that converts a String value into a double value.
 This method is called Double.parseDouble(), and it is defined inside class Double.
 You do not have to import anything to call this method since class Double is inside the java.lang package.

 In the following program, add the code that calls the method Double.parseDouble()
 to convert the String priceInString into the double priceInDouble.
 */

public class FinalWork {
    public static void main(String[] args) {
        final double DISCOUNT = .15;
        String priceInString;
        priceInString = "9.99";
        double priceInDouble;

        // this is where your code will go
        priceInDouble = Double.parseDouble(priceInString);

        double total;
        total = priceInDouble - (priceInDouble * DISCOUNT);
        System.out.println("The total including discount is: " + total);
    }
}

