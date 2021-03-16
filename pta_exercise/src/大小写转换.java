import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/3/15 20:06
 */
public class 大小写转换 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        char[] chars = string.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] += 'A' - 'a';
                continue;
            }

            if (chars[i] >= 'A' && chars[i] <= 'Z'){
                chars[i] -= 'A' - 'a';
            }
        }

        for (char c :
                chars) {
            System.out.print(c);
        }
    }

    public static void main(String[] args) {
        solution();
    }
}
