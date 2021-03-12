import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/2/24 10:59
 */
public class _3字母图形 {
    private static void solution(){
        char[] letter = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
                'O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i && j <m; j++) {
                System.out.print(letter[i-j]);
            }
            for (int j = 0; j < m - i; j++) {
                System.out.print(letter[j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solution();
    }
}

/*       row  index

ABCDEFG  0   0 1 2 3 4 5 6
BABCDEF  1   1 0 1 2 3 4 5
CBABCDE  2   2 1 0 1 2 3 4
DCBABCD  3   3 2 1 0 1 2 3
EDCBABC  4   4 3 2 1 0 1 2
 */
