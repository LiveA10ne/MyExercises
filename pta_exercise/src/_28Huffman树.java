import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/2/25 11:03
 */
public class _28Huffman树 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        System.out.println(huffman(list));

    }

    private static int huffman(ArrayList<Integer> list){
        if (list.size() == 1)
            return 0;
        Collections.sort(list);
        int twoMinItemSum = list.get(0) + list.get(1);
        list.remove(0);
        list.remove(0);
        list.add(twoMinItemSum);
        return twoMinItemSum + huffman(list);
    }

    public static void main(String[] args) {
        solution();
    }
}
