/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dgdebordpstcc.dylan_debord_lab4_employeeapp;

/**
 *
 * @author dgdeb_b82hwq2
 * Dylan DeBord
 */

import java.util.Scanner;
import java.util.Arrays;
import java.text.NumberFormat;
public class EmployeeApp {

    public static void main(String[] args) {
        //Declares Scanner and an Array
        Scanner input = new Scanner(System.in);
        Employee[] employees = new Employee[4];
        NumberFormat c = NumberFormat.getCurrencyInstance();
        
        //Declares Variables
        String name;
        double salary;
        double overtime;
        double bonus;
        
        System.out.print("Enter Manager 1 name: ");
            name = input.nextLine();
        System.out.print("Enter Salary: ");
            salary = input.nextDouble();
            input.nextLine();
        System.out.print("Enter Bonus: ");
            bonus = input.nextDouble();
            input.nextLine();
        employees[0] = new Manager(name, salary, bonus);
        
        System.out.println("");
        
        System.out.print("Enter Manager 2 name: ");
            name = input.nextLine();
        System.out.print("Enter Salary: ");
            salary = input.nextDouble();
            input.nextLine();
        System.out.print("Enter Bonus: ");
            bonus = input.nextDouble();
            input.nextLine();
        employees[1] = new Manager(name, salary, bonus);
        
        System.out.println("");
        
        System.out.print("Enter Developer 1 name: ");
            name = input.nextLine();
        System.out.print("Enter Salary: ");
            salary = input.nextDouble();
        input.nextLine();
        System.out.print("Enter Over Time: ");
            overtime = input.nextDouble();
            input.nextLine();
        employees[2] = new Developer(name, salary, overtime);
        
        System.out.println("");
        
        System.out.print("Enter Developer 2 name: ");
            name = input.nextLine();
        System.out.print("Enter Salary: ");
            salary = input.nextDouble();
        System.out.print("Enter Over Time: ");
            overtime = input.nextDouble();
            input.nextLine();
        employees[3] = new Developer(name, salary, overtime);
        
        System.out.println("");
        
        System.out.println("Employee Details:");
        
        double totalSalary = 0;
        for(Employee employee : employees){
            employee.displayInfo();
            totalSalary += employee.calculateSalary();
        }
        
        System.out.println("");
        
        System.out.print("Total Salary: " + c.format(totalSalary));
        
    }
}
