import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/2/24 16:20
 */
public class _1闰年判断 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        if (isLeapYear(y))
            System.out.println("yes");
        else System.out.println("no");
    }

    private static boolean isLeapYear(int y){
        return y % 4 == 0 && y % 100 != 0 || y % 400 ==0;
    }

    public static void main(String[] args) {
        solution();
    }
}
