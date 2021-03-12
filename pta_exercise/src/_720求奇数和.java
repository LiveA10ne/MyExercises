import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/2/21 13:13
 */
public class _720求奇数和 {
    private static void f(){
        Scanner scanner = new Scanner(System.in);
        int input,sum = 0;
        for (;;){
            input = scanner.nextInt();
            if (input % 2 ==1)
                sum += input;
            else if (input <= 0 )
                break;
        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        f();
    }
}
