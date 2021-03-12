import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/3/3 15:26
 */
public class _19完美的代价 {

    private static int numberOfMoves = 0;
    private static boolean haveMiddle = false;

    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        int[] letterOccurrences = new int[26]; //统计每个字母出现的次数
        char[] charArray = s.toCharArray();

        //不可能是回文字符串的情况
        for (char c :
                charArray) {
            letterOccurrences[c-'a']++;
        }
        int k = 0; //统计出现奇数次字母的个数
        for (int i :
                letterOccurrences) {
            if (i % 2 != 0)
                k++;
        }
        if (k >= 2) {
            System.out.println("Impossible");
            return;
        }

        //本身就是回文字符串，不需要交换字母顺序
        if (s.equals(new StringBuilder(s).reverse().toString())){
            System.out.println(0);
            return;
        }

        palindrome(charArray,0,n-1);
        System.out.println(numberOfMoves);
    }

    private static boolean palindrome(char[] array, int a, int b){
        if (b <= a)
            return true;
        for (int i = b; i > a; i--) {
            if (array[i] == array[a]){
                exchange(array, i, b);
                numberOfMoves += exchangeTimes(i,b);
                return palindrome(array,a+1, b-1);
            }
        }

        if (!haveMiddle){
            numberOfMoves += exchangeTimes(a, array.length/2);
            return palindrome(array, a+1, b);
        }

        return false;
    }

    private static int exchangeTimes(int a, int b){
        return b - a;
    }

    //逐项交换直至移动到指定位置
    private static void exchange(char[] array, int a, int b){
        char temp = array[a];
        for (int i = a; i < b; i++) {
            array[i] = array[i + 1];
        }
        array[b] = temp;
    }

    public static void main(String[] args) {
        solution();
    }
}


/*
要保证移动的次数最少，每个字母单向移动，
内部的字母移动时，不会改变外部已经排好的字母。
 */