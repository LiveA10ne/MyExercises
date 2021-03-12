import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/2/24 20:14
 */
public class _30阶乘计算 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        BigInteger n = BigInteger.valueOf(scanner.nextInt());
        System.out.println(factorial(n));
    }

    private static BigInteger factorial(BigInteger n){
        if (n.compareTo(BigInteger.valueOf(1)) == 0)
            return BigInteger.valueOf(1);
        return factorial(n.subtract(BigInteger.valueOf(1))).multiply(n);
    }

    public static void main(String[] args) {
        solution();
    }
}
