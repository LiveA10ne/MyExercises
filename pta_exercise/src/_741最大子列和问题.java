import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/2/22 17:50
 */
public class _741最大子列和问题 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        ArrayList<Integer> max = new ArrayList<>();
        max.add(sum(array, 0, array.length -1));
        largestSubArray(array, 0, array.length-1, max);

        Collections.sort(max);
        int m = max.get(max.size() - 1);
        if (m < 0){
            System.out.println(0);
            return;
        }
        System.out.println(m);
    }

    private static void largestSubArray(int[] array, int homePositiveNum, int endPositiveNum, List<Integer> max){
        if (homePositiveNum >= endPositiveNum )
            return;


        while (array[homePositiveNum] <=0 && homePositiveNum!=array.length-1 )
            homePositiveNum++;
        while (array[endPositiveNum] <=0 && endPositiveNum!=0 )
            endPositiveNum--;

        max.add(sum(array, homePositiveNum, endPositiveNum));

        largestSubArray(array, ++homePositiveNum, --endPositiveNum, max);
    }

    private static int sum(int[] array, int home, int end){
        int sum = 0;
        for (int i = home; i < end + 1; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        solution();
    }
}
