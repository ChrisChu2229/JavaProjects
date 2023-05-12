package Lessons_and_Projects.Day_Five_Arrays;

import java.util.Scanner;

public class TicTacToeArray {
    private static final char EMPTY = '-';
    private static final char PLAYER_X = 'X';
    private static final char PLAYER_O = 'O';

    public static void main(String[] args) {
        char[] board = new char[9];
        initializeBoard(board);
        printBoard(board);

        char currentPlayer = PLAYER_X;
        Scanner scanner = new Scanner(System.in);
        boolean gameFinished = false;

        while (!gameFinished) {
            System.out.println("Player " + currentPlayer + ", enter your move (1-9): ");
            int position = scanner.nextInt() - 1;

            if (board[position] == EMPTY) {
                board[position] = currentPlayer;
                printBoard(board);

                if (hasWon(board, currentPlayer)) {
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameFinished = true;
                } else if (isBoardFull(board)) {
                    System.out.println("It's a draw!");
                    gameFinished = true;
                } else {
                    currentPlayer = (currentPlayer == PLAYER_X) ? PLAYER_O : PLAYER_X;
                }
            } else {
                System.out.println("Invalid move, try again.");
            }
        }
    }

    private static void initializeBoard(char[] board) {
        for (int i = 0; i < board.length; i++) {
            board[i] = EMPTY;
        }
    }

    private static void printBoard(char[] board) {
        for (int i = 0; i < board.length; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println();
            }
            System.out.print(board[i] + " ");
        }
        System.out.println();
    }

    private static boolean hasWon(char[] board, char player) {
        // Check rows
        for (int i = 0; i < 9; i += 3) {
            if (board[i] == player && board[i + 1] == player && board[i + 2] == player) {
                return true;
            }
        }

        // Check columns
        for (int i = 0; i < 3; i++) {
            if (board[i] == player && board[i + 3] == player && board[i + 6] == player) {
                return true;
            }
        }

        // Check diagonals
        if (board[0] == player && board[4] == player && board[8] == player) {
            return true;
        }
        if (board[2] == player && board[4] == player && board[6] == player) {
            return true;
        }

        return false;
    }

    private static boolean isBoardFull(char[] board) {
        for (char cell : board) {
            if (cell == EMPTY) {
                return false;
            }
        }
        return true;
    }
}
