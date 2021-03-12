import java.util.Scanner;

public class _733方阵循环右移 {
    public static void main(String[] args) {
        function();
    }

    public static void function() {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int [][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int [][] newMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                newMatrix[i][j] = matrix[i][(j - m + 5*n) % n];
            }
        }

        int i =0;
        for (int[] r :
                newMatrix) {
            for (int c :
                    r) {

                if (++i % n == 0)
                    System.out.print(c+" "+"\n");
                else
                    System.out.print(c+" ");
            }
        }
    }
}
