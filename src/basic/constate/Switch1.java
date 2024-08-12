package basic.constate;

import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("성별 입력을 입력하세요. (M/F)");
        String gender = sc.next();
        switch (gender) {

            case "M", "m", "ㅡ": // 14버젼
                System.out.println("남성입니다.");
                break;
            case "f": case "F", "ㄹ":
                System.out.println("여성입니다.");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }

        sc.close();
    }
}
