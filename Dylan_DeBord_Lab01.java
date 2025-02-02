/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dgdebordpstcc.dylan_debord_lab01;

/**
 *
 * @author dgdeb_b82hwq2
 */
import java.util.Scanner;
import java.text.NumberFormat;
public class Dylan_DeBord_Lab01 {

    public static void main(String[] args) {
        //Declaring Variables
        double hoursWorked = 0.0;
        double hrRate = 0.0;
        double totalNetPay = 0.0;
        double grossPay = 0.0;
        double deductions = 0.0;
        double netPay = 0.0;
        
        // Sets scanner to input
        Scanner input = new Scanner(System.in);
        
        //Number formating
        NumberFormat c = NumberFormat.getCurrencyInstance();
        
        //Asking for the # of Employees and declares a variable for said #.
        System.out.print("Enter number of Employees: ");
        int numEmp = input.nextInt();
        System.out.println("");
        
        //For Loop for the Employees and pay for said Employees
        for (int i = 0; i < numEmp; i++){
            System.out.println("Employee "+ (i+1) + ":");
            System.out.print("Please enter the number of hours worked: ");
                hoursWorked = getValidDouble();
            System.out.print("Enter the Hourly Rate: ");
                hrRate = getValidDouble();
            System.out.println("");
            System.out.println("Employee "+ (i+1) + " summary:");
            
            //Declare the varibles for the employees payment.
            grossPay = calculateGrossPay(hoursWorked, hrRate);
            deductions = calculateDeductions(grossPay);
            netPay = calculateNetPay(grossPay, deductions);
            totalNetPay += netPay;
            
            //Print Statements
            System.out.print("Gross Pay: "+c.format(grossPay)+"\n");
            System.out.print("Deductions: "+c.format(deductions)+"\n");
            System.out.print("Net Pay: "+c.format(netPay)+"\n");
            System.out.println("");
        }
        System.out.print("Total Net Pay for ALL Employees: "+c.format(totalNetPay)+"\n");
    }
    private static double calculateGrossPay(double grossHours, double hrPay){
        double regHours = 0.0;
        double ovtHours = 0.0;
        double ovtRate = 1.5;
        if(grossHours >40){
            regHours = 40.0;
            ovtHours = grossHours - regHours;
        }else{
            regHours = grossHours;
            ovtHours = 0.0;
        }
        double grossPay = (regHours * hrPay) + (ovtHours * hrPay * ovtRate);
        return grossPay;
    }
    private static double calculateDeductions(double grossPay){
        double deductions = grossPay *0.2;
        return deductions;
    }
    private static double calculateNetPay(double grossPay , double deductions){
        double netPay = grossPay - deductions;
        return netPay;
    }
    private static double getValidDouble(){
        // Sets scanner to input
        Scanner input = new Scanner(System.in);
        //gets and sets the original price
        double validDouble = 0.0;
        //does try catch on the original number
        try {
            validDouble = Double.parseDouble(input.nextLine());
        }
        catch (NumberFormatException e)  {
            System.out.println("Error! Invalid number.\n");
        }
        return validDouble;
    }
   //gpay
   //deduct
   //npay
}
