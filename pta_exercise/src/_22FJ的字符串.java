import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/3/2 12:46
 */
public class _22FJ的字符串 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fjString(n));
    }

    private static String fjString(int n){
        if (n == 1)
            return "A";
        char[] chars = fjString(n - 1).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i]+1);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("A");
        for (char c :
                chars) {
            stringBuilder.append(c).append("A");
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        solution();
    }
}
