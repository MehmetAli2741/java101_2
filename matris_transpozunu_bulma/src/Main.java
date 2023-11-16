import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] transpose = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Matris: ");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("Transpozu: ");
        for (int[] row : transpose) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}