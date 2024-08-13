package basic;

public class MethodBasic {
    static int calcTotal(int end) {
        int total = 0;
        for (int i = 1; i <= end; i++) {
            total += i;
        }
        return total;
    }
}
