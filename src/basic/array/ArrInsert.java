package basic.array;


import java.util.Arrays;

public class ArrInsert {
    public static void main(String[] args) {
        int[] arr = {10, 50, 90, 100, 150};
        int newNum = 66;
        int targetIdx = 2;
        int[] temp = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        for (int i = arr.length; i > targetIdx; i--) {
            temp[i] = temp[i - 1];
        }
        temp[targetIdx] = newNum;
        arr = temp;
        temp = null;
        System.out.println(Arrays.toString(arr));

    }
}
