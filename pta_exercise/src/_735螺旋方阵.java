import java.util.Scanner;

public class _735螺旋方阵 {
    public static void main(String[] args) {
        f();
    }

    public static void f() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][] matrix = new int[n][n];
        int num = 0;
        for (int i = 0; i < n / 2 + 1; i++) {
            for (int j = i; j <= n - i - 1; j++) {
                matrix[i][j] = ++num;
            }
            for (int j = i+1; j < n-i; j++) {
                matrix[j][n-i-1] = ++num;
            }
            for (int j = n-i-2; j >=i; j--) {
                matrix[n-i-1][j] = ++num;
            }
            for (int j = n-i-2; j >=i+1; j--) {
                matrix[j][i] = ++num;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.printf("%3d",matrix[i][j]);
            }
            System.out.println();
        }
    }
}
