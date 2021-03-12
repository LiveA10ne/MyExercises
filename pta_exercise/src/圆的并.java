import java.awt.*;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/3/4 19:43
 */

//感觉这题圆很多的话还要用容斥原理啊
public class 圆的并 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashMap<Point, Integer> circles = new HashMap<>();
        for (int i = 0; i < n ; i++) {
            circles.put(new Point(scanner.nextInt(),scanner.nextInt()), scanner.nextInt());
        }

    }
    //求两个圆的交
    private static double commonAreaOfTwoCircles(Point a, int r1, Point b, int r2){
        double distance = Math.hypot(a.x - b.x, a.y - b.y); //圆心距离
        if (distance > r1 + r2){
            return 0;
        }
        if (distance <= Math.abs(r1 - r2)){
            return Math.PI * Math.pow(Math.min(r1,r2),2);
        }
        double ang2 = Math.acos((r2 * r2 + distance * distance - r1 * r1) / (2 * r2 * distance));
        double ang1 = Math.acos((r1 * r1 + distance * distance - r2 * r2) / (2 * r1 * distance));
        return ang1*r1*r1 + ang2*r2*r2 - r1*Math.sin(ang1)*distance;
    }

    public static void main(String[] args) {
        solution();
    }
}
