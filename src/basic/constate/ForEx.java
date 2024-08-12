package basic.constate;

import java.util.Scanner;

public class ForEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("팩토리얼 입력");
        int k = sc.nextInt();
        int ans = 1;
        for (int i = k; i >= 1; i--) {
            ans *= i;
        }
        System.out.println("ans = " + ans);
        sc.close();
    }
}
