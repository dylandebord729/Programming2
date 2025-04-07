/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dgdebordpstcc.dylan_debord_5_vehicleapp;

/**
 *
 * @author dgdeb_b82hwq2
 */
import java.util.Scanner;
public class Dylan_DeBord_5_VehicleApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Vehicle[] vehicles = new Vehicle[2];

        // Input for Car
        System.out.println("Enter details for Car:");
        System.out.print("Make: ");
            String cMake = input.nextLine();
        System.out.print("Model: ");
            String cModel = input.nextLine();
        System.out.print("Year: ");
            int cYear = input.nextInt();
        System.out.print("Number of Doors: ");
            int numberOfDoors = input.nextInt();
        input.nextLine(); // consume newline
            vehicles[0] = new Car(cMake, cModel, cYear, numberOfDoors);

        // Input for Truck
        System.out.println("\nEnter details for Truck:");
            System.out.print("Make: ");
        String tMake = input.nextLine();
            System.out.print("Model: ");
        String tModel = input.nextLine();
            System.out.print("Year: ");
        int tYear = input.nextInt();
            System.out.print("Payload Capacity (in tons): ");
        double payloadCapacity = input.nextDouble();
            vehicles[1] = new Truck(tMake, tModel, tYear, payloadCapacity);

        // Display Vehicle Info and Insurance Cost
        System.out.println("\nVehicle Details:");
        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println("");
            if (v instanceof Insurable) {
                System.out.printf("Insurance Cost: $%.2f\n\n", ((Insurable) v).getInsuranceCost());
            }
        }

        input.close();
    }
}
