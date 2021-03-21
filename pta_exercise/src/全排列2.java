import java.util.ArrayList;
import java.util.List;

/**
 * @author Somnambulist
 * @date 2021/3/19 15:56
 */
public class 全排列2 {
    private static void backTrack(ArrayList<ArrayList<Integer>> rel, List<Integer> current,
                                  int[] nums, boolean[] visited){
        if (current.size() == nums.length){
            rel.add(new ArrayList<>(current));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]){
                continue;
            }
            if(i > 0 && !visited[i - 1] && nums[i] == nums[i - 1]){
                continue;
            }
            current.add(nums[i]);
            visited[i] = true;
            backTrack(rel, current, nums, visited);
            current.remove(current.size() - 1);
            visited[i] = false;
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> rel = new ArrayList<>();
        int[] nums = {1,1,2};
        backTrack(rel,new ArrayList<Integer>(),nums,new boolean[nums.length]);
        for (ArrayList<Integer> list:rel) {
            System.out.println(list);
        }
    }
}
