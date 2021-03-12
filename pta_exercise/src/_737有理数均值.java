import java.util.Scanner;

public class _737有理数均值 {
    public static void main(String[] args) {
        f();
    }

    public static void f() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String string = scanner.nextLine();
        String[] rationalNumArray = string.trim().split("\\s");

        int maxComMultiple = 1;
        for (int i = 0; i < rationalNumArray.length-1; i++) {
            String[] rationalNum_1 = rationalNumArray[i].split("/");
            String[] rationalNum_2 = rationalNumArray[i + 1].split("/");
            maxComMultiple = comMultiple(maxComMultiple,comMultiple(Integer.parseInt(rationalNum_1[1]),Integer.parseInt(rationalNum_2[1])));
        }

        int sum = 0;
        for (String rational :
                rationalNumArray) {
            String[] split = rational.split("/");
            sum += maxComMultiple / Integer.parseInt(split[1]) * Integer.parseInt(split[0]);
        }

        int divisor = comDivisor(sum,maxComMultiple);
        int numerator = sum / divisor;
        int denominator = maxComMultiple / divisor;

        int avg_divisor = comDivisor(numerator,denominator*n);
        int avg_numerator = numerator / avg_divisor;
        int avg_denominator = denominator*n /avg_divisor;

        if (avg_denominator ==1)
            System.out.println(avg_numerator);
        else System.out.println(avg_numerator+"/"+avg_denominator);


    }

    public static int comMultiple(int a, int b){
        int product = a*b;
        while (a!=b){
            if (a > b)
                a -=b;
            else
                b -=a;
        }
        return product/a;
    }

    public static int comDivisor(int a, int b){
        while (a!=b){
            if (a > b)
                a -=b;
            else
                b -=a;
        }
        return a;
    }
}
