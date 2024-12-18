import java.util.Scanner; // Import Scanner for user input

public class SpiralTraversal { // Main class definition
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input

        // Input dimensions of the matrix
        System.out.print("Enter rows and columns of matrix: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        // Create and populate the matrix
        int[][] matrix = new int[rows][cols];

        // Prompt the user to enter the elements row by row
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt(); // Populate matrix with input
            }
        }

        // Perform spiral traversal
        System.out.print("Spiral Traversal: ");
        spiralTraversal(matrix, rows, cols); // Call helper method
    }

    // Method to perform spiral traversal
    public static void spiralTraversal(int[][] matrix, int rows, int cols) {
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

        while (top <= bottom && left <= right) {
            // Traverse from left to right along the top row
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            // Traverse from top to bottom along the right column
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // Traverse from right to left along the bottom row (if within bounds)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            // Traverse from bottom to top along the left column (if within bounds)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }
}
