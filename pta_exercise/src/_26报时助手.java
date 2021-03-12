import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/2/26 9:58
 */
public class _26报时助手 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();

        if (m == 0){
            System.out.println(numReading(h)+" o'clock");
            return;
        }

        System.out.println(numReading(h)+" "+numReading(m));

    }

    private static String numReading(int num){
        String[] string1 = {"zero", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten", "eleven", "twelve",
                "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen"};
        String[] string2 = {"twenty","thirty","forty","fifty"};
        if (num < 20){
            return string1[num];
        }else if (num % 10 == 0){
            return string2[num / 10 - 2];
        }
        return string2[num / 10 -2]+ " " + string1[num % 10];
    }

    public static void main(String[] args) {
        solution();
    }
}
