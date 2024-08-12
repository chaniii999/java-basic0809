package basic.casting;

public class CastingEx3 {
    public static void main(String[] args) {
        char c = 'B';
        int i = 2;
        System.out.println(c + i); // 더 큰쪽의 타입으로 출력된다.

        int k = 10;
        double d = (double)k / 4; // 둘 중 하나만 형 변환하면 된다.
        System.out.println(d);

    }
}
