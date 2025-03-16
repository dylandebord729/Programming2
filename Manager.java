/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dgdebordpstcc.dylan_debord_lab4_employeeapp;

/**
 *
 * @author dgdeb_b82hwq2
 * Dylan DeBord
 */
import java.text.NumberFormat;
public final class Manager extends Employee{
    
    // Declares variables
    NumberFormat c = NumberFormat.getCurrencyInstance();
    private double bonus;
    public Manager(String name, double baseSalary, double bonus){
    super(name, baseSalary);
    this.bonus = bonus;
    }
    
    //Overrides Calculate salary and Display info
    @Override
   public double calculateSalary(){
       return super.calculateSalary()+bonus;
   }
    @Override
   public void displayInfo(){
       System.out.print("Manager - Name: " + super.getName() + ", ");
       System.out.print("Base Salary: " + c.format(super.calculateSalary()) + ", ");
       System.out.print("Bonus: " + c.format(bonus) + ", ");
       System.out.println("Total Salary: " + c.format(calculateSalary()));
   }
}