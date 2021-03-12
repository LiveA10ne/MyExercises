import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/3/8 21:01
 */
public class 数字三角形 {
    private static int n;
    private static int[][] digitalTriangle;
    private static int[][] maxPathValue;

    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        digitalTriangle = new int[n + 1][n + 1];
        maxPathValue = new int[n + 1][n + 1];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < i + 1; j++) {
                digitalTriangle[i][j] = scanner.nextInt();
            }
        }
        System.out.println(f(1, 1));
    }

    private static int f(int i, int j){
        if(maxPathValue[i][j] > 0){
            return maxPathValue[i][j];
        }
        if (i == n){
           // maxPathValue[i][j] = digitalTriangle[i][j];
            return digitalTriangle[i][j];
        }
            return maxPathValue[i][j] = digitalTriangle[i][j]+Math.max(f(i+1,j),f(i+1,j+1));
    }

    public static void main(String[] args) {
        solution();
    }
}

/*
递归解法
若递归解法超时
可以尝试用表记录递归每次的结果（动态规划）
 */