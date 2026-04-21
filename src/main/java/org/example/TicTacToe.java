import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static char player1Symbol;
    static char player2Symbol;
    static int currentPlayer;

    public static void main(String[] args) {

        // UC1
        char[][] board = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        System.out.println("Initial Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        // UC2
        tossToDecide();

        // UC3
        int slot = getUserSlot();

        // UC4
        int row = getRowFromSlot(slot);
        int col = getColFromSlot(slot);

        System.out.println("\nConverted Position:");
        System.out.println("Row = " + row);
        System.out.println("Column = " + col);
    }

    // UC2
    static void tossToDecide() {
        Random rand = new Random();
        int toss = rand.nextInt(2);

        if (toss == 0) {
            currentPlayer = 1;
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            currentPlayer = 2;
            player2Symbol = 'X';
            player1Symbol = 'O';
        }

        System.out.println("\nToss Result:");
        System.out.println("Player " + currentPlayer + " starts first");
        System.out.println("Player 1 Symbol: " + player1Symbol);
        System.out.println("Player 2 Symbol: " + player2Symbol);
    }

    // UC3
    static int getUserSlot() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter slot (1-9): ");
        return sc.nextInt();
    }

    // UC4
    static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }

    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }
}