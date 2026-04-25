import java.util.*;

public class Main {
    
    public static void CreationOf2dArrays() {
        int matrix[][] = new int[3][3];
        int n = 3, m = 3;
        //int n = matrix.length, m = matrix[0].length

        //input
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix, 5);
    }

    public static boolean search(int matrix[][], int key) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                    System.out.println("Found at cell " + i + "," + j);
                    return true;
                }
            }
        }
        System.out.print("Key not found!");
        return false;       
    }

    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;

        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while(startRow <= endRow && startCol <= endCol) {
            //top
            for(int i = startCol; i <= endCol; i++) {
                System.out.print(matrix[startRow][i] + " ");
            }

            //right
            for(int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            //bottom
            for(int i = endCol - 1; i >= startCol; i--) {
                if(startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][i] + " ");
            }

            //left
            for(int i = endRow - 1; i >= startRow+1; i--) {
                if(startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }
    
    public static void main(String args[]) {
        // CreationOf2dArrays();

        // 2D Arrays in Memory
        /* Computer memory is linear, so 2D arrays must be adapted to fit.

        In Row-Major Order (used by C/C++ and Python), the matrix is stored row by row in a single continuous block of memory. The system saves the entire first row, immediately followed by the second row, and so on.

        In Column-Major Order (used by Fortran), the matrix is stored column by column in a single continuous block. The system saves the entire first column, followed immediately by the second column.

        In the Array of Arrays approach (used by Java), memory is not continuous. The main array simply holds references or pointers. Each reference points to an independent 1D array located elsewhere in memory, which acts as a row. Because these rows are allocated separately, they can have different lengths, allowing for jagged arrays. */

        //Spiral Matrix
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        printSpiral(matrix);
        
    }
}
