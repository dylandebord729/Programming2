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
public abstract sealed class Employee permits Manager, Developer{
   //Variables
   private String name;
   private double baseSalary;
   
   //Paramertized Constructor
   public Employee (String name, double baseSalary){
      this.name = name;
      this.baseSalary = baseSalary;
   }
   
   //Methods
   public double calculateSalary(){
       return baseSalary;
   }
   public void displayInfo(){
       System.out.println("Name: "+name);
       System.out.println("Base Salary: "+baseSalary);
   }
   
  //Gets and Sets
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the baseSalary
     */
    public double getBaseSalary() {
        return baseSalary;
    }

    /**
     * @param baseSalary the baseSalary to set
     */
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}
