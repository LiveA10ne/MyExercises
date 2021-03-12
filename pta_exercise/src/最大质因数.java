import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/3/4 18:45
 */
public class 最大质因数 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        int index = 0;
        int maxPrimeFactor = 0;

        Arrays.sort(array);

        for (int i = n-1; i > 0; i--) {
            if (array[i] == 0) continue;
            int i1 = maxPrimeFactor(array[i]);
            for (int j = 0; j < n; j++) {
                if (array[j] > i1) break;
                if (array[j] < i1){
                    array[j] = 0;
                }
            }
            if (i1 > maxPrimeFactor){
                maxPrimeFactor = i1;
                index = i;
            }
        }

        System.out.println(array[index]);

    }

    private static int maxPrimeFactor(int n){
        if (n== 0)
            return 0;
        int maxPrime = 1;
        BigInteger factor;
        for (int i = n; i >  1; i--) {
            factor = BigInteger.valueOf(i);
            if (factor.isProbablePrime(4)) {
                if (n % i == 0) {
                    maxPrime = i;
                    break;
                }
            }
        }
        return maxPrime;
    }

    public static void main(String[] args) {
        solution();
    }
}
