import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/3/6 19:42
 */
public class 大等于n的最小完全平方数 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        BigInteger n = new BigInteger(scanner.next());
        double sqrt = Math.sqrt(n.doubleValue());
        if (sqrt % 1 == 0){
            System.out.println(n);
            return;
        }
        long v = (long) (Math.floor(sqrt) + 1);
        BigInteger bigInteger = BigInteger.valueOf(v);
        System.out.println(bigInteger.pow(2));
    }

    public static void main(String[] args) {
        solution();
    }
}
