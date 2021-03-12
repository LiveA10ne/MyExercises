import java.util.Scanner;

public class _754装箱问题 {
    public static void main(String[] args) {
        f();
    }

    public static void f() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] items = new int[n];
        for (int i = 0; i < n; i++) {
            items[i] = scanner.nextInt();
        }

        int[] box = new int[n];
        outer:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (items[i]+box[j] <=100) {
                    box[j] += items[i];
                    System.out.printf("%d %d\n", items[i], j+1);
                    continue outer;
                }
            }
        }

        int countOfBox = 0;
        for (int i :
                box) {
            if (i > 0)
                countOfBox++;
        }
        System.out.print(countOfBox);


    }
}
