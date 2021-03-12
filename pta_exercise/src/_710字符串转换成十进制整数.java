import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Somnambulist
 * @date 2021/2/21 11:07
 */
public class _710字符串转换成十进制整数 {

    private static void f(){
        char sign = '+';
        int indexOfFirstHexChar = 0;
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();

        Matcher matcher = Pattern.compile("[0-9A-Fa-f]").matcher(inputString);
        if (matcher.find()){
            indexOfFirstHexChar = inputString.indexOf(matcher.group());
        }

        char[] chars = inputString.toCharArray();
        for (int i = 0; i < indexOfFirstHexChar; i++) {
            if (chars[i] == '-' ){
                sign = '-';
                break;
            }
        }

        int i;
        String substring = inputString.substring(0, inputString.indexOf('#'));
        String s = substring.replaceAll("[^0-9A-Fa-f]", "");
        if (s.isEmpty()){
            i = 0;
        }else
            i = Integer.parseInt(String.valueOf(sign)+s, 16);
        System.out.println(i);
    }

    public static void main(String[] args) {
        f();
    }
}
