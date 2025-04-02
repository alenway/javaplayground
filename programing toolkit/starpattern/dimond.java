import java.util.Scanner;

public class dimond {
    public static void main(String[] args) {
        Scanner scna = new Scanner(System.in);
        System.out.println("Enter the lenght of an dimond.");
        int val = scna.nextInt();

        for (int i = 1; i <= val; i++) {
            for (int j = 1; j <= val; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
