/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dgdebordpstcc.dylan_debord_lab3_studentapp;

/**
 *
 * @author dgdeb_b82hwq2
 */
import java.util.Arrays;
import java.text.DecimalFormat;
public class Dylan_DeBord_Lab3_Student {
    //Declares variables
    DecimalFormat df = new DecimalFormat("0.00"); 
    private String name;
    private int[] grades;
    
    //Parameterized Constuctor
    public Dylan_DeBord_Lab3_Student(String name, int[] grades){
        this.name = name;
        int[] cgrades = Arrays.copyOf(grades, grades.length);
        this.grades = cgrades;
    }
    
    //Calculates Average
    public double calculateAverage(){
        int sum = 0;
        for (int grade : grades) { 
            sum += grade;
        }
        double average = sum / grades.length;
        return average;
    }
    
    //Displays the info
    public void getDisplayInfo(){
    System.out.println("Name: "+name);
    System.out.print("Grades:");
    for (int grade : grades) { 
            System.out.print(" "+grade);
        }
    System.out.println("");
    double avgGrade = calculateAverage();
    System.out.print("Average: "+df.format(avgGrade));
    System.out.println("");
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the grades
     */
    public int[] getGrades() {
        return grades;
    }

    
}
/*private static String name(){}
*   private static Int grades(){}*/
/*double sum = 0.0;
for (double grade : grades) { 
   sum += grade;
}
double average = sum / grades.length;*/