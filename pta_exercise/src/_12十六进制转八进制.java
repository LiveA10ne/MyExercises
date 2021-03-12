import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/2/23 15:38
 */
public class _12十六进制转八进制 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.next();
        }

        for (String s :
                array) {
            System.out.println(new BigInteger(s,16).toString(8));
        }
    }

    public static void main(String[] args) {
        solution();
    }
}
