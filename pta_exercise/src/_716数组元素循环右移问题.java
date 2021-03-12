import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/2/22 10:35
 */
public class _716数组元素循环右移问题 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt() % n;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = n-m; i < n; i++) {
            System.out.print(array[i]+" ");
        }

        for (int i = 0; i < n - m; i++) {
            if (i == n - m - 1) {
                System.out.print(array[i]);
                break;
            }
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args) {
        solution();
    }
}
