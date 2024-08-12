package basic.constate;

public class WhileEx2   {
    public static void main(String[] args) {

        //48 ~ 150사이의 정수 중 8의 배수만 가로로 출력해 보세요.
        //(48부터 숫자를 하나씩 올려가면서 8의 배수 판별을 반복하면 되겠죠?)

//        int i = 48;
//        while (i <= 150) {
//            if (i % 8 == 0)
//                System.out.print(i + " ");
//            i++;
//        }

        //1 ~ 100까지의 정수 중 4의 배수이면서
        //8의 배수는 아닌 수를 가로로 출력해 보세요.

//        int k = 1;
//        while (k <= 100) {
//            if (k%4 == 0 && k%8 != 0)
//                System.out.print(k + " ");
//            k++;
//        }


        //1 ~ 30000까지의 정수 중 258의 배수의 개수를 출력.
//        int NUM = 258;
//        int p = NUM;
//        int cnt = 0;
//        while (p <= 30000) {
//            cnt++;
//            p += NUM;
//        }
//        System.out.println("num = " + cnt);
        //1000의 약수의 개수를 구하세요.
        //1부터 1000까지 하나씩 올려가면서 1000이랑 나눠보세요.
        //그랬을 때 나누어 떨어지는 애가 약수입니다.
        int z = 1;
        int n = 0;
        while (z <= 1000) {
            if (1000 % z == 0) n++;
            z++;
        }
        System.out.println("n = " + n);
    }
}
