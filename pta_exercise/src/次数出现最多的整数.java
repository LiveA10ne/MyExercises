import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/3/15 18:48
 */
public class 次数出现最多的整数 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[1000];
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            arr[scanner.nextInt()]++;
        }

        int max = 0;
        int maxNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
                maxNum = i;
            }
        }
        if (maxNum ==0){
            return;
        }
        System.out.println(maxNum);
    }

    public static void main(String[] args) {
        solution();
    }
}
