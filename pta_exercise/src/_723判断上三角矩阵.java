import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/2/21 13:29
 */
public class _723判断上三角矩阵 {
    private static void f(){
        int countOfMatrix;
        int n;
        ArrayList<int[][]> matrixList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        countOfMatrix = scanner.nextInt();

        for (int i = 0; i < countOfMatrix; i++) {
            n = scanner.nextInt();
            int[][] matrix = new int[n][n];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    matrix[j][k] = scanner.nextInt();
                }
            }
            matrixList.add(matrix);
        }

        for (int[][] matrix :
                matrixList) {
            if (isUpperTriMatrix(matrix)) {
                System.out.println("YES");
            }else System.out.println("NO");
        }


    }

    private static boolean isUpperTriMatrix(int[][] matrix){
        boolean trigger = true;
        double n = Math.sqrt(matrix.length);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] != 0) {
                    trigger = false;
                    break;
                }
            }
        }
        return trigger;
    }

    public static void main(String[] args) {
        f();
    }
}
