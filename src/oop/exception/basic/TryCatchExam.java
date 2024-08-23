package oop.exception.basic;

import java.util.IllegalFormatCodePointException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        try {
            System.out.printf("%d / %d = %d\n", i, j, i / j);
            System.out.println("프로그램 정상 종료");
        } catch (Exception e) {
            throw new RuntimeException("0으로 나눔");
        }

    }
}
