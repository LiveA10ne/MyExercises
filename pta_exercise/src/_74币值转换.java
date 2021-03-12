    import java.util.Scanner;

    /**
     * @author Somnambulist
     * @date 2021/2/21 15:09
     */
    public class _74币值转换 {
        private static void f(){
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            String money[] = {"Y","Q","B","S","W","Q","B","S",""};
            String nums[] = {"a","b","c","d","e","f","g","h","i","j"};
            String res = "";

            int[] inputNums = new int[9];
            for (int i = 0; i < 9; i++) {
                inputNums[i] = n % 10;
                n /= 10;
            }
            for (int i = 8; i >= 0; i--) {
                res += nums[inputNums[i]]+money[8-i];
            }

            res = res.replaceAll("aW","W").replaceAll("[a]$|^(a[YQBSW])+", "").replaceAll("(a[YQBSW])+","a").replaceAll("a$|^[W]","").replaceAll("^[a]","");

            if (res.isEmpty())
                System.out.println("a");
            else System.out.println(res);
        }

        public static void main(String[] args) {
            f();
        }
    }
