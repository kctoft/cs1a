/**
 * name: Test Employee
 * created: 06/24/2018
 * author: Kitana Toft
 * desc: Using class Employee, ask for four employees and print their information.
 */

/**
 * import scanner for user input.
 * import ArrayList to create a list for the user input data.
 */

import java.util.Scanner;
import java.util.ArrayList;

public class TestEmployee {
    public static void main(String[] args) {
        // declare and initialize Scanner and  ArrayList
        Scanner s = new Scanner(System.in);
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        final int maxEmployees = 4;

        // introduce program, ask user for employee information
        System.out.println("Enter your employee's information below.");

        // create loop that asks for employee name, ssn, and salary 4x's
        for (int i = 0; i < maxEmployees; i++) {
            System.out.println("Enter first name: ");
            String name = s.next();
            System.out.println("Enter last name: ");
            String surName = s.next();
            System.out.println("Enter social security number: ");
            int ssn = s.nextInt();
            System.out.println("Enter employee's salary: ");
            float salary = s.nextFloat();

            // using Employee constructor, set to user input
            Employee anEmployee = new Employee(name, surName, ssn, salary);
            employeeList.add(anEmployee);
        }

        // print out list of employees
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i));
        }
    }
}
/**
 * Output:

 Enter your employee's information below.
 Enter first name:
 jo
 Enter last name:
 nad
 Enter social security number:
 123456789
 Enter employee's salary:
 90000
 Enter first name:
 lily
 Enter last name:
 mae
 Enter social security number:
 987654321
 Enter employee's salary:
 100000
 Enter first name:
 darla
 Enter last name:
 dimple
 Enter social security number:
 321234567
 Enter employee's salary:
 201000
 Enter first name:
 billy
 Enter last name:
 max
 Enter social security number:
 98734281
 Enter employee's salary:
 79000
 First name: jo
 Last name: nad
 Social security number: 123456789
 Salary: $90000.0
 First name: lily
 Last name: mae
 Social security number: 987654321
 Salary: $100000.0
 First name: darla
 Last name: dimple
 Social security number: 321234567
 Salary: $201000.0
 First name: billy
 Last name: max
 Social security number: 98734281
 Salary: $79000.0

 Process finished with exit code 0

 */
