package Arrays;

import java.util.Random;
import java.util.Scanner;

public class BlackJack {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int[] deck = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10,
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10,
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10,
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10 };
        shuffleDeck(deck);

        int playerHand = dealInitialHand(deck, rand);
        int dealerHand = dealInitialHand(deck, rand);

        playerHand = playPlayerTurn(deck, scan, rand, playerHand);
        if (playerHand > 21) {
            System.out.println("Player busts with " + playerHand + ". Dealer wins.");
        } else {
            dealerHand = playDealerTurn(deck, rand, dealerHand);
            if (dealerHand > 21) {
                System.out.println("Dealer busts with " + dealerHand + ". Player wins.");
            } else {
                compareHandsAndDeclareWinner(playerHand, dealerHand);
            }
        }

        scan.close();
    }

    private static void shuffleDeck(int[] deck) {
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int j = rand.nextInt(deck.length);
            int temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }

    private static int dealInitialHand(int[] deck, Random rand) {
        return deck[rand.nextInt(deck.length)] + deck[rand.nextInt(deck.length)];
    }

    private static int playPlayerTurn(int[] deck, Scanner scan, Random rand, int playerHand) {
        while (playerHand < 21) {
            System.out.println("Your hand: " + playerHand);
            System.out.println("Hit? (Y/N)");
            String decision = scan.nextLine().toLowerCase();
            if (decision.equals("y")) {
                playerHand += deck[rand.nextInt(deck.length)];
            } else {
                break;
            }
        }
        return playerHand;
    }

    private static int playDealerTurn(int[] deck, Random rand, int dealerHand) {
        while (dealerHand < 17) {
            dealerHand += deck[rand.nextInt(deck.length)];
        }
        return dealerHand;
    }

    private static void compareHandsAndDeclareWinner(int playerHand, int dealerHand) {
        System.out.println("Player's hand: " + playerHand);
        System.out.println("Dealer's hand: " + dealerHand);
        if (playerHand > dealerHand) {
            System.out.println("Player wins!");
        } else if (dealerHand > playerHand) {
            System.out.println("Dealer wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}
