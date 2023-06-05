package Day_Three_Iteration;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of letters you want in your password:");
        int numLetters = scanner.nextInt();

        System.out.println("Enter the number of numbers you want in your password:");
        int numNumbers = scanner.nextInt();

        System.out.println("Enter the number of symbols you want in your password:");
        int numSymbols = scanner.nextInt();

        System.out.println(generatePassword(numLetters, numNumbers, numSymbols));
        scanner.close();
    }

    /* new topic: method with parameters */
    private static String generatePassword(int numLetters, int numNumbers, int numSymbols) {
        // Define all possible characters
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String letters = upperCaseLetters + lowerCaseLetters;
        String numbers = "0123456789";
        String symbols = "!@#$%^&*_=+-/.?<>)";

        Random random = new Random();
        StringBuilder password = new StringBuilder(); /* new topic: string builder */

        for (int i = 0; i < numLetters; i++) {
            int randomIndex = random.nextInt(letters.length());
            password.append(letters.charAt(randomIndex)); /*
                                                           * new topic: charAt method which gets the letter at a
                                                           * specific index
                                                           */
        }

        for (int i = 0; i < numNumbers; i++) {
            int randomIndex = random.nextInt(numbers.length());
            password.append(numbers.charAt(randomIndex));
        }

        for (int i = 0; i < numSymbols; i++) {
            int randomIndex = random.nextInt(symbols.length());
            password.append(symbols.charAt(randomIndex));
        }

        return password.toString(); /*
                                     * turn the password to a string because string builder and string are different
                                     */
    }
}
