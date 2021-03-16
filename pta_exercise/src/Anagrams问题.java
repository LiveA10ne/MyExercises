import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/3/15 16:45
 */
public class Anagrams问题 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.next().toLowerCase();
        String string2 = scanner.next().toLowerCase();
        if (string1.length() != string2.length()){
            System.out.println("N");
            return;
        }

        int[] letterArr1 = new int[26];
        int[] letterArr2 = new int[26];
        char[] chars1 = string1.toCharArray();
        char[] chars2 = string2.toCharArray();
        for (char value : chars1) {
            int i = value - 'a';
            letterArr1[i]++;
        }
        for (char value : chars2) {
            int i = value - 'a';
            letterArr2[i]++;
        }
        for (int i = 0; i < letterArr1.length; i++) {
            if (letterArr1[i] != letterArr2[i]){
                System.out.println("N");
                return;
            }
        }
        System.out.println("Y");
    }

    public static void main(String[] args) {
        solution();
    }
}
