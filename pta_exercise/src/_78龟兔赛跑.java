import java.util.Scanner;

/**
 * @author Somnambulist
 * @date 2021/2/21 16:39
 */
public class _78龟兔赛跑 {
    private static void f(){
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        if (time % 30 == 0 ){
            System.out.println("-_- "+time * 3);
            return;
        }

        int remain = time % 90;
        int commonTime = time - remain;
        int commonDistance = commonTime * 3;
        String winner;

        int tortoise = time * 3, rabbit = 0;
        if (remain<=10){
           rabbit = commonDistance + remain * 9;
        }else if (remain<=40){
            rabbit = commonDistance + 90;
        }else if (remain<=50){
            rabbit = commonDistance + 90 + (remain - 40) * 9;
        }else if (remain<=80){
            rabbit = commonDistance + 180;
        }else if (remain < 90){
            rabbit = commonDistance + 180 + (remain - 80) * 9;
        }

        if (tortoise > rabbit){
            System.out.println("@_@ "+tortoise);
        }else if (tortoise == rabbit){
            System.out.println("-_- "+tortoise);
        }else
            System.out.println("^_^ "+rabbit);

    }

    public static void main(String[] args) {
        f();
    }
}

/*
兔子 9m/min 乌龟 3m/min

        兔子  乌龟
10      90    30
30      90    90
40      90    120   90+9t = 120 + 3t ; t = 5
45      135   135
50      180   150
60      180   180
80      180   240
90      270   270

100     360   300
130     360   390   360 + 9t = 390 + 3t   t =5
135
140     450   420
170     450   510
180     540   540

 模90

 */
