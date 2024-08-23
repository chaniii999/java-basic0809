package oop.static_.field.method_;

public class Count {
    public  int a;
    public  static  int b;

    /*
        # 인스턴스 메서드: 객체를 생성하여 주소값을 통해 접근한 후 호출하는 메서드
        인스턴스 메서드 안에서는 정적(static) 변수와
        인스턴스 변수를 모두 사용할 수 있습니다.
     */
    public int method1() {
        return this.a + Count.b;
    }

    public static int method2() {
        return Count.b;
    }
}
