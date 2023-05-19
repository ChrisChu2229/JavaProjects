package Day_Five_Arrays;

import java.util.Scanner;

public class TicTacToeArray {
    private static final char EMPTY = '-'; // Symbol representing an empty cell
    private static final char PLAYER_X = 'X'; // Symbol representing Player X
    private static final char PLAYER_O = 'O'; // Symbol representing Player O

    public static void main(String[] args) {
        char[] board = new char[9]; // Array representing the Tic-Tac-Toe board
        initializeBoard(board); // Initialize the board with empty cells
        printBoard(board); // Print the initial board state

        char currentPlayer = PLAYER_X; // Player X starts the game
        Scanner scanner = new Scanner(System.in);
        boolean gameFinished = false; // Flag to indicate if the game is finished

        while (!gameFinished) {
            System.out.println("Player " + currentPlayer + ", enter your move (1-9): ");
            int position = scanner.nextInt() - 1; // Read the player's move as an index (0-8)

            if (board[position] == EMPTY) { // Check if the selected cell is empty
                board[position] = currentPlayer; // Place the player's symbol in the selected cell
                printBoard(board); // Print the updated board state

                if (hasWon(board, currentPlayer)) { // Check if the current player has won
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameFinished = true; // Set the gameFinished flag to true to end the game
                } else if (isBoardFull(board)) { // Check if the board is full (draw)
                    System.out.println("It's a draw!");
                    gameFinished = true; // Set the gameFinished flag to true to end the game
                } else {
                    currentPlayer = (currentPlayer == PLAYER_X) ? PLAYER_O : PLAYER_X; // Switch players
                }
            } else {
                System.out.println("Invalid move, try again."); // The selected cell is not empty
            }
        }
    }

    private static void initializeBoard(char[] board) {
        for (int i = 0; i < board.length; i++) {
            board[i] = EMPTY; // Set all cells to the empty symbol
        }
    }

    private static void printBoard(char[] board) {
        for (int i = 0; i < board.length; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println(); // Print a new line after every 3 cells
            }
            System.out.print(board[i] + " "); // Print the symbol of each cell
        }
        System.out.println(); // Print a new line at the end
    }

    private static boolean hasWon(char[] board, char player) {
        // Check rows
        for (int i = 0; i < 9; i += 3) {
            if (board[i] == player && board[i + 1] == player && board[i + 2] == player) {
                return true; // Found a winning combination in a row
            }
        }

        // Check columns
        for (int i = 0; i < 3; i++) {
            if (board[i] == player && board[i + 3] == player && board[i + 6] == player) {
                return true; // Found a winning combination in a column
            }
        }

        // Check diagonals
        if (board[0] == player && board[4] == player && board[8] == player) {
            return true; // Found a winning combination in the main diagonal
        }
        if (board[2] == player && board[4] == player && board[6] == player) {
            return true; // Found a winning combination in the anti-diagonal
        }

        return false; // No winning combinations found
    }

    private static boolean isBoardFull(char[] board) {
        for (char cell : board) {
            if (cell == EMPTY) {
                return false; // Found an empty cell, board is not full
            }
        }
        return true; // No empty cells found, board is full
    }
}
