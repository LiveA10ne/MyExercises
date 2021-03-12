import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class _740出租 {
    public static void main(String[] args) {
        f();
    }

    public static void f() {
        Scanner scanner = new Scanner(System.in);
        String telNum = scanner.nextLine();

        ArrayList<Integer> numList = new ArrayList<>();
        char[] charArray = telNum.toCharArray();
        for (char c :
                charArray) {
            int i = Integer.parseInt(String.valueOf(c));
            if (!numList.contains(i)){
                numList.add(i);
            }

        }

        Collections.sort(numList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });


        System.out.print("int[] arr = new int[]{");
        for (int i = 0; i < numList.size(); i++) {
            if (i!= numList.size()-1)
                System.out.print(numList.get(i)+",");
            else
                System.out.print(numList.get(i)+"};\n");

        }

        System.out.print("int[] index = new int[]{");


        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < numList.size(); j++) {
                int i1 = Integer.parseInt(String.valueOf(charArray[i]));
                if (i1 == numList.get(j) && i != charArray.length - 1)
                    System.out.print(j+",");
                else if( i1 == numList.get(j) && i == charArray.length - 1)
                    System.out.print(j+"};");
            }
        }
    }
}
