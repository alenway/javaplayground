import java.util.Scanner;

public class nonrepeting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        int[] count = new int[256];

        for (int i = 0; i < name.length(); i++) {
            count[name.charAt(i)]++;
        }

        char character = 0;
        boolean found = false;
        for (int i = 0; i < name.length(); i++) {
            if (count[name.charAt(i)] == 1) {
                character = name.charAt(i);
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("non  repeting: " + character);
        } else {
            System.out.println("found.");
        }

        scan.close();
    }
}
