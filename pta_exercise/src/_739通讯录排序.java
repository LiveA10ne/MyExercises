import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/2/22 16:06
 */
public class _739通讯录排序 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] addressBook = new String[n];
        for (int i = 0; i < n; i++) {
            addressBook[i] = scanner.nextLine();
        }

        quickSort(addressBook, 0, addressBook.length-1);

        for (String s :
                addressBook) {
            System.out.println(s);
        }
    }

    private static void quickSort(String[] addressBook, int s, int t){
        int i = s, j = t;
        String temp ;
        if (s < t){
            temp =addressBook[s];
            while (i!=j){
                while (j>i && Integer.valueOf(addressBook[j].split("\\s")[1]) >=Integer.valueOf(temp.split("\\s")[1]))
                    j--;
                addressBook[i] = addressBook[j];
                while (i<j && Integer.valueOf(addressBook[i].split("\\s")[1]) <=Integer.valueOf(temp.split("\\s")[1]))
                    i++;
                addressBook[j] = addressBook[i];
            }
            addressBook[i] = temp;
            quickSort(addressBook, s, i-1);
            quickSort(addressBook, i+1, t);
        }
    }

    public static void main(String[] args) {
        solution();
    }
}
