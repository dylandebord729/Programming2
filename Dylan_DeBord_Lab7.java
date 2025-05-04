/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dgdebordpstcc.dylan_debord_lab7;

/**
 *
 * @author dgdeb_b82hwq2
 */
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
public class Dylan_DeBord_Lab7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. LocalDate Operations
        try {
            System.out.print("Enter a date (yyyy-MM-dd): ");
            LocalDate date = LocalDate.parse(input.nextLine());
            System.out.println("Day of the week: " + date.getDayOfWeek());
            System.out.println("30 days after: " + date.plusDays(30));
            System.out.println("30 days before: " + date.minusDays(30));
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format.");
        }

        System.out.println();
        

        // 2. LocalTime Operations
        try {
            System.out.print("Enter a time (HH:mm): ");
            LocalTime time = LocalTime.parse(input.nextLine());
            DateTimeFormatter twelveHourFormat = DateTimeFormatter.ofPattern("hh:mm a");
            System.out.println("12-hour format: " + time.format(twelveHourFormat));
            LocalTime updatedTime = time.plusHours(2).plusMinutes(15);
            System.out.println("Time after adding 2 hours 15 minutes: " + updatedTime);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid time format.");
        }

        System.out.println();
        

        // 3. LocalDateTime and Formatting
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("EEE, MMM dd yyyy hh:mm a");
        System.out.println("Current date and time: " + now);
        System.out.println("Formatted: " + now.format(dateTimeFormat));

        try {
            System.out.print("Enter a deadline (yyyy-MM-dd HH:mm): ");
            String deadlineStr = input.nextLine();
            DateTimeFormatter deadlineFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            LocalDateTime deadline = LocalDateTime.parse(deadlineStr, deadlineFormatter);
            Duration duration = Duration.between(now, deadline);
            long hours = duration.toHours();
            long minutes = duration.toMinutes() % 60;
            System.out.println("Time remaining until deadline: " + hours + " hours and " + minutes + " minutes");
        } catch (DateTimeParseException e) {
            System.out.println("Invalid deadline format.");
        }

        System.out.println();
        

        // 4. Duration and Period
        try {
            System.out.print("Enter first date (yyyy-MM-dd): ");
            LocalDate firstDate = LocalDate.parse(input.nextLine());
            System.out.print("Enter second date (yyyy-MM-dd): ");
            LocalDate secondDate = LocalDate.parse(input.nextLine());
            Period period = Period.between(firstDate, secondDate);
            System.out.printf("Difference: %d years, %d months, %d days%n",
                    Math.abs(period.getYears()), Math.abs(period.getMonths()), Math.abs(period.getDays()));
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format.");
        }

        try {
            System.out.print("Enter first time (HH:mm): ");
            LocalTime firstTime = LocalTime.parse(input.nextLine());
            System.out.print("Enter second time (HH:mm): ");
            LocalTime secondTime = LocalTime.parse(input.nextLine());
            Duration timeDuration = Duration.between(firstTime, secondTime);
            long hours = Math.abs(timeDuration.toHours());
            long minutes = Math.abs(timeDuration.toMinutes() % 60);
            System.out.printf("Duration: %d hours and %d minutes%n", hours, minutes);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid time format.");
        }

        input.close();
    }
}
