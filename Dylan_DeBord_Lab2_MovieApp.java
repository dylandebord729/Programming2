/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dgdebordpstcc.dylan_debord_movieapp;

/**
 *
 * @author dgdeb_b82hwq2
 */
import java.util.Scanner;
public class Dylan_DeBord_Lab2_MovieApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dylan_DeBord_Lab2_Movie movie = new Dylan_DeBord_Lab2_Movie("Dune", "Sci-Fi/Adventure", 8.0);
        System.out.println("Movie Details: ");
        movie.displayInfo();
        
        //Prints a blank line.
        System.out.println("");
        
        //Updates and reads in the updated Movie Details
        System.out.println("Update Movie Details: ");
        System.out.print("Enter New Title: ");
            movie.setTitle(input.nextLine());
        System.out.print("Enter New Genre: ");
            movie.setGenre(input.nextLine());
        System.out.print("Enter New Rating: ");
            movie.setRating(input.nextDouble());
        
        //Prints a blank line.
        System.out.println("");
       
        //Prints out the updated Movie details.
        System.out.println("Movie Details: ");
        movie.displayInfo();
    }
    
}
