package oop.basic;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 참조연산자로 객체에 접근할 수 있다.

        Pen redPen = new Pen("빨강",13000,15);
        redPen.write();
        redPen.priceInfo();
        System.out.println("redPen = " + redPen);
        ArrayList<Pen> pens = new ArrayList<>();
        pens.add(redPen);
    }
}
