import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/2/23 17:05
 */
public class _特殊回文数 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        for (int i = 10000; i < 1000000; i++) {
            if (!isPalindrome(i))
                continue;
            if (sum(i) == target)
                System.out.println(i);
        }
    }

    //判断是否为回文数
    private static boolean isPalindrome(int n){
        String num = String.valueOf(n);
        return new StringBuilder(num).reverse().toString().equals(num);
    }

    //计算各位之和
    private static int sum(int n){
        int s = 0;
        while (n != 0){
            s += n % 10;
            n /= 10;
        }
        return s;
    }

    public static void main(String[] args) {
        solution();
    }
}
