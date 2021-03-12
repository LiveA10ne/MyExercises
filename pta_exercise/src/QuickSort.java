public class QuickSort {
    public static void main(String[] args) {
        int[] array = {6,8,7,9,0,1,3,2,4,5};
        quickSort(array,0, array.length-1);
//        for (int i :
//                array) {
//            System.out.print(i+" ");
//        }
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
            printArray(array);
            quickSort(array, s, i-1);
            quickSort(array,i+1, t);
        }
    }

    private static void printArray(int[] array){
        for (int i :
                array) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
