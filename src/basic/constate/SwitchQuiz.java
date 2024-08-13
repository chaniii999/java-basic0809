package basic.constate;

import java.util.Scanner;

public class SwitchQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;

        int a,b;
        String c;
        System.out.println("첫번째 피연산자 입력");
        a = sc.nextInt();
        System.out.println("연산자 입력");
        c = sc.next();
        System.out.println("두번째 피연산자 입력");
        b = sc.nextInt();

        int ans = 0;
        switch (c) {
            case "+":
                ans = a + b;
                break;
            case "-":
                ans = a - b;
                break;
            case "/":
                if (b == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    flag = true;
                    break;
                }
                ans = a/b;
                break;
            case "*":
                ans = a*b;
                break;
            default:
                System.out.println("잘못된 입력.");
                break;
        }
        if (!flag)
            System.out.printf("%d %s %d = %d\n",a,c,b,ans);
        sc.close();
    }
}
