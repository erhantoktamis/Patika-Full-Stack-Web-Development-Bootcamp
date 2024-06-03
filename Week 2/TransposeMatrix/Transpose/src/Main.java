
public class Main {
    // Matrisin transpozunu bulan metod
    public static int[][] findTranspose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        // Transpoz matrisi için yeni bir matris oluşturma
        int[][] transposeMatrix = new int[cols][rows];
        // for each döngüsü kullanarak transpozunu bulma
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        return transposeMatrix;
    }
    // Matrisi ekrana yazdıran metod
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        // Matrisin transpozunu bulmak için metod çağrısı
        int[][] transposeMatrix = findTranspose(matrix);

        // Matris ve transpozunu ekrana yazdırma
        System.out.println("Orjinal Matris:");
        printMatrix(matrix);

        System.out.println("\nTranspoze Matris:");
        printMatrix(transposeMatrix);

    }
}
