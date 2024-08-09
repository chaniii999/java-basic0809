package basic.begin;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Java!~~!!");
        int age;

        age = 40;
        System.out.println("age = " + age);
        int score = 95;
        score = 90;
        System.out.println("score = " + score);

//        변수에는 다른 변수의 값도 저장이 가능합니다.~

        int myScore = score - 20;
        var it = myScore;
        System.out.println("myScore = " + myScore);
//        변수의 자료형에 맞지 않는 값은 저장이 불가능?
        String a = "a" + 64;
        String name = "길동이";
        int aa = '3' - 3;
        System.out.println("aa = " + aa);

    }
}
