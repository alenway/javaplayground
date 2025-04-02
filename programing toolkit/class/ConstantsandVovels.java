import java.util.Scanner;

public class ConstantsandVovels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int[] counts = countVowelsAndConsonants(input);
        System.out.println("Vowel count: " + counts[0]);
        System.out.println("Consonant count: " + counts[1]);
        scanner.close();
    }

    public static int[] countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        return new int[] { vowels, consonants };
    }
}
