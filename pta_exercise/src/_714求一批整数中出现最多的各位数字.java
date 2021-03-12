import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/2/22 9:43
 */
public class _714求一批整数中出现最多的各位数字 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[10];
        for (int i = 0; i < n; i++) {
            f(scanner.nextInt(), array);
        }

        int max = array[0];
        for (int i :
                array) {
            if (i > max) {
                max = i;
            }
        }
        System.out.printf("%d: ",max);

        String printString = "";
        for (int i = 0; i < 10; i++) {
            if (array[i] == max)
                printString += String.valueOf(i)+" ";
        }
        System.out.println(printString.trim());


    }

    private static void f(int inputNum, int[] array){
        for (;;){
            if (inputNum == 0)
                return;
            array[inputNum % 10]++;
            inputNum /= 10;
        }
    }

    public static void main(String[] args) {
        solution();
    }
}
