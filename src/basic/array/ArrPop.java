package basic.array;

import java.util.Arrays;

public class ArrPop {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int popNum = arr[arr.length-1];
        int[] temp = new int[3];
        for (int i = 0; i < temp.length;i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        temp = null;
        System.out.println(Arrays.toString(arr) + " pop : " + popNum);
    }
}
