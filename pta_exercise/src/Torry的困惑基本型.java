import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/3/16 12:56
 */
public class Torry的困惑基本型 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int result = 1;
        int num = 2;
        for (int i = 0; i < n; i++) {
            while (!BigInteger.valueOf(num).isProbablePrime(4)){
                num++;
            }
            result = (result  * (num % 50000)) % 50000;
            num++;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        solution();
    }
}
