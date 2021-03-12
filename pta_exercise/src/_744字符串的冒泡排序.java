import java.util.Scanner;

public class _744字符串的冒泡排序 {
    public static void main(String[] args) {
        f();
    }

    public static void f() {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int k = scanner.nextInt();
        String [] stringsArray = new String[length];
        for (int i = 0; i < length; i++) {
            stringsArray[i] = scanner.next();
        }

        for (int i = 0; i < k; i++) {
            stringsBubbleSort(stringsArray, stringsArray.length-i);
        }
        for (int i = 0; i < stringsArray.length; i++) {
            System.out.println(stringsArray[i]);
        }
    }

    //对数组前N项进行冒泡排序
    public static void stringsBubbleSort(String [] stringsArray, int n){
        String temp;
        for (int i = 0; i < n - 1; i++) {
            if (stringsArray[i].compareTo(stringsArray[i+1]) > 0) {
                temp = stringsArray[i];
                stringsArray[i] = stringsArray[i + 1];
                stringsArray[i + 1] = temp;
            }
        }
    }
}
