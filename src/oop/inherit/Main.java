package oop.inherit;

public class Main {
    public static void main(String[] args) {
        Warrior w1 = new Warrior(100);
        w1.nickName = "타락파워전사";
        w1.showStatus();

        System.out.println("--------------------------------");

        Mage m1 = new Mage("법사짱짱맨");
        m1.showStatus();
    }
}
