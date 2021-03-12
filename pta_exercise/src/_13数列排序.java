import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/2/23 15:00
 */
public class _13数列排序 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        quickSort(array, 0, array.length-1);

        printArray(array);
    }

    private static void quickSort(int[] array, int s, int t){
        int i = s, j = t;
        if (i < j){
            int temp = array[i];
            while (i != j){
                while (i < j && array[j] >= temp)
                    j--;
                array[i] = array[j];
                while (i < j && array[i] <= temp)
                    i++;
                array[j] = array[i];
            }
            array[i] = temp;
            quickSort(array,s,i-1);
            quickSort(array,i+1,t);
        }
    }

    private static void printArray(int[] array){
        for (int i :
                array) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        solution();
    }

}
