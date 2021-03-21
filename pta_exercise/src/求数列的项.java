/**
 * @author Somnambulist
 * @date 2021/3/19 14:25
 */
public class 求数列的项 {

    private static int[] arr = new int[21];

    private static int f(int n){
        if (arr[n] > 0){
            return arr[n];
        }
        else if (n == 1){
            arr[1] = 1;
            return 1;
        }
        else if (n == 2){
            arr[2] = 2;
            return 2;
        }
        arr[n] = f(n - 1) + f(n - 2);
        return arr[n];
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.println(f(i));
        }
    }
}
