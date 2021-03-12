import java.util.Scanner;

public class _753组个最小数 {
    public static void main(String[] args) {
        f();
    }

    private static void f(){
        int[] intsArray = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            intsArray[i] = scanner.nextInt();
        }

        String theMinNum = "";
        int indexOfFirstNum;

        //找到第一个数字
        for (int i = 0; i < 10; i++) {
            if (intsArray[i] != 0 && i !=0) {
                indexOfFirstNum = i;
                intsArray[i]--;
                theMinNum += String.valueOf(i);
                break;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (intsArray[i] != 0)
                for (int j = 0; j < intsArray[i]; j++) {
                    theMinNum += i;
                }
        }

        System.out.print(theMinNum);

    }
}
