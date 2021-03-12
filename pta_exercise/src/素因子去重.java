import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/3/7 18:44
 */
public class 素因子去重 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long tag = n;
        long p = 1;
        for (long i = 2; i <= n; i++) {
            if ( n % i == 0){
                p *= i;
                while (n % i == 0){
                    n /= i;
                }
            }
        }
        System.out.println(p);
    }

    public static void main(String[] args) {
        solution();
    }
}
