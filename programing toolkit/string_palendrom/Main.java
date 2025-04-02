import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                try {
                    System.out.println("Enter a string to check if it's a palindrome: ");
                    String value = read.readLine();
                    System.out.println(isPalindrome(value));
                } catch (IOException e) {
                    System.out.println("Error reading input: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Error initializing input reader: " + e.getMessage());
        }
    }

    static String isPalindrome(String value) {
        // Handle null or empty string case
        if (value == null || value.isEmpty()) {
            return "Enter a String.";
        }

        // Remove non-alphanumeric characters and convert to lowercase for accurate
        // checking
        String cleanedValue = value.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // More efficient palindrome check
        int left = 0;
        int right = cleanedValue.length() - 1;

        while (left < right) {
            if (cleanedValue.charAt(left) != cleanedValue.charAt(right)) {
                return "Not a Palindrome";
            }
            left++;
            right--;
        }

        return "Palindrome";
    }
}
