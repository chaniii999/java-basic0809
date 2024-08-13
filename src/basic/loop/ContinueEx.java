package basic.loop;

public class ContinueEx {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) continue;
            System.out.println("i = " + i);
        }
        System.out.println("\n반복문 종료");

        System.out.println("------------------------------");
        int n = 0;
        while (n < 10) {
            n++;

            if (n == 5) continue;
            System.out.print(n + " ");
        }
    }
}
