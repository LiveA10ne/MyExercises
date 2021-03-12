import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/2/24 19:36
 */
public class _03圆的面积 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        BigDecimal r = new BigDecimal(scanner.nextInt());
        BigDecimal area = r.multiply(r).multiply(BigDecimal.valueOf(Math.PI));
        System.out.println(area.setScale(7, BigDecimal.ROUND_HALF_UP));
    }

    public static void main(String[] args) {
        solution();
    }
}
