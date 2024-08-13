package basic.constate;

import java.util.Scanner;

public class WhileQuiz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.println("누적합계 구하기\n x 입력");
        x = sc.nextInt();
        System.out.println(" y 입력");
        y = sc.nextInt();

        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }
        int n = x;

        int ans = 0;

        while (n <= y) {
            ans += n;
            n++;
        }

        System.out.printf("%d 부터 %d 까지 누적합계 : %d",x,y,ans);
        sc.close();
    }
}
