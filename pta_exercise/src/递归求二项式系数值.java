import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/3/8 20:14
 */
public class 递归求二项式系数值 {
   private static void solution(){
       Scanner scanner = new Scanner(System.in);
       int k = scanner.nextInt(),
               n = scanner.nextInt();
       System.out.println(binomialCoefficient(n, k));
   }

   private static int binomialCoefficient(int n, int k){
       if (k == 0 || k == n){
           return 1;
       }
       return binomialCoefficient(n - 1, k) + binomialCoefficient(n - 1, k - 1);
   }

    public static void main(String[] args) {
        solution();
    }
}
