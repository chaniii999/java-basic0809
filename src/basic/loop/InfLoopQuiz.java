package basic.loop;

import java.util.Scanner;

public class InfLoopQuiz {
    public static void main(String[] args) {
        /*
         1. 2가지의 정수를 1~100사이의 난수를 발생시켜서
          지속적으로 문제를 출제한 후 정답을 입력받으세요.
          사용자가 0을 입력하면 반복문을 탈출시키세요.

         2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.
         */
        Scanner sc = new Scanner(System.in);
        int cor = 0;
        int wro = 0;
        while (true) {
            int rn1 = (int)(Math.random() * 99) + 1;
            int rn2 = (int)(Math.random() * 99) + 1;
            System.out.printf("%d + %d = ?",rn1,rn2);
            int ans = sc.nextInt();
            if (ans == rn1 + rn2) {
                System.out.println("정답");
                cor++;
            }
            else if (ans == 0) {
                System.out.printf("정답 : %d, 오답 : %d",cor,wro);
                break;
            }
            else {
                System.out.println("오답");
                wro++;
            }
            
        }
    }
}
