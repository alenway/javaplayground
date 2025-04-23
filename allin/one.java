import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter a string: ");
        String name = scan.nextLine();
        System.out.print("enter a character: ");
        char character = scan.next().charAt(0);

        // print

        System.out.println(number);
        System.out.println(name);
        System.out.println(character);

        scan.close();
    }
}
