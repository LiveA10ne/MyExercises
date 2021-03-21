import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/3/16 16:34
 */
public class 最大最小公倍数 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        if (n % 2 == 1){
            System.out.println(n * (n - 1) * (n - 2));
            return;
        }
        if (n % 3 == 0){
            System.out.println((n - 1) * (n - 2) * (n - 3));
            return;
        }
        System.out.println(n * (n - 1) * (n - 3));
    }

    public static void main(String[] args) {
        solution();
    }
}
