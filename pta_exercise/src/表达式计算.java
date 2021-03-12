import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author Somnambulist
 * @date 2021/3/8 19:31
 */
public class 表达式计算 {

    private static HashMap<Character, Integer> precede = new HashMap<>();

    private static void solution(){
        Scanner scanner = new Scanner(System.in);
        char[] exp = scanner.next().toCharArray();
        Stack<Character> op = new Stack<>();    //操作符栈
        StringBuilder postfixExp = new StringBuilder();
        precede.put('=',0);
        precede.put('(',1);
        precede.put('+',2);
        precede.put('-',2);
        precede.put('*',3);
        precede.put('/',3);
        precede.put(')',4);
        op.push('=');
        for (int i = 0; i < exp.length; i++) {
            while (!op.empty()){
                if (isOp(exp[i])){
                    if (exp[i] == ')'){
                        while (op.peek() != '('){
                            postfixExp.append(op.pop());
                        }
                        op.pop();
                    }
                    else if (opPre(exp[i],op.peek()) == 1){
                        op.push(exp[i]);
                    }else {
                        while (opPre(exp[i], op.peek()) == -1){
                            postfixExp.append(op.pop());
                        }
                    }
                }
                else {
                    postfixExp.append(exp[i]);
                }
            }
        }
        System.out.println(postfixExp);
    }

    //比较运算符优先级 op优先级大于top 返回1 否则返回-1
    private static int opPre(char op, char top){
        int preOfOp = 0, preOfTop = 0;
        for (Map.Entry<Character, Integer> entry :
                precede.entrySet()) {
            if (entry.getKey() == op){
                preOfOp = entry.getValue();
            }
            if (entry.getKey() == top){
                preOfTop = entry.getValue();
            }
        }
        if (preOfOp > preOfTop)
            return 1;
        else
            return -1;
    }

    //判断是否为运算符
    private static boolean isOp(char c){
        return c == '(' || c == '+' || c == '-' || c == '*' || c == '/' || c == ')';
    }

    public static void main(String[] args) {
        solution();
    }
}
