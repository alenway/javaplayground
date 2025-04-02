import java.util.HashMap;
import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        countCharacters(str);
        scanner.close();
    }

    public static void countCharacters(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Counting characters
        for (char ch : str.toCharArray()) {
            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                charCountMap.put(ch, 1);
            }
        }

        // Display the character counts
        System.out.println("Character counts:");
        for (char ch : charCountMap.keySet()) {
            System.out.println(ch + " : " + charCountMap.get(ch));
        }
    }
}
