/**
 * name: Class Employee
 * created: 06/10/2018
 * author: Kitana Toft
 * desc: A program that has the information of one employee.
 */

public class Employee {
    // declare variables
    private String firstName;
    private String lastName;
    private int ssn;
    private float salary;

    // default constructor
    public Employee() {
        firstName = "Jane";
        lastName = "Doe";
        ssn = 123456789;
        salary = 100000;
    }

    // constructor with arguments
    public Employee(String uFirstName, String uLastName, int uSsn, float uSalary) {
        firstName = uFirstName;
        lastName = uLastName;
        ssn = uSsn;
        salary = uSalary;
    }

    /**
     * initialize mutator for first, last, ssn, & salary
     */

    // sets user's first name
    public void setFirstName(String userFirstName) {
       firstName = userFirstName;
    }

    // get first name
    public String getFirstName() {
        return firstName;
    }

    // sets user's last name
    public void setLastName(String userLastName) {
        lastName = userLastName;
    }

    // gets user's last name
    public String getLastName() {
        return lastName;
    }

    // sets user's ssn
    public void setSsn(int userSsn) {
        ssn = userSsn;
    }

    // gets user's ssn
    public int getSsn() {
        return ssn;
    }

    // sets user's salary
    public void setSalary(float userSalary) {
        salary = userSalary;
    }

    // gets user's salary
    public float getSalary() {
        return salary;
    }

    // toString output for employee
    public String toString() {
        String info = "";

        info += "First name: " + firstName + "\n";
        info += "Last name: " + lastName + "\n";
        info += "Social security number: " + ssn + "\n";
        info += "Salary: $" + salary;

        return info;
    }

    // method to give raise to employee
    public void giveRaise(float percentRaise) {
        salary = salary + (salary * (percentRaise/ 100));
    }
}
