/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dgdebordpstcc.dylan_debord_5_vehicleapp;

/**
 *
 * @author dgdeb_b82hwq2
 */
public final class Car extends Vehicle implements Insurable{
   private int numberOfDoors;
   public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year, VehicleType.CAR);
        this.numberOfDoors = numberOfDoors;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.print(", Doors: " + numberOfDoors);
    }

    @Override
    public double getInsuranceCost() {
        return 500 + (numberOfDoors * 100);
    }
}
