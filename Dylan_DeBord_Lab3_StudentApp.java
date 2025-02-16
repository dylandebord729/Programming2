/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dgdebordpstcc.dylan_debord_lab3_studentapp;

/**
 *
 * @author dgdeb_b82hwq2
 */
import java.util.Arrays;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Dylan_DeBord_Lab3_StudentApp {

    public static void main(String[] args) {
        //Delcares Variables
        String name;
        String strGrades;
        int[] grades = new int[3];
        int sumGrades = 0;
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        //Creates a array called students
        var students = new Dylan_DeBord_Lab3_Student[3];
        
        //for loops for students and grades
        for (int s = 0; s < 3; s++){
            System.out.print("Enter name for student "+(s+1)+": ");
            name = input.nextLine();
            System.out.print("Enter grades for "+name+" (3 subjects): ");
            
            for (int i = 0; i < 3; i++){
                grades[i] = input.nextInt();
                sumGrades += grades[i];
            }
            input.nextLine();
            students[s] = new Dylan_DeBord_Lab3_Student(name, grades);
            System.out.println("");
        }
        
        //Prints the student details
        System.out.println("");
        System.out.println("Student Details: ");
        for (int s = 0; s < 3; s++){
          students[s].getDisplayInfo();
          System.out.println("");
        }
        double cAverage = sumGrades/9;
        System.out.println("Class Average: "+df.format(cAverage));
        System.out.println("");
        //Dylan_DeBord_Lab3_Student students[] = new Dylan_DeBord_Lab3_Student();
    }
}
