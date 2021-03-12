import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/2/26 10:43
 */
public class _25回型取数 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt(), n = scanner.nextInt();
        int[][] matrix = new int[m+1][n+1];
        for (int i = 1; i < m+1; i++) {
            for (int j = 1; j < n+1; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int uEdge = 1, dEdge = m, lEdge = 1, rEdge = n; //设置边界
        int r = 1 ,c = 1; //行列坐标
        int count = 0; //计数
        StringBuilder stringBuilder = new StringBuilder();
        while (count < m * n){
            if (count == m*n-1){
                stringBuilder.append(matrix[r][c]);
                break;
            }
            while (count < m * n && r < dEdge){
                stringBuilder.append(matrix[r][c]).append(" ");
                r++;
                count++;
            }
            while (count < m * n && c < rEdge){
                stringBuilder.append(matrix[r][c]).append(" ");
                c++;
                count++;
            }
            while (count < m * n && r > uEdge){
                stringBuilder.append(matrix[r][c]).append(" ");
                r--;
                count++;
            }
            while (count < m * n && c > lEdge){
                stringBuilder.append(matrix[r][c]).append(" ");
                c--;
                count++;
            }

            uEdge++;
            dEdge--;
            lEdge++;
            rEdge--;
            r++;
            c++;

        }
        System.out.println(stringBuilder.toString().trim());

    }

    public static void main(String[] args) {
        solution();
    }
}
