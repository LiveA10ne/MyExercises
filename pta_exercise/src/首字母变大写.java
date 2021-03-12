import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/3/5 17:51
 */
public class 首字母变大写 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        scanner.close();
        String[] split = string.split("\\s+");
        for (int i = 0; i < split.length; i++) {
            split[i] = firstCharToUpper(split[i]);
        }

        for (String s :
                split) {
            System.out.print(s+" ");
        }
    }

    private static String firstCharToUpper(String s){
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = s.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        for (char c :
                chars) {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        solution();
    }
}
