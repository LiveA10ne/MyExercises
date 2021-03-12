/**
 * @author Somnambulist
 * @date 2021/2/23 17:19
 */
public class _8回文数 {
    private static void solution(){
        for (int i = 1000; i < 10000; i++) {
            if (!isPalindrome(i))
                continue;
            System.out.println(i);
        }
    }

    private static boolean isPalindrome(int i){
        String s = String.valueOf(i);
        return new StringBuilder(s).reverse().toString().equals(s);
    }

    public static void main(String[] args) {
        solution();
    }
}
