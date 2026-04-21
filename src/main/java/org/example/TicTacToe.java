import java.util.Random;

public class TicTacToe {

    static char player1Symbol;
    static char player2Symbol;
    static char currentPlayer;
    static char[][] board = new char[3][3];

    public static void main(String[] args) {

        // Initialize board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        tossDecide();
        printBoard();
    }

    static void tossDecide() {
        Random rand = new Random();
        int toss = rand.nextInt(2); // 0 or 1

        if (toss == 0) {
            currentPlayer = '1';
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            currentPlayer = '2';
            player1Symbol = 'O';
            player2Symbol = 'X';
        }

        System.out.println("Toss Result:");
        System.out.println("Player " + currentPlayer + " starts first");
        System.out.println("Player 1 Symbol: " + player1Symbol);
        System.out.println("Player 2 Symbol: " + player2Symbol);
    }

    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
