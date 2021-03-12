import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/3/5 19:33
 */
public class 二分法查找数组元素 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] data = new int[200];
        for (int i = 0; i < 200; i++) {
            data[i] = 4 * i + 6;
        }
        System.out.println(Arrays.binarySearch(data, n));
    }
}
