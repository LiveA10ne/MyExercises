import java.util.ArrayList;
import java.util.Scanner;

public class _747求链式线性表的倒数第K项 {
    public static void main(String[] args) {
        f();
    }

    public static void f() {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        int insertNum;
        int size  = 0;
        for (;;){
            insertNum = scanner.nextInt();
            if (insertNum>=0) {
                list.add(insertNum);
                size++;
            }
            else break;
        }

        try {
            System.out.println(list.get(size-k));
        } catch (Exception exception) {
            System.out.println("NULL");
        }

    }
}
