import java.util.ArrayList;
import java.util.Scanner;

public class _751两个有序链表序列的交集 {
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

        ArrayList<Integer> list = new ArrayList<>();

        if (list1.isEmpty() || list2.isEmpty())
            System.out.println("NULL");
        else  {
            list = (ArrayList<Integer>) list1.clone();
            for (int i = 0; i < list1.size(); i++) {
                if (!list2.contains(list1.get(i)))
                    list.remove(list1.get(i));
            }

            if (list.isEmpty())
                System.out.println("NULL");
            else {
                for (int i = 0; i < list.size(); i++) {
                    if (i != list.size() - 1)
                        System.out.print(list.get(i) + " ");
                    else
                        System.out.print(list.get(i));
                }
            }
        }


    }
}

