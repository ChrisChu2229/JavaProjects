package Arrays;

import java.util.Random;

public class SimpleBlackjack {

    private static final int DECK_SIZE = 52;
    private static final String[] SUITS = { "Spades", "Hearts", "Diamonds", "Clubs" };
    private static final String[] RANKS = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King",
            "Ace" };

    private static String[] deck = new String[DECK_SIZE];
    private static int deckIndex = 0;

    private static String[] playerHand = new String[DECK_SIZE];
    private static int playerIndex = 0;

    private static String[] dealerHand = new String[DECK_SIZE];
    private static int dealerIndex = 0;

    public static void main(String[] args) {
        createDeck();
        shuffleDeck();

        // Deal initial cards
        playerHand[playerIndex++] = dealCard();
        dealerHand[dealerIndex++] = dealCard();
        playerHand[playerIndex++] = dealCard();
        dealerHand[dealerIndex++] = dealCard();

        System.out.println("Player's cards: " + String.join(", ", playerHand));
        System.out.println("Dealer's cards: " + dealerHand[0] + ", ?");

        // For simplicity, player always stands, dealer hits until they have at least 17
        while (handValue(dealerHand) < 17) {
            dealerHand[dealerIndex++] = dealCard();
        }

        System.out.println("Dealer's final hand: " + String.join(", ", dealerHand));

        // Compare hand values
        int playerValue = handValue(playerHand);
        int dealerValue = handValue(dealerHand);
        if (playerValue > 21 || (dealerValue <= 21 && dealerValue > playerValue)) {
            System.out.println("Dealer wins!");
        } else if (dealerValue > 21 || playerValue > dealerValue) {
            System.out.println("Player wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }

    private static void createDeck() {
        for (int i = 0; i < DECK_SIZE; i++) {
            deck[i] = RANKS[i % 13] + " of " + SUITS[i / 13];
        }
    }

    private static void shuffleDeck() {
        Random random = new Random();
        for (int i = 0; i < DECK_SIZE; i++) {
            int j = random.nextInt(DECK_SIZE);
            String temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }

    private static String dealCard() {
        return deck[deckIndex++];
    }

    private static int handValue(String[] hand) {
        int value = 0;
        int aces = 0;

        for (int i = 0; i < hand.length && hand[i] != null; i++) {
            String rank = hand[i].split(" ")[0];
            if (rank.equals("Ace")) {
                aces++;
                value += 11;
            } else if (rank.equals("King") || rank.equals("Queen") || rank.equals("Jack")) {
                value += 10;
            } else {
                value += Integer.parseInt(rank);
            }
        }

        while (value > 21 && aces > 0) {
            value -= 10;
            aces--;
        }

        return value;
    }
}
