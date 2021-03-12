import java.util.*;

public class _742A减B {
    public static void main(String[] args) {
        f();
    }

    public static void f() {
        Scanner scanner = new Scanner(System.in);
        String stringA = scanner.nextLine();
        String stringB = scanner.nextLine();
        char[] charsB = stringB.toCharArray();
        for (char c :
                charsB) {
            stringA = stringA.replaceAll(String.valueOf(c),"");
        }
        System.out.println(stringA);
    }
}
