import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class arlst {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> listItem = new ArrayList<>();
        while (true) {
            displayMenu();
            try {
                int choise = getUserChoise(reader);
                switch (choise) {
                    case 0:
                        System.out.println("Program Ends.");
                        return;
                    case 1:
                        addListItem(reader, listItem);
                        break;
                    case 2:
                        showListItems(listItem);
                        break;
                    default:
                        System.out.println("Enter a number's 0, 1, and 2.");
                        break;
                }
            } catch (IOException e) {
                System.out.println("Input error: " + e.getMessage());
            }
        }
    }

    public static void displayMenu() {
        System.out.println("*** Menu ***");
        System.out.println("0 to Exit.");
        System.out.println("1 to Add item.");
        System.out.println("2 to show items.");
    }

    public static int getUserChoise(BufferedReader reader) throws IOException {
        System.out.print("Enter you choice: ");
        return Integer.parseInt(reader.readLine());
    }

    public static void addListItem(BufferedReader reader, ArrayList<String> listIteme) throws IOException {
        System.out.print("Enter Item: ");
        String value = reader.readLine();
        listIteme.add(value);
        System.out.println("Item Added successfully.");
    }

    public static void showListItems(ArrayList<String> listItem) throws IOException {
        System.out.println("list Items:");
        System.out.println(listItem);
    }
}
