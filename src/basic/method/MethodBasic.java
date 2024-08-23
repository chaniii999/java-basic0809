package basic.method;

public class MethodBasic {
    static int calcTotal(int st, int end) {
        int total = 0;
        for (int i = st; i <= end; i++) {
            total += i;
        }
        System.out.println("total = " + total);
        return total;
    }

    public static void main(String[] args) {
        int result = calcTotal(15,20);
    }
}
