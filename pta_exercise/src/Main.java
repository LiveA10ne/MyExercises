import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/3/3 20:54
 */
public class Main {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        BigInteger bigInteger1 = new BigInteger(scanner.next());
        BigInteger bigInteger2 = new BigInteger(scanner.next());
        BigInteger gcd = bigInteger1.gcd(bigInteger2);
        BigInteger lcm = bigInteger1.multiply(bigInteger2).divide(gcd);
        System.out.println(lcm);
    }
    public static void main(String[] args) {
        solution();
    }
}
