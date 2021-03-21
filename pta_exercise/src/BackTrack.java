import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/2/19 11:11
 */
public class BackTrack{

    static int n;

    public static void f(int[] array){
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        ArrayList<List<Integer>> res = new ArrayList<>();
        backTrack(res, new ArrayList<>(), array,new boolean[n]);

        for (List<Integer> list :
                res) {
            for (int i :
                    list) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void backTrack(List<List<Integer>> res, List<Integer> cur,
                                 int[] nums, boolean[] visited ){
        if (cur.size() == n) {
            res.add(new ArrayList<>(cur));
        }else{
            for (int i = 0; i < n; i++) {
                if (visited[i]) continue;
                cur.add(nums[i]);
                visited[i] = true;
                backTrack(res, cur, nums, visited);
                cur.remove(cur.size() - 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        f(array);
    }
}
