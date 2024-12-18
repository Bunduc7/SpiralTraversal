import java.util.Scanner; // Import Scanner for user input

public class SpiralTraversal { // Main class definition
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input
    }
}
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

