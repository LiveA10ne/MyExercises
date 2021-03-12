import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/3/2 13:13
 */
public class _23芯片测试 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
                if (i == j){
                    matrix[i][j] = 0;
                }
            }
        }


        for (int j = 0; j < n; j++) {
            int countOfGoodChips = 1;
            for (int i = 0; i < n; i++) {
                countOfGoodChips += matrix[i][j];
            }
            if (countOfGoodChips > (n /2)) {
                System.out.print(j + 1 + " ");
            }
        }
    }

    public static void main(String[] args) {
        solution();
    }
}
