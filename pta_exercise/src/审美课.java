import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/3/6 20:45
 */
public class 审美课 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt(),
                n = scanner.nextInt();
        scanner.nextLine();
        String[] arr = new String[m];
        for (int i = 0; i < m; i++) {
            arr[i] = scanner.nextLine().replaceAll("\\s","");
        }

        int sum = 0;
        for (int i = 1; i < m; i++) {
            String s1 = Integer.toBinaryString(~Integer.valueOf(arr[i], 2));
            String substring1 = s1.substring(s1.length() - n);
            if (substring1.equals(arr[i - 1])){
                sum ++;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        solution();
    }
}
