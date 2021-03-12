import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/2/24 10:05
 */
public class _6杨辉三角形 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(combination(j,i)+" ");
            }
            System.out.println();
        }
    }

    //组合
    private static BigInteger combination(int m, int n){
        return factorial(n).divide((factorial(m).multiply(factorial(n - m))));
    }

    //阶乘
    private static BigInteger factorial(long n){
        if (n <= 1)
            return BigInteger.valueOf(1);
        return BigInteger.valueOf(n).multiply(factorial(n -1));
    }

    public static void main(String[] args) {
        solution();
    }
}
