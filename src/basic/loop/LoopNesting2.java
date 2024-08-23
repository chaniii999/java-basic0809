package basic.loop;

public class LoopNesting2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5 ; i++) {
            for (int k = 4-i; k > 0; k--)
                System.out.print(" ");
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
