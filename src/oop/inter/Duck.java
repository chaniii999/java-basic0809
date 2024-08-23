package oop.inter;

public class Duck implements Animal{
    @Override
    public void feed(String foodName) {
        System.out.println("오리가 " + foodName + "을 먹습니다.");
    }

    @Override
    public void sleep() {

    }

    public void swim() {
        System.out.println("오리가 헤엄을 칩니다.");
    }
}
