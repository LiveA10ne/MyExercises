import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/3/3 20:26
 */

/*
　输出包含两行，第一行输出比赛结果——一个大写字母“T”或“R”或“D”，
  分别表示乌龟获胜，兔子获胜，或者两者同时到达终点。
　第二行输出一个正整数，表示获胜者（或者双方同时）到达终点所耗费的时间（秒数）。
 */
public class 龟兔赛跑预测 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        int v1 = scanner.nextInt(),     //兔子的速度
                v2 = scanner.nextInt(),     //乌龟的速度
                t = scanner.nextInt(),
                s = scanner.nextInt(),      //兔子领先乌龟t米休息s秒
                l = scanner.nextInt();      //赛道的长度
    }

    public static void main(String[] args) {
        solution();
    }
}

/*
 (v1 - v2) * T = t
*/
