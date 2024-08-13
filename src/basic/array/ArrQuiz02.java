package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrQuiz02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] kakao = {"무지","네오","어피치","춘식","라이언"};
        /*
         1. 삭제할 친구를 입력받아서 삭제를 진행해 주세요.

         2. 입력받은 이름이 없다면 없다고 얘기해 주세요.

         - 추가
         배열의 길이가 0이 될 때까지 삭제를 반복해 보세요.
         더 이상 지울 친구가 없다면 프로그램 종료.
         */
        while (kakao.length > 0) {
            System.out.println("삭제할 친구를 고르세요.");
            System.out.println(Arrays.toString(kakao));
            String tg = sc.next();
            String[] temp = new String[kakao.length-1];
            int tgIdx = 0;
            for (int i = 0; i < temp.length; i++) {
                if (tg.equals(kakao[tgIdx]))
                    tgIdx++;
                temp[i] = kakao[tgIdx];
                tgIdx++;
            }
            kakao = temp;
            temp = null;
        }
        sc.close();
        System.out.println("모두 삭제되었습니다.");
    }
}
