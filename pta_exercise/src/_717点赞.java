import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/2/22 10:47
 */
public class _717点赞 {
    private static void solution(){
        int[] likeArray = new int[1001];
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int countOfTag = scanner.nextInt();
            for (int j = 0; j < countOfTag; j++) {
                likeArray[scanner.nextInt()]++;
            }
        }

        int max = likeArray[0];
        int tag = 0;
        for (int i = 0; i < likeArray.length; i++) {
            if (likeArray[i] >= max) {
                max = likeArray[i];
                if (i > tag)
                    tag = i;
            }
        }

        System.out.println(tag+" "+max);


    }

    public static void main(String[] args) {
        solution();
    }
}
