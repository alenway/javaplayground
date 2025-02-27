import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Room {
    private String name;

    // Constructor
    public Room(String name) {
        this.name = name;
    }

    // Methods
    public void displayRoomInfo() {
        System.out.println("Room: " + name);
    }
}

class House {
    private List<Room> rooms;

    // Constructor
    public House(List<Room> rooms) {
        this.rooms = rooms;
    }

    // Methods
    public void displayHouseInfo() {
        System.out.println("The house contains the following rooms:");
        for (Room room : rooms) {
            room.displayRoomInfo();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Room> rooms = new ArrayList<>(); // Initialize
        int roomCount = 0;

        while (true) {
            menu();
            try {
                int choice = getUserChoice(reader);
                switch (choice) {
                    case 1:
                        rooms.add(addRoom(reader));
                        break;
                    case 2:
                        showRooms(rooms);
                        break;
                    case 0:
                        System.out.println("Exiting program.");
                        return;
                    default:
                        System.out.println("Enter a valid number.");
                        break;
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public static void menu() {
        System.out.println("*** Menu Options ***");
        System.out.println("1. Add Room");
        System.out.println("2. Show All Rooms");
        System.out.println("0. Exit");
    }

    public static int getUserChoice(BufferedReader reader) throws IOException {
        return Integer.parseInt(reader.readLine());
    }

    public static Room addRoom(BufferedReader reader) throws IOException {
        System.out.println("Enter room name:");
        String roomName = reader.readLine();
        return new Room(roomName);
    }

    public static void showRooms(List<Room> rooms) {
        House myHouse = new House(rooms);
        myHouse.displayHouseInfo();
    }
}
