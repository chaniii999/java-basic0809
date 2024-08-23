package basic.constate;

import java.util.Scanner;

public class IfEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력하세요.");
        int score = sc.nextInt();
        System.out.println("score = " + score);
        if (score >= 70)
            System.out.println("시험에 합격했습니다.");
        else
            System.out.println("시험에 불합격했습니다.");

        sc.close();

    }
}
