public class TicTacToe {

    static char[][] board = {
            {'X', 'O', 'X'},
            {'X', 'O', 'O'},
            {'O', 'X', 'X'}
    };

    public static void main(String[] args) {
        System.out.println(isDraw());
    }

    // UC10 Logic
    public static boolean isDraw() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false; // still moves left
                }
            }
        }

        return true; // no empty cells
    }
}