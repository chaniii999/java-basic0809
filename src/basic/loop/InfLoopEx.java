package basic.loop;

import java.util.Scanner;

public class InfLoopEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        while (true) {
            System.out.println("15 * 6 = ?");
            System.out.println("모르면 0을 입력하세요.");
            int answer = sc.nextInt();
            if (answer == 90) {
                System.out.println("정답");
                break;
            }
            else if (answer == 0) {
                System.out.println("정답은 90입니다.");
                break;
            }
            else {
                System.out.println("오답");
            }
        }

    }
}
