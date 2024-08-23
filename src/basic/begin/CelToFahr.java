package basic.begin;

import java.util.Scanner;

public class CelToFahr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("현재 섭씨온도(℃)를 입력하세요.");
        double st = sc.nextDouble();
        System.out.println("현재 섭씨 온도는 " + st + "℃ 이고");
        double far = (st * 9) /  5 + 32;
        System.out.printf("현재 화씨 온도는 %.1f℉ 입니다.",far);
    }
}
