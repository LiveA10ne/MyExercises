import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/2/24 16:25
 */
public class _04Fibonacci数列 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(f(n) % 10007);
    }

    private static long f(int n){
        if (n == 1 || n == 2)
            return 1;
        return f(n - 1) + f(n - 2);
    }

    public static void main(String[] args) {
        solution();
    }
}
