import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        boolean playAgain = true;

        while (playAgain) {
            System.out.println("Guess the Random value from 1-100.");
            boolean hasGuessedCorrectly = false;
            int randValue = rand.nextInt(100) + 1;
            int attemptLeft = 5;

            while (attemptLeft > 0 && !hasGuessedCorrectly) {
                System.out.printf("%d turn(s) left. Enter a number: ", attemptLeft);
                int userInput = getUserInput(scan);

                if (userInput >= 1 && userInput <= 100) {
                    hasGuessedCorrectly = checkGuess(userInput, randValue);
                    if (hasGuessedCorrectly) {
                        System.out.println("Congratulations! You guessed the number.");
                    } else {
                        attemptLeft--;
                    }
                } else {
                    System.out.println("Enter a number inside the 1-100 range.");
                }
            }
            if (!hasGuessedCorrectly) {
                System.out.println("Sorry, you didn't guess the number. The correct number was " + randValue + ".");
            }
            playAgain = askToPlayAgain(scan);

            scan.close();
        }
    }

    public static int getUserInput(Scanner scan) {
        while (!scan.hasNextLine()) {
            System.out.println("Invalid input. Please enter a number.");
            scan.next();
        }
        int userInput = scan.nextInt();
        scan.nextLine();
        return userInput;
    }

    public static boolean checkGuess(int userInput, int randValue) {
        if (userInput == randValue) {
            return true;
        } else if (userInput > randValue) {
            System.out.println("Number is too large.");
        } else {
            System.out.println("Number is tool small.");
        }
        return false;
    }

    public static boolean askToPlayAgain(Scanner scan) {
        System.out.print("Do you want to play again? (yes/no): ");
        String playAgainInput = scan.nextLine();
        return playAgainInput.equalsIgnoreCase("yes");
    }
}
