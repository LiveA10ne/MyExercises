/**
 * @author Somnambulist
 * @date 2021/2/24 11:30
 */
public class _2零一字符串 {
    private static void solution(){
        for (int i = 0; i < 32; i++) {
            System.out.printf("%05d\n",Integer.parseInt(Integer.toString(i,2)));
        }
    }

    public static void main(String[] args) {
        solution();
    }
}
