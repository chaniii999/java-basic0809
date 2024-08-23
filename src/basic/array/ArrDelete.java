package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10,20,30,40,50};
        System.out.println("pick index to delete : ");
        int tgIdx = sc.nextInt();

        int[] temp = new int[arr.length-1];

        int arrIdx = 0;
        for (int i = 0; i < temp.length ; i++) {
            if (arrIdx == tgIdx)
                arrIdx++;
            temp[i] = arr[arrIdx];
            arrIdx++;
        }

        arr = temp;
        temp = null;
        System.out.println(Arrays.toString(arr));

    }
}
