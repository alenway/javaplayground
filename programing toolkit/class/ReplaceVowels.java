import java.util.Scanner;

public class ReplaceVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String modifiedString = replaceVowelsWithAsterisk(input);
        System.out.println("Modified String: " + modifiedString);
        scanner.close();
    }

    public static String replaceVowelsWithAsterisk(String str) {
        return str.replaceAll("(?i)[aeiou]", "*");
    }
}
