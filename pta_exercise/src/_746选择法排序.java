import java.util.Scanner;

public class _746选择法排序 {
    public static void main(String[] args) {
        f();
    }

    public static void f() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] intsArray = new int[n];
        for (int i = 0; i < n; i++) {
            intsArray[i] = scanner.nextInt();
        }
        selectSort(intsArray,n);
        for (int i = 0; i < n; i++) {
            if (i!=n-1)
                System.out.print(intsArray[i]+" ");
            else
                System.out.print(intsArray[i]);
        }
    }

    //选择排序
    public static void selectSort(int [] intsArray, int n){
        int temp,k;
        for (int i = 0; i < n - 1; i++) {
            k = i;
            for (int j = i+1; j < n; j++) {
                if (intsArray[j] > intsArray[k])
                    k = j;
            }
            if (k!=i){
                temp = intsArray[i];
                intsArray[i] = intsArray[k];
                intsArray[k] = temp;
            }
        }
    }
}
