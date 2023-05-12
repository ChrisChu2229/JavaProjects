package Lessons_and_Projects.Trial_Day_or_Day_One;

import java.util.Scanner;
import java.util.Random;

public class NumberGuess {

    public static void main(String[] args) {

        Random rand = new Random();

        int random_number = rand.nextInt(10);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your guess between 1 and 10: ");

        int user_guess = Integer.parseInt(scanner.nextLine());

        if (random_number == user_guess) {
            System.out.println("You guessed the right number!");
        } else {
            System.out.println("You didn't get the right number :(");
            System.out.println("The correct answer was: " + random_number);
        }
        scanner.close();

    }

}
