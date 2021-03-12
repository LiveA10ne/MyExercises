import java.util.Scanner;

public class _743冒泡法排序 {
    public static void main(String[] args) {
        f();
    }

    public static void f() {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int k = scanner.nextInt();
        int [] intArray = new int[length];
        for (int i = 0; i < length; i++) {
            intArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < k; i++) {
            bubbleSort(intArray, intArray.length-i);
        }
        for (int i = 0; i < intArray.length; i++) {
            if (i!= intArray.length-1)
                System.out.print(intArray[i]+" ");
            else
                System.out.print(intArray[i]);
        }
    }

    //对数组前N项进行冒泡排序
    public static void bubbleSort(int [] intArray, int n){
        int temp;
        for (int i = 0; i < n - 1; i++) {
            if (intArray[i] > intArray[i+1]) {
                temp = intArray[i];
                intArray[i] = intArray[i + 1];
                intArray[i + 1] = temp;
            }
        }
    }
}
