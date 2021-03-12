import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/2/26 14:55
 */
public class _15字符串对比 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.next();
        String string2 = scanner.next();
        if (string1.length()!=string2.length()){
            System.out.println(1);
        }else if (string1.equals(string2)){
            System.out.println(2);
        }else if (string1.toUpperCase().equals(string2.toUpperCase())){
            System.out.println(3);
        }else {
            System.out.println(4);
        }
    }

    public static void main(String[] args) {
        solution();
    }
}
