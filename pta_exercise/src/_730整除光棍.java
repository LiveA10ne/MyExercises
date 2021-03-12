import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/2/22 14:13
 */
public class _730整除光棍 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        BigDecimal x = new BigDecimal(scanner.nextInt());

        String n = "1";
        BigDecimal num;

        for (;;){
            num = new BigDecimal(n);
            BigDecimal remainder = num.divideAndRemainder(x)[1];
            if (remainder.equals(new BigDecimal(0)))
                break;
            n += "1";
        }

        System.out.println(num.divideAndRemainder(x)[0]+" "+n.length());
    }

    public static void main(String[] args) {
        solution();
    }
}
