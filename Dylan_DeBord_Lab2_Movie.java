/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dgdebordpstcc.dylan_debord_movieapp;
import java.text.DecimalFormat;
/**
 *
 * @author dgdeb_b82hwq2
 */
public class Dylan_DeBord_Lab2_Movie {
    //NUmber format
    DecimalFormat df = new DecimalFormat("0.0");
    
    //Seting title,genre and rating.
    private String title;
    private String genre;
    private Double rating;  

    //Default Constuctor
    public Dylan_DeBord_Lab2_Movie(){
        title = "Unknown";
        genre = "Unknown";
        rating = 0.0;
    }
    
    //Parameterized Construtor
    public Dylan_DeBord_Lab2_Movie(String title, String genre, Double rating){
    this.title = title;
    this.genre = genre;
    this.rating = rating;
    }
    
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param aGenre the genre to set
     */
    public void setGenre(String aGenre) {
        genre = aGenre;
    }

    /**
     * @return the rating
     */
    public Double getRating() {
        return rating;
    }

    /**
     * @param aRating the rating to set
     */
    public void setRating(Double aRating) {
        rating = aRating;
    }
    
    public void displayInfo(){
        System.out.println("Title: "+title);
        System.out.println("Genre: "+genre);
        System.out.println("Rating: "+rating);
    }
}