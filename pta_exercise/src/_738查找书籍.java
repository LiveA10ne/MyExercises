import java.util.*;

public class _738查找书籍 {
    public static void main(String[] args) {
        f();
    }

    public static void f() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        HashMap<String, Float> booksContents = new HashMap<>();
        for (int i = 0; i < n; i++) {
            scanner.nextLine();
            booksContents.put(scanner.nextLine(), scanner.nextFloat());
        }

        ArrayList<Map.Entry<String, Float>> list = new ArrayList<>(booksContents.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Float>>() {
            @Override
            public int compare(Map.Entry<String, Float> o1, Map.Entry<String, Float> o2) {
                return o2.getValue().compareTo(o2.getValue());
            }
        });

        Map.Entry<String, Float> max = list.get(list.size() - 1);
        Map.Entry<String, Float> min = list.get(0);

        System.out.printf("%.2f, %s", max.getValue(), max.getKey());
        System.out.println();
        System.out.printf("%.2f, %s", min.getValue(), min.getKey());

    }
}
