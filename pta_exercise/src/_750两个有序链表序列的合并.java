import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _750两个有序链表序列的合并 {
    public static void main(String[] args) {
        f();
    }

    public static void f() {
        Scanner scanner = new Scanner(System.in);
        int num ;
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (;;){
            num = scanner.nextInt();
            if (num!=-1)
                list1.add(num);
            else
                break;
        }

        for (;;){
            num = scanner.nextInt();
            if (num!=-1)
                list2.add(num);
            else
                break;
        }

        if (list1.isEmpty() && list2.isEmpty())
            System.out.println("NULL");
        else  {
            list1.addAll(list2);
            Collections.sort(list1);
            for (int i = 0; i < list1.size(); i++) {
                if (i!= list1.size()-1) {
                    System.out.print(list1.get(i)+" ");
                }else
                    System.out.print(list1.get(i));
            }
        }
    }
}
