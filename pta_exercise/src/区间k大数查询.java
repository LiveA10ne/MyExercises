import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/3/16 17:08
 */
public class 区间k大数查询 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            arr[i] = scanner.nextInt();
        }

        int  m = scanner.nextInt();
        int[] storage = new int[m];
        for (int i = 0; i < m; i++) {
            int l = scanner.nextInt(), r = scanner.nextInt();
            int k = scanner.nextInt();
            int[] copyOfRange = Arrays.copyOfRange(arr, l, r + 1);
            storage[i] = findK(copyOfRange,k);
        }

        for (int i :
                storage) {
            System.out.println(i);
        }
    }

    private static int findK(int[] arr,int k){
        Arrays.sort(arr);
        return arr[arr.length - k];
    }


    public static void main(String[] args) {
        solution();
    }
}
