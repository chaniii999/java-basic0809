package basic.constate;

import java.util.Scanner;

public class WhileQuiz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요.");
        int p = sc.nextInt();
        int k = 2;
        while (k <= Math.sqrt(p)) {
            if (p % k == 0)
            {
                System.out.println(p + "는 소수가 아닙니다.");
                return;
            }
            k++;
        }
        System.out.println(p + "는 소수입니다.");
        while (k <= Math.sqrt(p)) {
            if (p % k == 0)
            {
                System.out.println(p + "는 소수가 아닙니다.");
                return;
            }
            k++;
        }
        sc.close();
        System.out.println(p + "는 소수입니다.");
    }
}
