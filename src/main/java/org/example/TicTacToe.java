public class TicTacToe {

    static char[][] board = new char[3][3];
    static char currentPlayer = 'X';

    public static void main(String[] args) {

        // Initialize board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        // Example moves (you can change these)
        int row = 1;
        int col = 1;

        if (isValidMove(row, col)) {
            board[row][col] = currentPlayer;
            System.out.println("Move accepted!");
        } else {
            System.out.println("Move rejected!");
        }

        printBoard();
    }

    // UC5: Validate Move
    public static boolean isValidMove(int row, int col) {

        // Boundary check
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            System.out.println("Invalid move: Out of bounds");
            return false;
        }

        // Check empty cell
        if (board[row][col] != '-') {
            System.out.println("Invalid move: Cell already occupied");
            return false;
        }

        return true;
    }

    // Print Board (reuse from UC1)
    public static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}