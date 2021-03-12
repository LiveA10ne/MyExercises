import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/2/21 13:54
 */
public class _736谁先倒 {
    private static void f(){
        Scanner scanner = new Scanner(System.in);
        int aDrinking = scanner.nextInt(), bDrinking = scanner.nextInt();
        int n = scanner.nextInt();

        int a = 0, b = 0;
        for (int i = 0; i < n; i++) {
            String who = whoDrinks(scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
            if ("A".equals(who))
                a++;
            if ("B".equals(who))
                b++;
            if ("A&B".equals(who)){
                a++;
                b++;
            }
            if (a == aDrinking){
                System.out.println("A");
                System.out.println(b);
                break;
            }
            if (b == bDrinking){
                System.out.println("B");
                System.out.println(a);
                break;
            }
        }
    }

    private static String whoDrinks(int a, int b, int c, int d){
        String loser = "None";
        int res = a+c;
        if (b == res && d != res)
            loser = "A";
        else if (b != res && d == res)
            loser = "B";
        else if (b == res && d == res)
            loser = "A&B";
        return loser;
    }

    public static void main(String[] args) {
        f();
    }
}
