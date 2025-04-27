/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dgdebordpstcc.dylandebord_lab6;

/**
 *
 * @author dgdeb_b82hwq2
 */
import java.util.*;
public class DylanDeBord_Lab6 {
    //Delcares variables
    private static Stack<String> pStack = new Stack<>();
    private static HashMap<String, String> customers = new HashMap<>();
    private static Queue<String> deliveryQueue = new LinkedList<>();
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
  boolean running = true;
//While Loop and Switch statement for the main menue
            while (running) {
                printMenu();
                int choice = getChoice();

            switch (choice) {
                case 1:
                    addOrderToProcessingStack();
                    break;
                case 2:
                    viewNextProcessingOrder();
                    break;
                case 3:
                    processTopOrder();
                    break;
                case 4:
                    addCustomer();
                    break;
                case 5:
                    retrieveCustomer();
                    break;
                case 6:
                    displayAllCustomers();
                    break;
                case 7:
                    addCompletedOrderToDeliveryQueue();
                    break;
                case 8:
                    viewNextDeliveryOrder();
                    break;
                case 9:
                    deliverNextOrder();
                    break;
                case 0:
                    running = false;
                    System.out.println("Exiting Order Manager. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    
    }
    
    //Prints the main menue
    private static void printMenu() {
        System.out.println("\n--- Order Manager Menu ---");
        System.out.println("1. Add new order to processing stack");
        System.out.println("2. View next order to process");
        System.out.println("3. Process (pop) top order");
        System.out.println("4. Add new customer");
        System.out.println("5. Retrieve customer by ID");
        System.out.println("6. Display all customers");
        System.out.println("7. Add completed order to delivery queue");
        System.out.println("8. View next order to deliver");
        System.out.println("9. Deliver next order");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }
    
    // Gets the useres choice that they chose on the main menue
    private static int getChoice() {
        try {
            return Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            return -1; // invalid choice
        }
    }
    
    //viewing the next processing order
   private static void viewNextProcessingOrder() {
        if (!pStack.isEmpty()) {
            System.out.println("Next order to process: " + pStack.peek());
        } else {
            System.out.println("Processing stack is empty.");
        }
}
   
   //processing the top order
    private static void processTopOrder() {
        if (!pStack.isEmpty()) {
            String order = pStack.pop();
            System.out.println("Processed order: " + order);
        } else {
            System.out.println("Processing stack is empty.");
        }
    }
    
    //Add a customer
    private static void addCustomer() {
        System.out.print("Enter customer ID: ");
        String id = input.nextLine();
        System.out.print("Enter customer name: ");
        String name = input.nextLine();
        customers.put(id, name);
        System.out.println("Customer added.");
    }
    
    //retrieve the customer based on the id number
    private static void retrieveCustomer() {
        System.out.print("Enter customer ID to retrieve: ");
        String id = input.nextLine();
        if (customers.containsKey(id)) {
            System.out.println("Customer Name: " + customers.get(id));
        } else {
            System.out.println("Customer not found.");
        }
    }

    //displays ALL customers info
    private static void displayAllCustomers() {
        if (customers.isEmpty()) {
            System.out.println("No customers to display.");
        } else {
            System.out.println("--- Customer List ---");
            for (Map.Entry<String, String> entry : customers.entrySet()) {
                System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
            }
        }
    }

    // Queue Operations
    private static void addCompletedOrderToDeliveryQueue() {
        System.out.print("Enter completed order description: ");
        String order = input.nextLine();
        deliveryQueue.add(order);
        System.out.println("Order added to delivery queue.");
    }

    //Views the next delivery order
    private static void viewNextDeliveryOrder() {
        if (!deliveryQueue.isEmpty()) {
            System.out.println("Next order to deliver: " + deliveryQueue.peek());
        } else {
            System.out.println("Delivery queue is empty.");
        }
    }

    //Delivers the next order
    private static void deliverNextOrder() {
        if (!deliveryQueue.isEmpty()) {
            String order = deliveryQueue.poll();
            System.out.println("Delivered order: " + order);
        } else {
            System.out.println("Delivery queue is empty.");
        }
    }

    // Adds a order to the processing stack
    private static void addOrderToProcessingStack() {
        System.out.print("Enter order details: ");
        String oDetails = input.nextLine();
        pStack.push(oDetails);
    }

}

