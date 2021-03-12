import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/3/6 19:34
 */
public class 二进制数数 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt(),
                r = scanner.nextInt();
        int numberOfOne = 0;
        for (int i = l; i < r + 1; i++) {
            String s = Integer.toBinaryString(i);
            char[] chars = s.toCharArray();
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
