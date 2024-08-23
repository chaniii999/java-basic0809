package basic.constate;


import java.util.Scanner;

public class IfQuiz {
    public static void main(String[] args) {
        /*
        - 정수 3개를 입력 받습니다. (변수 하나씩 선언해서 따로따로 받으세요.)
        - 가장 큰 값, 가장 작은 값, 중간값을 구해서 출력해 보세요.
        # max, mid, min이라는 변수를 미리 선언하셔서
         판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
         마지막에 한번에 출력하시면 되겠습니다.
        */
        int arr[] = new int[3];
        Scanner sc = new Scanner(System.in);
        int max = -1;
        int mid = 0;
        int min = 2147483647;
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        for (int i = 0; i < 3; i++) {
            if (arr[i] > mid && arr[i] < max)
                mid = arr[i];
        }
        for (int i = 0; i < 3; i++) {
            if (arr[i] < min)
                min = arr[i];
        }

        System.out.println("max = " + max);
        System.out.println("mid = " + mid);
        System.out.println("min = " + min);
    }

}
