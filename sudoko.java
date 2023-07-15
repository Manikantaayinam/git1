/*class SudokuValidator {
    public static void main(String[] args) {
        int[][] sudokuGrid = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        boolean isValid = isSudokuValid(sudokuGrid);
        System.out.println("Sudoku validity: " + isValid);
    }

    public static boolean isSudokuValid(int[][] grid) {
        // Check rows
        for (int row = 0; row < 9; row++) {
            if (!isUnique(grid[row])) {
                return false;
            }
        }

        // Check columns
        for (int col = 0; col < 9; col++) {
            int[] columnData = new int[9];
            for (int row = 0; row < 9; row++) {
                columnData[row] = grid[row][col];
            }
            if (!isUnique(columnData)) {
                return false;
            }
        }

        // Check 3x3 sub-grids
        for (int startRow = 0; startRow < 9; startRow += 3) {
            for (int startCol = 0; startCol < 9; startCol += 3) {
                int[] subgridData = new int[9];
                int index = 0;
                for (int row = startRow; row < startRow + 3; row++) {
                    for (int col = startCol; col < startCol + 3; col++) {
                        subgridData[index++] = grid[row][col];
                    }
                }
                if (!isUnique(subgridData)) {
                    return false;
                }
            }
        }

        return true; // Sudoku is valid
    }

    public static boolean isUnique(int[] data) {
        boolean[] visited = new boolean[10];
        for (int num : data) {
            if (num != 0) {
                if (visited[num]) {
                    return false; // Duplicate found
                }
                visited[num] = true;
            }
        }
        return true; // All elements are unique
    }
}*/












import java.util.Scanner;

class SudokuValidator {
    public static void main(String[] args) {
        int[][] sudokuGrid = new int[9][9];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Sudoku grid (9x9):");
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                sudokuGrid[row][col] = scanner.nextInt();
            }
        }

        boolean isValid = isSudokuValid(sudokuGrid);
        System.out.println("Sudoku validity: " + isValid);
    }

    public static boolean isSudokuValid(int[][] grid) {
        // Check rows
        for (int row = 0; row < 9; row++) {
            if (!isUnique(grid[row])) {
                return false;
            }
        }

        // Check columns
        for (int col = 0; col < 9; col++) {
            int[] columnData = new int[9];
            for (int row = 0; row < 9; row++) {
                columnData[row] = grid[row][col];
            }
            if (!isUnique(columnData)) {
                return false;
            }
        }

        // Check 3x3 sub-grids
        for (int startRow = 0; startRow < 9; startRow += 3) {
            for (int startCol = 0; startCol < 9; startCol += 3) {
                int[] subgridData = new int[9];
                int index = 0;
                for (int row = startRow; row < startRow + 3; row++) {
                    for (int col = startCol; col < startCol + 3; col++) {
                        subgridData[index++] = grid[row][col];
                    }
                }
                if (!isUnique(subgridData)) {
                    return false;
                }
            }
        }

        return true; // Sudoku is valid
    }

    public static boolean isUnique(int[] data) {
        boolean[] visited = new boolean[10];
        for (int num : data) {
            if (num != 0) {
                if (visited[num]) {
                    return false; // Duplicate found
                }
                visited[num] = true;
            }
        }
        return true; // All elements are unique
    }
}

