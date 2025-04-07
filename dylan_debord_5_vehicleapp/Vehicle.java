/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dgdebordpstcc.dylan_debord_5_vehicleapp;

/**
 *
 * @author dgdeb_b82hwq2
 */
public class Vehicle {
    String make;
    String model;
    int year;
    VehicleType vehicleType;
    
    public Vehicle(String make, String model, int year, VehicleType vehicleType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.vehicleType = vehicleType;
    }

    //Displays the info
    public void displayInfo(){
    System.out.println("Type: "+vehicleType);
    System.out.print("Make: "+make);
    System.out.print(", Model: "+model);
    System.out.print(", Year: "+year);
    }
}
