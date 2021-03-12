import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/2/23 16:02
 */
public class _11十六进制转十进制 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        String hexDecimal = scanner.next();
        System.out.println(new BigInteger(hexDecimal,16).toString(10));
    }

    public static void main(String[] args) {
        solution();
    }
}
