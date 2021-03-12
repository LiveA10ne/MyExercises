import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _745统计工龄 {
    public static void main(String[] args) {
        f();
    }

    public static void f() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] intArray = new int [n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }
        HashMap<Integer, Integer> serviceMap = new HashMap<>();
        for (int i :
                intArray) {
            if (!serviceMap.containsKey(i))
            serviceMap.put(i, countOfItem(intArray, i));
        }

        for (Map.Entry entry :
                serviceMap.entrySet()) {
            System.out.printf("%d:%d\n",entry.getKey(),entry.getValue());
        }
    }

    //统计一个数组里某元素的个数
    public static int countOfItem(int [] intArray, int item){
        int count = 0;
        for (int i :
                intArray) {
            if (i == item)
                count++;
        }
        return count;
    }
}
