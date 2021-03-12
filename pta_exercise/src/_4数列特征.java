import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/2/24 10:52
 */
public class _4数列特征 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        System.out.println(array[n-1]);
        System.out.println(array[0]);

        int sum = 0;
        for (int i :
                array) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        solution();
    }
}
