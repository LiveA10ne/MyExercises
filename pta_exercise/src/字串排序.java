import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/3/19 16:43
 */
public class 字串排序 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
    }

    private static int bubbleSortOfStr(String str){
        int n = 0;
        char temp;
        char[] charsArr = str.toCharArray();
        for (int k = 0; k < charsArr.length - 1; k++) {
            for (int i = 0; i < charsArr.length - 1 - k; i++) {
                if (charsArr[i] <= charsArr[i + 1]){
                    continue;
                }
                temp = charsArr[i];
                charsArr[i] = charsArr[i + 1];
                charsArr[i + 1] = temp;
                n++;
            }
        }
        return n;
    }
}
