import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/2/23 9:44
 */
public class _749一元多项式求导 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (scanner.hasNextInt())
            list.add(scanner.nextInt());


        int index = 0;
        for (int j = 0; j < list.size() - 1; j +=2) {
            if (list.get(j+1) == 0) {
                index = j;
                break;
            }
            list.set(j, list.get(j) * list.get(j+1));
            list.set(j+1, list.get(j+1) - 1);
        }

        if (index == 0) {
            for (int i = 0; i < list.size(); i++) {
                if (i == list.size() - 1) {
                    System.out.print(list.get(i));
                    break;
                }
                System.out.print(list.get(i) + " ");
            }
            return;
        }

        for (int i = 0; i < index; i++) {
            if (i == index-1) {
                System.out.print(list.get(i));
                break;
            }
            System.out.print(list.get(i)+" ");
        }
    }

    public static void main(String[] args) {
        solution();
    }
}
