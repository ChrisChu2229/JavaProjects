package Day_Two_If_Statements;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Rock, Paper, Scissors! Please enter your move (Rock, Paper, or Scissors):");

        String userMove = scanner.nextLine();
        int randomChoice = random.nextInt(3) + 1;

        String computerMove;
        if (randomChoice == 1) {
            computerMove = "Rock";
        } else if (randomChoice == 2) {
            computerMove = "Paper";
        } else {
            computerMove = "Scissors";
        }

        System.out.println("Computer played: " + computerMove);

        if (userMove.equalsIgnoreCase(computerMove)) {
            System.out.println("It's a tie!");
        } else if ((userMove.equalsIgnoreCase("Rock") && computerMove.equals("Scissors")) ||
                (userMove.equalsIgnoreCase("Paper") && computerMove.equals("Rock")) ||
                (userMove.equalsIgnoreCase("Scissors") && computerMove.equals("Paper"))) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }

        scanner.close();
    }
}
