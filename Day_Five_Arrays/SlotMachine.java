package Day_Five_Arrays;

import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {
        // Define the symbols
        String[] symbols = { "Cherry", "Lemon", "Orange", "Bell", "7", "Bar" };

        // Initialize player's money
        int playerMoney = 100;

        // Start the game
        Scanner scanner = new Scanner(System.in);
        while (playerMoney > 0) {
            System.out.println("You have $" + playerMoney + ". Enter your bet:");

            // Error checking for the bet
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // consume the invalid input
                continue;
            }
            int bet = scanner.nextInt();
            scanner.nextLine(); // consume newline left-over

            if (bet <= 0) {
                System.out.println("Invalid bet. Please enter a positive number.");
                continue;
            } else if (bet > playerMoney) {
                System.out.println("You don't have enough money. Please enter a smaller bet.");
                continue;
            }

            playerMoney -= bet;

            // Spin the slot machine
            Random random = new Random();
            String[] result = new String[3];
            for (int i = 0; i < 3; i++) {
                result[i] = symbols[random.nextInt(symbols.length)];
            }

            // Print the result
            System.out.println(result[0] + " " + result[1] + " " + result[2]);

            // Check for matches
            if (result[0].equals(result[1]) && result[0].equals(result[2])) {
                // All 3 symbols match
                playerMoney += bet * 3;
                System.out.println("Congratulations! You won $" + (bet * 3));
            } else if (result[0].equals(result[1]) || result[0].equals(result[2]) || result[1].equals(result[2])) {
                // 2 symbols match
                playerMoney += bet * 2;
                System.out.println("Congratulations! You won $" + (bet * 2));
            } else {
                System.out.println("Sorry, you lost. Try again!");
            }
        }

        System.out.println("You're out of money. Game over!");

        scanner.close();
    }
}
