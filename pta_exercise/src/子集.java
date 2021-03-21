import java.util.ArrayList;

/**
 * @author Somnambulist
 * @date 2021/3/19 16:27
 */
public class 子集 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> rel = new ArrayList<>();
        int[] nums = {1,2,3};
        subSet(rel,new ArrayList<>(),nums,0);
        for (ArrayList<Integer> list :
                rel) {
            System.out.println(list);
        }
    }

    private static void subSet(ArrayList<ArrayList<Integer>> rel, ArrayList<Integer> current,
                               int[] nums, int index){

        if (index == nums.length){
            rel.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[index]);
        subSet(rel, current, nums, index + 1);
        current.remove(current.size() - 1);
        subSet(rel, current, nums, index + 1);

    }
}
