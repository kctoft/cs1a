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
        anEmployee.setLastName("Smith");
        anEmployee.setSsn(100201234);
        anEmployee.setSalary(90000);

       System.out.println(anEmployee);

       Employee theEmployee = new Employee("Olivia", "Greenbottom", 987654321, 30000);

       System.out.println(theEmployee);

    }
}
