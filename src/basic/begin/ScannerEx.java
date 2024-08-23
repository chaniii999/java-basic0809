package basic.begin;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // next() : 공백 제외 문자열
        // nextLine : 공백 포함
        // next + 기본타입 : 해당 타입 입력받음 ex) nextInt()
        System.out.println("이름을 입력하세요.");
        String name = sc.next();
        System.out.println("name = " + name);
        System.out.println("나이를 입력하세요.");
        int age = sc.nextInt();
        System.out.println("age = " + age);

        // 스캐너 객체를 반납
        sc.close();


    }
}
