/**
 * name: Test Employee
 * created: 06/11/2018
 * author: Kitana Toft
 * desc: Using methods from class Employee, test and print the solutions here.
 */
import java.util.Scanner;
import java.util.ArrayList;

public class TestEmployee {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> employeeList = new ArrayList<String>();
        final int maxEmployees = 4;

        System.out.println("Enter your employee's information below.");

        System.out.println("Enter first name: ");
        String name = s.next();
        System.out.println("Enter last name: ");
        String surName = s.next();
        System.out.println("Enter social security number: ");
        int ssn = s.nextInt();
        System.out.println("Enter employee's salary: ");
        float salary = s.nextFloat();

        Employee anEmployee = new Employee(name, surName, ssn, salary);

       System.out.println(anEmployee);
    }
}
