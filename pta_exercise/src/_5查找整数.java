import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/2/24 10:37
 */
public class _5查找整数 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();

        boolean isFound = false;
        for (int i = 0; i < n; i++) {
            if (array[i] == target){
                System.out.println(i+1);
                isFound = true;
                break;
            }
        }
        if (!isFound)
            System.out.println(-1);
    }

    public static void main(String[] args) {
        solution();
    }
}
