import java.util.Random;

public class TicTacToe {

    static char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    public static void main(String[] args) {

        int moves = 0;

        while (!gameOver) {

            if (isHumanTurn) {
                System.out.println("Human turn");
                placeMove(0, 0, 'X'); // sample move
            } else {
                System.out.println("Computer turn");
                computerMove();
            }

            printBoard();
            moves++;

            // stop condition (basic)
            if (moves == 9) {
                gameOver = true;
                System.out.println("Game Draw!");
            }

            // switch turn
            isHumanTurn = !isHumanTurn;
        }
    }

    public static boolean isValidMove(int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2) return false;
        if (board[row][col] != '-') return false;
        return true;
    }

    public static void placeMove(int row, int col, char symbol) {
        if (isValidMove(row, col)) {
            board[row][col] = symbol;
        }
    }

    public static void computerMove() {
        Random rand = new Random();
        int row, col;

        while (true) {
            int slot = rand.nextInt(9) + 1;
            row = (slot - 1) / 3;
            col = (slot - 1) % 3;

            if (isValidMove(row, col)) {
                placeMove(row, col, 'O');
                break;
            }
        }
    }

    public static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}