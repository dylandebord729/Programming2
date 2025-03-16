/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dgdebordpstcc.dylan_debord_lab4_employeeapp;

import java.text.NumberFormat;

/**
 *
 * @author dgdeb_b82hwq2D
 * Dylan DeBord
 */
public final class Developer extends Employee {
    
    //Declares Variables
    NumberFormat c = NumberFormat.getCurrencyInstance();
    private double overtimePay;
    
    //Constructor
    public Developer(String name, double baseSalary, double overtimePay){
       super(name, baseSalary);
       this.overtimePay = overtimePay;
    }
    
    //Overrides Calculate salary and Display info
    @Override
   public double calculateSalary(){
       return super.calculateSalary()+overtimePay;
   }
    @Override
   public void displayInfo(){
       System.out.print("Developer - Name: " + super.getName() + ", ");
       System.out.print("Base Salary: " + c.format(super.calculateSalary()) + ", ");
       System.out.print("Bonus: " + c.format(overtimePay) + ", ");
       System.out.println("Total Salary: " + c.format(calculateSalary()));
   }
}
