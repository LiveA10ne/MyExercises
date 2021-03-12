import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/2/21 14:29
 */
public class _746人民币兑换 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        outer:
        for (int j = 1; j <= 30; j++) {
            for (int j2 = 1; j2 <= 75; j2++) {
                for (int k = 1; k <= 150; k++) {
                    if(i == n)
                        break outer;
                    if (j*5+j2*2+k == 150 && (j+j2+k <=100) ) {
                        System.out.printf("%d %d %d\n",j,j2,k);
                        i++;
                        continue outer;
                    }
                }
            }
        }

        scanner.close();
    }
}
