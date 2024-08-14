package oop.basic;


// 객체 설계용 클래스
public class Pen {
    private String color;
    private int price;
    private int size;

    public Pen (String color, int price, int size) {
        this.color = color;
        this.price = price;
        this.size = size;
    }

    void write() {
        System.out.println("color = " + color);
    }
    void priceInfo() {
        System.out.println(color + "색 펜의 가격은 " + price);
    }

}
