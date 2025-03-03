import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LocalDate currentDate = LocalDate.now();

        System.out.println("Enter date in YYYY-MM-DD format.");
        String userInput = scan.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd");

        try {
            LocalDate userDate = LocalDate.parse(userInput, formatter);

            long dayDifference = ChronoUnit.DAYS.between(userDate, currentDate);

            System.out.println("Difference in date: " + Math.abs(dayDifference));
            // Compare dates
            if (userDate.isBefore(currentDate)) {
                System.out.println("The entered date is in the past.");
            } else if (userDate.isAfter(currentDate)) {
                System.out.println("The entered date is in the future.");
            } else {
                System.out.println("The entered date is today.");
            }

        } catch (Exception e) {
            System.out.println("Invalid date format. Please enter a valid date in yyyy-MM-dd format.");
        }

        scan.close();
    }
}
