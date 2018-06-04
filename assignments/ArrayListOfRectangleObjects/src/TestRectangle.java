/**
 * name: Test Rectangle -- Array List of Rectangle Objects
 * created on: 6/4/2018
 * author: Kitana Toft
 * desc: A program that gets user input for four rectangles and prints the values for each.
 */

import java.util.Scanner;

public class TestRectangle {
    public static void main (String[] args) {
        // declare variables & initialize
        Scanner s = new Scanner(System.in);
        int length = 0;
        int width = 0;
        final int rectangleSize = 4;
        Rectangle[] rectangles = new Rectangle[rectangleSize];

        for (int i = 0; i < rectangleSize; i++) {
            // prompt for user input
            System.out.println("Please enter the length of your rectangle: ");
            length = s.nextInt();
            System.out.println("Enter the width of your rectangle: ");
            width = s.nextInt();

            // declare rectangle
            Rectangle r = new Rectangle();

            // set width and length
            r.setWidth(width);
            r.setLength(length);

            // add rectangle to array list
            rectangles[i] = r;
        }

        for (int i = 0; i < rectangles.length; i++) {
            System.out.println(rectangles[i]);
        }
    }
}

/**
 * Output:
 *
 * Please enter the length of your rectangle:
 * 3
 * Enter the width of your rectangle:
 * 2
 * Please enter the length of your rectangle:
 * 5
 * Enter the width of your rectangle:
 * 6
 * Please enter the length of your rectangle:
 * 1
 * Enter the width of your rectangle:
 * 3
 * Please enter the length of your rectangle:
 * 9
 * Enter the width of your rectangle:
 * 2
 * For this Rectangle: length = 3, and width = 2
 * For this Rectangle: length = 5, and width = 6
 * For this Rectangle: length = 1, and width = 3
 * For this Rectangle: length = 9, and width = 2
 *
 * Process finished with exit code 0
 */
