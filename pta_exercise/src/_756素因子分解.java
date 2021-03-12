import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/2/23 11:08
 */
public class _756素因子分解 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num == 1){
            System.out.print("1=1");
            return;
        }

        int[] factorArray = new int[100];
        primeFactor(num,factorArray);

        System.out.print(num+"=");

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < factorArray.length; i++) {
            if (factorArray[i] == 0) continue;
            if (factorArray[i] ==1)
                output.append(i).append("*");
            else output.append(i).append("^").append(factorArray[i]).append("*");
        }

        System.out.println(output.toString().replaceAll("\\*$", ""));
    }

    private static void primeFactor(int num, int[] factorArray ){
        if (num == 1) return;
        for (int i = 2; i < 100; i++) {
            if (!BigInteger.valueOf(i).isProbablePrime(5)) continue;
            if (num % i == 0) {
                factorArray[i]++;
                primeFactor(num / i,factorArray);
                break;
            }
        }
    }

    public static void main(String[] args) {
        solution();
    }
}
