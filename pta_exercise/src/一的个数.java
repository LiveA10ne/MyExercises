import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/3/6 20:26
 */
public class 一的个数 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int numberOfOne = 0;
        for (int i = 1; i < n + 1; i++) {
            char[] chars = String.valueOf(i).toCharArray();
            for (char c :
                    chars) {
                if (c == '1'){
                    numberOfOne++;
                }
            }
        }
        System.out.println(numberOfOne);
    }

    public static void main(String[] args) {
        solution();
    }
}
