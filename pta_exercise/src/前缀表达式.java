import java.util.Scanner;
import java.util.Stack;

/**
 * @author Somnambulist
 * @date 2021/3/12 17:42
 */
public class 前缀表达式 {
    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        char[] exp = scanner.nextLine().replaceAll("\\s","").toCharArray();
        Stack<Integer> expStack = new Stack<>();
        int result = 0;
        for (int i = exp.length - 1; i >=0; i--) {
            if (isNum(exp[i])){
                expStack.push(Integer.parseInt(String.valueOf(exp[i])));
            }else {
                result = calculate(expStack.pop(),expStack.pop(),exp[i]);
                expStack.push(result);
            }
        }
        System.out.println(result);
    }

    private static boolean isNum(char c){
        return c  >'0' && c < '9';
    }

    private static int calculate(int num1, int num2, char op){
        int rel = 0;
         switch (op) {
            case '+' : rel = num1 + num2;break;
            case '-' : rel = num1 - num2;break;
            case '*' : rel = num1 * num2;break;
            case '/' : rel = num1 / num2;break;
        }
        return rel;
    }

    public static void main(String[] args) {
        solution();
    }
}
