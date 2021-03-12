import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/2/25 10:58
 */
public class _29高精度加法 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        BigInteger a = new BigInteger(scanner.next());
        BigInteger b = new BigInteger(scanner.next());
        System.out.println(a.add(b));
    }

    public static void main(String[] args) {
        solution();
    }
}
