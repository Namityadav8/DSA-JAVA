public class sudokusolver {

    public static final int GRID_SIZE = 9;

    public static void main(String[] args) {

        int[][] board = {
                {7, 0, 0, 0, 0, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 9, 3, 0, 0},
                {0, 0, 4, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 6, 0, 2, 0, 0, 8},
                {0, 0, 0, 4, 0, 1, 0, 0, 0},
                {5, 0, 0, 9, 0, 3, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 8, 0, 0},
                {0, 0, 9, 1, 0, 0, 0, 0, 0},
                {0, 0, 7, 0, 0, 0, 0, 0, 5}
        };

        if (solveSudoku(board)) {
            System.out.println("Sudoku solved successfully!");
        } else {
            System.out.println("Unsolvable Sudoku!");
        }

        printBoard(board);
    }

    public static boolean solveSudoku(int[][] board) {
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {
                if (board[row][col] == 0) {
                    for (int num = 1; num <= GRID_SIZE; num++) {
                        if (isValidPlacement(board, num, row, col)) {
                            board[row][col] = num;

                            if (solveSudoku(board)) {
                                return true;
                            }

                            board[row][col] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValidPlacement(int[][] board, int num, int row, int col) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }

        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

        int subgridRowStart = row / 3 * 3;
        int subgridColStart = col / 3 * 3;
        for (int i = subgridRowStart; i < subgridRowStart + 3; i++) {
            for (int j = subgridColStart; j < subgridColStart + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void printBoard(int[][] board) {
        for (int row = 0; row < GRID_SIZE; row++) {
            if (row % 3 == 0 && row != 0) {
                System.out.println("-----------");
            }
            for (int col = 0; col < GRID_SIZE; col++) {
                if (col % 3 == 0 && col != 0) {
                    System.out.print("|");
                }
                System.out.print(board[row][col] == 0 ? " " : board[row][col]);
            }
            System.out.println();
        }
    }
}
