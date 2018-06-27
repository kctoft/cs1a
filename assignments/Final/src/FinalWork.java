
public class FinalWork {
    // declare variables
    private int month;
    private int day;
    private int year;

    // default constructor
    public FinalWork() {
        month = 6;
        day = 26;
        year = 2018;
    }

    public void setMonth(int month) {
        month = month;
    }

    public int getMonth() {
        return month;
    }

    public int setDay(int day) {
        day = day;
    }

    public int getDay() {
        return day;
    }

    public int setYear(int year) {
        year = year;
    }

    public int getYear() {
        return year;
    }

    public String today() {
        String info = "";
        info = month + "/" + day + "/" + year;
        return info;
    }
}

    public static void main(String[] args) {
        FinalWork today;
        today = new FinalWork( );
        today.setMonth(6);
        today.setDay (25);
        today.setYear(2018);
        System.out.println(today);
    }
}

