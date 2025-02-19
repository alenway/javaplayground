import java.io.*;
import java.util.*;

class Main {
    public static int addItem(Map<Integer, String> itemlist, String item, int counter) {
        itemlist.put(counter, item);
        return ++counter;
    }

    public static void showItems(Map<Integer, String> itemlist) {
        System.out.println("List of items:");
        itemlist.forEach((key, value) -> System.out.println(key + ". " + value));
    }

    public static void deleteItem(Map<Integer, String> itemlist, int deleteKey) {
        if (itemlist.remove(deleteKey) != null) {
            System.out.println("Item deleted successfully.");
        } else {
            System.out.println("Key does not exist.");
        }
    }

    public static int readInt(BufferedReader br) throws IOException {
        return Integer.parseInt(br.readLine());
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            Map<Integer, String> itemlist = new LinkedHashMap<>();
            int counter = 1;

            while (true) {
                System.out.println("\n*** Select one of the options ***");
                System.out.println("0. To Exit.");
                System.out.println("1. Add items to the list.");
                System.out.println("2. View all list items.");
                System.out.println("3. To delete list items.");
                System.out.println("4. To update items.");

                System.out.print("Enter a number out of the options: ");

                try {
                    int chosenNumber = readInt(br);

                    switch (chosenNumber) {
                        case 0:
                            System.out.println("The program is stopped.");
                            return;
                        case 1:
                            System.out.print("Enter a list item: ");
                            String item = br.readLine();
                            if (item != null && !item.trim().isEmpty()) {
                                counter = addItem(itemlist, item, counter);
                            } else {
                                System.out.println("Item cannot be empty.");
                            }
                            break;
                        case 2:
                            showItems(itemlist);
                            break;
                        case 3:
                            System.out.print("Enter item number to delete: ");
                            int deleteKey = readInt(br);
                            deleteItem(itemlist, deleteKey);
                            break;
                        case 4:
                            System.out.print("Enter key to update: ");
                            int updateKey = readInt(br);
                            if (itemlist.containsKey(updateKey)) {
                                System.out.print("Enter item name: ");
                                String newItem = br.readLine();
                                itemlist.put(updateKey, newItem);
                            } else {
                                System.out.println("Item number not found.");
                            }
                            break;
                        default:
                            System.out.println("Enter a number out of the given options.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input, please enter a number value: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Error input: " + e);
        }
    }
}
