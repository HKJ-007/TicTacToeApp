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

        int row = 1;
        int col = 1;

        if (isValidMove(row, col)) {
            placeMove(row, col, currentPlayer);
            System.out.println("Move placed!");
        } else {
            System.out.println("Invalid move!");
        }

        printBoard();
    }

    // UC5 reused
    public static boolean isValidMove(int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2) return false;
        if (board[row][col] != '-') return false;
        return true;
    }

    // UC6 Logic
    public static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
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