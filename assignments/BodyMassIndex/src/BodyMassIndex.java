/*
* name: "Body Mass Index"
* created: 5/19/2018
* author: Kitana Toft
* desc: Program calculates BMI using variable weight & height
* The formula for BMI: (weight) / (height / 100) * (height / 100)
* input: height = 162, weight = 67
* soln: 25.5
 */

import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.RoundingMode;

public class BodyMassIndex {
    public static void main(String[] args) {
        // declare vars & initialize defaults
        Scanner s = new Scanner(System.in); // initialize scanner
        int height; // in cm
        int weight; // in kg

        // Introduce program
        System.out.println("Welcome to the BMI Calculator!");
        System.out.print("Please enter your height in centimeters: ");
        height = s.nextInt();
        System.out.println(height);

        System.out.print("Please enter your weight in kilograms: ");
        weight = s.nextInt();
        System.out.println(weight);

        // Formula for bmi calculations
        double bmi = weight / Math.pow(height / 100.0, 2); // Math.pow(value, raised to __)

        DecimalFormat df = new DecimalFormat("#.#");
        df.setRoundingMode(RoundingMode.DOWN);

        System.out.println("Your calculated BMI is " + df.format(bmi));
    }
}

/*
* Output:
* /Library/Java/JavaVirtualMachines/jdk-9.0.4.jdk/Contents/Home/bin/java "-javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=54003:/Applications/IntelliJ IDEA CE.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath /Users/kit/IdeaProjects/cs1a/out/production/BodyMassIndex BodyMassIndex
Welcome to the BMI Calculator!
Please enter your height in centimeters: 162
162
Please enter your weight in kilograms: 67
67
Your calculated BMI is 25.5

Process finished with exit code 0

 */
