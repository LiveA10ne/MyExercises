import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/3/15 19:17
 */
public class 矩阵乘法 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt() ,
                s = scanner.nextInt(),
                    n = scanner.nextInt();
        int[][] matrix1 = new int[m][s] ;
        int[][] matrix2 = new int[s][n];
        int[][] matrixMul = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < s; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < n; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n ; j++) {
                for (int k = 0; k < s ; k++) {
                    matrixMul[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrixMul[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solution();
    }
}
