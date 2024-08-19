package oop.static_.field;

public class Main {
    public static void main(String[] args) {
        Count c1 = new Count();
        Count c2 = new Count();
        c1.a += 5;
        c1.b += 5;
        System.out.println("c1.a = " + c1.a);
        System.out.println("c1.b = " + c1.b);
        System.out.println("c2 = " + c2.b);
        c2.b += 10;
        System.out.println("c1.b = " + c1.b);
        Count c3 = new Count();
        System.out.println("c3.b = " + c3.b);

    }
}
