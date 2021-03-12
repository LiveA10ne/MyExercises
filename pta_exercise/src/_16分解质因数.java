import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/2/26 15:06
 */
public class _16分解质因数 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a; i < b + 1; i++) {
            System.out.println(i+"="+primeFactorization(i));
        }

    }

    private static String primeFactorization(int n){
        StringBuilder express = new StringBuilder();
        if (BigInteger.valueOf(n).isProbablePrime(8)){
            return String.valueOf(n);
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0 && BigInteger.valueOf(i).isProbablePrime(8)){
                express.append(i).append("*");
                n /= i;
                break;
            }
        }
        express.append(primeFactorization(n));
        return express.toString();
    }

    public static void main(String[] args) {
        solution();
    }
}
