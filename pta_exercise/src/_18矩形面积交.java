import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/3/3 13:59
 */
public class _18矩形面积交 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        //第一个长方形
        BigDecimal x1 = new BigDecimal(scanner.next()), y1 = new BigDecimal(scanner.next()),
                x2 = new BigDecimal(scanner.next()), y2 = new BigDecimal(scanner.next());
        //第二个长方形
        BigDecimal x3 = new BigDecimal(scanner.next()), y3 = new BigDecimal(scanner.next()),
                x4 = new BigDecimal(scanner.next()), y4 = new BigDecimal(scanner.next());

        if (Math.max(x1.doubleValue(), x2.doubleValue()) < Math.min(x3.doubleValue(), x4.doubleValue())){
            System.out.println("0.00");
            return;
        }

        ArrayList<BigDecimal> x = new ArrayList<>();
        x.add(x1);
        x.add(x2);
        x.add(x3);
        x.add(x4);
        Collections.sort(x);
        ArrayList<BigDecimal> y = new ArrayList<>();
        y.add(y1);
        y.add(y2);
        y.add(y3);
        y.add(y4);
        Collections.sort(y);


        BigDecimal bigDecimal = x.get(2).subtract(x.get(1));
        BigDecimal bigDecimal1 = y.get(2).subtract(y.get(1));
        BigDecimal multiply = bigDecimal.multiply(bigDecimal1).setScale(2, RoundingMode.HALF_UP).abs();

        System.out.print(multiply);
    }

    public static void main(String[] args) {
        solution();
    }
}

//这个方法好，如果照自己的想，会炒鸡复杂。
//首先判断面积为0的情况，当一个矩形的横（纵）坐标的最大值
//小于另一个矩形的横（纵）坐标的最小值时，代表两个矩形不相交
//然后如果相交的话
//将横坐标排序，一共四个横坐标，第三个减去第二个，就是相交矩形的一条边的长
//对纵坐标作同样处理
//然后将相交矩形的长和宽相乘，得出结果
