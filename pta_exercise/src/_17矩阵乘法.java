import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/3/2 20:14
 */
public class _17矩阵乘法 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //矩阵阶数
        int index = scanner.nextInt(); //矩阵乘方的指数
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        if (index == 0){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i!=j){
                        System.out.print(0+" ");
                        continue;
                    }
                    System.out.print(1+" ");
                }
                System.out.println();
            }
            return;
        }

        int[][] matrix1 = matrix;
        for (int i = 0; i < index - 1; i++) {
            matrix1 = matrixMultiplication(matrix1,matrix);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }


    }

    private static int[][] matrixMultiplication(int[][] matrix1, int[][] matrix2){
        int n = matrix1.length;
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    matrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        solution();
    }
}
