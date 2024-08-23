package basic.constate;

import java.util.Scanner;

public class IfQuiz1_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];

        for (int i = 0; i < 3; i++)
            arr[i] = sc.nextInt();

        int max = arr[0];

        int min = arr[0];

        if (arr[1] > max) max = arr[1];
        if (arr[2] > max) max = arr[2];

        if (arr[1] < min) min = arr[1];
        if (arr[2] < min) min = arr[2];

        int mid = arr[0] +arr[1] + arr[2] - max - min;

        System.out.println("max = " + max);
        System.out.println("mid = " + mid);
        System.out.println("min = " + min);



    }
}
