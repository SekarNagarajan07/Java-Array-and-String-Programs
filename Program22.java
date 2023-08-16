//22. Transpose the matrix (rows to columns &amp; columns to row)?
class Program22 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int [][] transpose = new int[matrix.length][matrix.length];

        for (int i = 0;i<matrix.length;i++){
            for (int j = 0;j<matrix.length;j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transpose Matrix");
        for (int i = 0;i<matrix.length;i++){
            for (int j = 0;j<matrix.length;j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
