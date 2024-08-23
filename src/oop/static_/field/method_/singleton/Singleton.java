package oop.static_.field.method_.singleton;

public class Singleton {
    private static Singleton s = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return s;
    }

    ////////////////////////////////////////////////////////

    public void method1() {
        System.out.println("여러 군데에서 쓰이는 중요한 메서드!");
    }

    public void method2() {
        System.out.println("프로그램 내에서 꼭 한번 불러야 하는 귀한 메서드");
    }

}
