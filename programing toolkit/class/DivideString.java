import java.util.Scanner;

public class DivideString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter number of parts: ");
        int n = scanner.nextInt();

        divideStringIntoParts(str, n);
        scanner.close();
    }

    public static void divideStringIntoParts(String str, int n) {
        int length = str.length();

        // If string cannot be divided into equal parts
        if (length % n != 0) {
            System.out.println("Cannot divide string into equal parts.");
            return;
        }

        int partSize = length / n;
        System.out.println("Divided parts:");

        for (int i = 0; i < length; i += partSize) {
            System.out.println(str.substring(i, i + partSize));
        }
    }
}
