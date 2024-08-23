package basic.loop;

import java.util.Scanner;

public class LoopNestingQuiz {
    public static void main(String[] args) {
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        double sqrtN = Math.sqrt(num);
        if (sqrtN == (int)sqrtN)
            cnt++;

        for (int i = 1; i < sqrtN ; i++) {
            if (num % i == 0) {
                cnt += 2;
                System.out.println(i);
            }
        }
        System.out.println("cnt = " + cnt);
    }
}
