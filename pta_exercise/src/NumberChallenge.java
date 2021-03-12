import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/3/5 18:34
 */
public class NumberChallenge {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(),
                b = scanner.nextInt(),
                c = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < a+1; i++) {
            for (int j = 1; j < b+1; j++) {
                for (int k = 1; k < c+1 ; k++) {
                    sum += d((long) i * j * k);
                }
            }
        }

        System.out.println(sum);

    }

    private static int d(long l){
        int sum = 0;
        for (int i = 1; i < l/2+1; i++) {
            if (l % i == 0)
                sum++;
        }
        return sum + 1;
    }

    public static void main(String[] args) {
        solution();
    }
}
