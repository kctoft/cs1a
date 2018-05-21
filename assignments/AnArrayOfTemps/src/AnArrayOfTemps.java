/*
* name: "An Array of Temperatures"
* created: 5/19/2018
* author: Kitana Toft
* desc: This program creates an array of 7 daily high temperature - in Fahrenheit - that occurred in
* SF during the 1st week of April.
* In this program,I will convert the listed degrees from Fahrenheit's to Celsius & print
* 1 April : 67.3
* 2 April : 63.2
* 3 April : 65.0
* 4 April : 63.1
* 5 April : 63.9
* 6 April : 64.6
* 7 April : 64.5
* Conversion : Celsius = (Fahrenheit - 32) * (5 / 9)
*/

import java.text.DecimalFormat;

public class AnArrayOfTemps {
    public static void main(String[] args) {
        // declare the # of elements stored in the array
        final int NUM_VALS = 7;
        // declare variables
        double celsius;
        double average = 0;
        DecimalFormat df = new DecimalFormat("#.0");

        // create an array of Fahrenheit temperatures
        double[] temperatures = new double[7];
        temperatures[0] = 67.3;
        temperatures[1] = 63.2;
        temperatures[2] = 65.0;
        temperatures[3] = 63.1;
        temperatures[4] = 63.9;
        temperatures[5] = 64.6;
        temperatures[6] = 64.5;

        // convert that value to Celsius & print using 1 decimal
        for (int i = 0; i < temperatures.length; i++) { // declare int in loop, .length ~ to end of array
            celsius = (temperatures[i] - 32) * (5 / 9.0); // needs decimal to force double
            temperatures[i] = celsius;
            average = average + temperatures[i];
        }
        average = average / temperatures.length;
        System.out.println(df.format(average));
    }
}
/*
* Output:
* /Library/Java/JavaVirtualMachines/jdk-9.0.4.jdk/Contents/Home/bin/java "-javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=54596:/Applications/IntelliJ IDEA CE.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath /Users/kit/IdeaProjects/cs1a/out/production/AnArrayOfTemps AnArrayOfTemps
* 18.1
* Process finished with exit code 0
 */