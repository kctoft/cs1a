/*
* "Auto Insurance"
* created: 5/19/2018
* author: Kitana Toft
* desc: In this lab the goal is to calculate auto insurance for HiRisq Insurance company.
*  In this program the user is asked for their AGE,
*  # of traffic TICKETS the user has received in the past three years,
*  and the VALUE of the user's car.
*  This program will take those three values and calculate the user's monthly premium.
*  Input:
*  Age = 25, Number of tickets = 3, Car Value = 850
*/

import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.RoundingMode;

public class AutoInsurance {
    public static void main(String[] args) {
        // declare vars & scanner
        Scanner s = new Scanner(System.in);
        int userAge;
        int numTickets;

        double carValue;
        double basePremium;
        double insurancePremium;
        double ageRate;
        double ticketRate;

        // set defaults
        basePremium = 0.05;
        userAge = 30;
        ageRate = 0;
        numTickets = 0;
        ticketRate = 0;

        System.out.println("Driver's age?");
        userAge = s.nextInt();

        if (userAge < 25) {
            ageRate = 0.15;
        } else if (userAge < 30) {
            ageRate = 0.15;
        }

        System.out.println("Number of ticket's?");
        numTickets = s.nextInt();

        if (numTickets == 0) {
            ticketRate = 0;
        } else if (numTickets == 1) {
            ticketRate = 0.1;
        } else if (numTickets == 2) {
            ticketRate = 0.25;
        } else if (numTickets == 3) {
            ticketRate = 0.5;
        } else {
            ticketRate = -1;
        }

        System.out.println("Value of car?");
        carValue = s.nextDouble();

        // Ex: Premium = (850 * .05)* 1.15 * 1.50 = 73.3125
        insurancePremium = (carValue * basePremium) * (1 + ageRate) * (1 + ticketRate);
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.DOWN);
        System.out.println("$" + df.format(insurancePremium));
    }
}

/*
* Output:
* /Library/Java/JavaVirtualMachines/jdk-9.0.4.jdk/Contents/Home/bin/java "-javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=54316:/Applications/IntelliJ IDEA CE.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath /Users/kit/IdeaProjects/cs1a/out/production/AutoInsurance AutoInsurance
* Driver's age?
* 25
* Number of ticket's?
* 3
* Value of car?
* 850
* $73.31
* Process finished with exit code 0
 */
