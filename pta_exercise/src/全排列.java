import java.util.ArrayList;

/**
 * @author Somnambulist
 * @date 2021/3/19 15:16
 */

//给一些数字，输出全排列

public class 全排列 {
    private static void bt(ArrayList<ArrayList<Integer>> rel, ArrayList<Integer> current,
                           int[] nums, boolean[] visited){
        if (current.size() == nums.length){
            rel.add(new ArrayList<>(current));
        }

        for (int i = 0; i < nums.length; i++) {
            if (visited[i]){
                continue;
            }
            current.add(nums[i]);
            visited[i] = true;
            bt(rel, current, nums, visited);
            current.remove(current.size() - 1);
            visited[i] = false;
        }

    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> rel = new ArrayList<>();
        int[] nums = {4,5,6};
        bt(rel,new ArrayList<Integer>(),nums,new boolean[nums.length]);
        for (ArrayList<Integer> list :
                rel) {
            System.out.println(list);
        }
    }
}
