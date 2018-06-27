/**
 Write the definition of a new class Date.
 One object of class Date represent the month,
 day and year for one date on the calendar.

 I have given you the main( ), and you must provide the
 class definition that will run the given main( ) and print the given output.
 You only need to define the methods required by this main( ) :
 */

public class Date {
    // declare variables
    private int month;
    private int day;
    private int year;

    // default constructor
    public Date(int iMonth, int iDay, int iYear) {
        month = iMonth;
        day = iDay;
        year = iYear;
    }

    // month constructor
    public void setMonth(int iMonth) {
        month = iMonth;
    }

    public int getMonth() {
        return month;
    }

    // day constructor
    public void setDay(int iDay) {
        day = iDay;
    }

    public int getDay() {
        return day;
    }

    // year constructor
    public void setYear(int iYear) {
        year = iYear;
    }

    public int getYear() {
        return day;
    }

    public String toString() {
        String order = "";
        order = month + "/" + day + "/" + year;
        return order;
    }

    public static void main(String[] args) {
        Date today;
        today = new Date(6, 25,2018);
        today.setMonth(6);
        today.setDay (25);
        today.setYear(2018);
        System.out.println(today);
    }
}
