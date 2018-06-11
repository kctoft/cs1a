/**
 * name: Class Employee
 * created: 06/10/2018
 * author: Kitana Toft
 * desc: A program that has the information of one employee.
 */

public class ClassEmployee {
    // declare variables
    private String firstName;
    private String lastName;
    private int ssn;
    private int salary;

    /**
     * initialize mutator for first, last, ssn, & salary
     */

    public void setFirstName(String firstName) { // mutator
       // name = firstName; FIXME help
    }

    public void setLastName(String lastName) {
        // name = lastName; FIXME help
    }

    public void setSsn(int userSsn) {
        ssn = userSsn;
    }

    public void setSalary(int userSalary) {
        salary = userSalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSsn() {
        return ssn;
    }

    public int getSalary() {
        return salary;
    }

    public static void main(String[] args) {
    }
}
