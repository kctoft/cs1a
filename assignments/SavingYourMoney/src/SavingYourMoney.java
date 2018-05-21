public class SavingYourMoney {
    public static void main(String[] args) {
        double monthlyInterestRate;  // Monthly interest rate 0.0027
        double futureInvestmentValue;  // New calculated sum of investment over selected time
        int initialDeposit;  // Initial deposit $1000
        int years; // Years investment is being compounded, 10 years

        initialDeposit = 1000;
        monthlyInterestRate = 0.0027;
        years = 10;

        System.out.printf("Year   Deposit\n");

        for (int year = 1; year <= years; year++) {
            futureInvestmentValue = initialDeposit * (Math.pow((1 + monthlyInterestRate),year * 12));
            System.out.printf("%d         %d\n", year, (int) futureInvestmentValue);
        }
    }
}
/*
* Output:
* /Library/Java/JavaVirtualMachines/jdk-9.0.4.jdk/Contents/Home/bin/java "-javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=54435:/Applications/IntelliJ IDEA CE.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath /Users/kit/IdeaProjects/cs1a/out/production/SavingYourMoney SavingYourMoney
* Year   Deposit
* 1         1032
* 2         1066
* 3         1101
* 4         1138
* 5         1175
* 6         1214
* 7         1254
* 8         1295
* 9         1338
* 10         1382
* Process finished with exit code 0
 */