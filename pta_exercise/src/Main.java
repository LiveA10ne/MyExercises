import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/3/3 20:54
 */
public class Main {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((1 + n) * n / 2);
    }
    public static void main(String[] args) {
        solution();
    }
}
