/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dgdebordpstcc.dylan_debord_5_vehicleapp;

/**
 *
 * @author dgdeb_b82hwq2
 */
public final class Truck extends Vehicle implements Insurable{
   private double payloadCapacity;

    public Truck(String make, String model, int year, double payloadCapacity) {
        super(make, model, year, VehicleType.TRUCK);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf(", Payload Capacity: %.2f tons", payloadCapacity);
    }

    @Override
    public double getInsuranceCost() {
        return 1000 + (payloadCapacity * 200);
    }
}
