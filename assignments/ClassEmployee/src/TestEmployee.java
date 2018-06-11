/**
 * name: Test Employee
 * created: 06/11/2018
 * author: Kitana Toft
 * desc: Using methods from class Employee, test and print the solutions here.
 */

public class TestEmployee {
    public static void main(String[] args) {
        Employee anEmployee = new Employee(); // initializes fields with the value of class definition
        System.out.println(anEmployee);

        // override defaults
        anEmployee.setFirstName("Daniel");
        System.out.println(anEmployee.getFirstName());
        anEmployee.setLastName("Smith");
        System.out.println(anEmployee.getLastName());
        anEmployee.setSsn(100201234);
        System.out.println(anEmployee.getSsn());
        anEmployee.setSalary(90000);
        System.out.println(anEmployee.getSalary());

       System.out.println(anEmployee);

       Employee theEmployee = new Employee("Olivia", "Greenbottom", 987654321, 30000);

       System.out.println(theEmployee);

       // give Oliva Greenbottom a raise
        theEmployee.giveRaise(23);
        System.out.println(theEmployee);
    }
}

/**
 * Output:

 First name: Jane
 Last name: Doe
 Social security number: 123456789
 Salary: $100000.0
 Daniel
 Smith
 100201234
 90000.0
 First name: Daniel
 Last name: Smith
 Social security number: 100201234
 Salary: $90000.0
 First name: Olivia
 Last name: Greenbottom
 Social security number: 987654321
 Salary: $30000.0
 First name: Olivia
 Last name: Greenbottom
 Social security number: 987654321
 Salary: $36900.0

 Process finished with exit code 0

 */
