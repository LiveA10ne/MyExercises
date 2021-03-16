import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/3/3 20:54
 */
public class Main {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int input = scanner.nextInt();
            if (input != 0){
                list.add(input);
            }
        }
        System.out.println(list.size());
        for (int i :
                list) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        solution();
    }
}
