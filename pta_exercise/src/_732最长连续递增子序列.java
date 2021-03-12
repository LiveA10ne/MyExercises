import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _732最长连续递增子序列 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] intArray = new int [n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }
        function(intArray);
    }

    public static void function(int [] intArray){
        int index = 0;
        int theLongestLength = 1;
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] > intArray[i-1]){
                theLongestLength++;
                index = i;
                m.put(index,theLongestLength);
            }else {
                theLongestLength = 1;
                index = 0;
            }
        }
        index = 0;
        theLongestLength = 1;
        for (Map.Entry<Integer, Integer> entry :
                m.entrySet()) {
            if (entry.getValue() > theLongestLength){
                theLongestLength = entry.getValue();
                index = entry.getKey();
            }
        }


        for (int i = index - theLongestLength + 1; i < index + 1; i++) {
            if (i!= index)
                System.out.print(intArray[i] + " ");
            else
                System.out.print(intArray[i] );
        }
        
    }
}
