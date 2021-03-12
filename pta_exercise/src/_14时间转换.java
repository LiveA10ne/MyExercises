import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/2/26 14:48
 */
public class _14时间转换 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int h = t / 3600;
        int m = (t - h * 3600) / 60;
        int s = t - h * 3600 - m * 60;
        System.out.printf("%d:%d:%d",h,m,s);
    }

    public static void main(String[] args) {
        solution();
    }
}
