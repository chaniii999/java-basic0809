package etc.io.inner;

public class Main {

    //내부 클래스
    //작업중인 클래스와 밀접한 연관이 있는 경우 클래스 내부에 새로운 클래스 선언.
    // 내부클래스에서는 private 가능, static 붙여야함 (아니면 작업중인 객체를 무조건 생성해야함)
    // 내부클래스의 static : 바깥 클래스 생성시마다 재생성 되는 것을 방지해줌.
    private static class SubCal implements Calculator {
        @Override
        public int operator(int m1, int m2) {
            return  m1 - m2;
        }
    }

    public static void main(String[] args) {
        Calculator cal;
        cal =new AddCal();
        int r1 = cal.operator(10,20);
        System.out.println("r1 = " + r1);
    }
}
