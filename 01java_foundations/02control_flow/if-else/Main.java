import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LocalDate myDate = LocalDate.now();

        System.out.println("Enter date in YYYY-MM-DD format.");
        String customDate = scan.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd");

        scan.close();
    }
}
