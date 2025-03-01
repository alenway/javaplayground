import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Grocery {
    private ArrayList<String> items;

    // Constructor
    public Grocery() {
        this.items = new ArrayList<>();
    }

    // Method to add an item
    void addItem(String item) {
        items.add(item);
    }

    // Method to display items
    void displayItems() {
        if (items.isEmpty()) {
            System.out.println("No items in the list.");
        } else {
            for (String item : items) {
                System.out.println("Item name: " + item);
            }
        }
    }
}

class List {
    private Grocery groceryItems;

    public List() {
        this.groceryItems = new Grocery();
    }

    public void addItem(String item) {
        groceryItems.addItem(item);
    }

    public void displayItems() {
        groceryItems.displayItems();
    }
}

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List groceryList = new List();

        while (true) {
            menu();
            try {
                int choice = userChoice(reader);
                switch (choice) {
                    case 0:
                        System.out.println("Program stopped");
                        return;
                    case 1:
                        System.out.print("Enter item to add: ");
                        String item = reader.readLine();
                        groceryList.addItem(item);
                        break;
                    case 2:
                        groceryList.displayItems();
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public static void menu() {
        System.out.println("*** Content menu ***");
        System.out.println("0 for exit program.");
        System.out.println("1 for add item.");
        System.out.println("2 for show items.");
        System.out.print("Enter your choice: ");
    }

    public static int userChoice(BufferedReader reader) throws IOException {
        int value = Integer.parseInt(reader.readLine());
        return value;
    }
}
