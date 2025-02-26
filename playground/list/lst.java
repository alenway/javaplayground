import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class lst {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        while (true) {
            try {
                displayMenu();
                int choice = getUserChoice(reader);
                switch (choice) {
                    case 1:
                        addItemToList(reader, list);
                        break;
                    case 2:
                        showListItems(list);
                        break;
                    case 0:
                        System.out.println("Program Ends.");
                        return;
                    default:
                        System.out.println("Invalid option enter 0,1, or 2.");
                }
            } catch (IOException e) {
                System.out.println("Invalid input error: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("invalid input type: " + e.getMessage());
            }
        }
    }

    public static void displayMenu() {
        System.out.print("Enter 0 to exit and 1 to continue and 2 to show all: ");
    }

    public static int getUserChoice(BufferedReader reader) throws IOException {
        return Integer.parseInt(reader.readLine());
    }

    public static void addItemToList(BufferedReader reader, List<String> list) throws IOException {
        System.out.print("Enter a value:");
        String value = reader.readLine();
        list.add(value);
        System.out.println("value added successfully");
    }

    public static void showListItems(List<String> list) throws IOException {
        if (list.isEmpty()) {
            System.out.println("The list is Empty.");
        } else {
            System.out.println("List Contains:" + list);
        }
    }
}
