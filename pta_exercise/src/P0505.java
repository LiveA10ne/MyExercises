import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/3/7 19:23
 */
public class P0505 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long mul = 1;
        for (int i = 1; i < n + 1; i++) {
            if (i % 5 == 0) {
                mul *= i;
            }else {
                mul *= theRightmostNonZeroNum(i);
            }
            if (mul % 5 != 0){
                mul = theRightmostNonZeroNum(mul);
            }
        }
        System.out.println(theRightmostNonZeroNum(mul));
    }

    //获取一个数字最右边非0的数字
    private static long theRightmostNonZeroNum(long n){
        while (n % 10 == 0){
            n /= 10;
        }
        return n % 10;
    }

    public static void main(String[] args) {
        solution();
    }
}

// 2 3 4 6 7    1008

