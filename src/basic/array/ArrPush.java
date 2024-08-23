package basic.array;

import java.util.Arrays;

public class ArrPush {
    public static void main(String[] args) {
        int[] numbers= {10,20,30,40};
        int newNumber = 50;
        int[] temp = new int[numbers.length + 1];
        for (int i = 0; i < numbers.length; i++) {
            temp[i] = numbers[i];
        }
        temp[temp.length-1] = newNumber;
        numbers = temp;
        temp = null;
        System.out.println(Arrays.toString(numbers));
    }
}
