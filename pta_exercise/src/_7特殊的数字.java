/**
 * @author Somnambulist
 * @date 2021/2/23 17:26
 */
public class _7特殊的数字 {
    private static void solution(){
        for (int i = 100; i < 1000; i++) {
            if (i == cubeSum(i))
                System.out.println(i);
        }
    }

    private static int cubeSum(int n){
        int sum = 0;
        int i;
        while (n!=0){
            i = n % 10;
            sum += i * i * i;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        solution();
    }
}
