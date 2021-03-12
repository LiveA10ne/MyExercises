import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/2/23 16:05
 */
public class _十进制转十六进制 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        String decimal = scanner.next();
        System.out.println(new BigInteger(decimal, 10).toString(16).toUpperCase());
    }

    public static void main(String[] args) {
        solution();
    }
}
