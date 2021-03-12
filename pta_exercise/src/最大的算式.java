import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/3/12 17:17
 */
public class 最大的算式 {
    private static long sum(int[] arr, int star, int end){
        long sum  = 0;
        for (int i = star; i < end + 1; i++) {
            sum += arr[i];
        }
        return sum;
    }
    private static long max(int[] arr,int star, int mul){
        if (mul == 0){
            return sum(arr, star, arr.length-1);
        }
        long max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            long tempMax = sum(arr, star, i) * max(arr, i+1, mul-1);
            max = (Math.max(tempMax, max));
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(),
                k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(max(arr,0,k));
    }
}
