/**
 * @author Somnambulist
 * @date 2021/3/19 14:40
 */
public class 求1000以内的完数 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (isPerfect(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean isPerfect(int num){
        if (num == 1){
            return false;
        }
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0){
                sum += i;
            }
        }

        return sum == num;
    }

}
