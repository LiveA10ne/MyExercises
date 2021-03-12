import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/2/24 19:47
 */
public class _02序列求和 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        BigInteger n = BigInteger.valueOf(scanner.nextInt());
        BigInteger firstItem = BigInteger.valueOf(1);

        BigInteger result = firstItem.add(n).multiply(n).divide(BigInteger.valueOf(2));
        System.out.println(result);
    }

    public static void main(String[] args) {
        solution();
    }
}
