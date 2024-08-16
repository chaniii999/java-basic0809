package oop.modi.cls.pack1;


import java.util.Arrays;

public class C {
    static String[] arr = {"pp"};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arr));
        insert(0, "hi");
        System.out.println(Arrays.toString(arr));
        insert(2, "ppp");
        System.out.println(Arrays.toString(arr));
        insert(1, "kkk");
        System.out.println(Arrays.toString(arr));
        insert(0, "kkpk");
        System.out.println(Arrays.toString(arr));
        remove(3);
        System.out.println(Arrays.toString(arr));
        remove(0);
        System.out.println(Arrays.toString(arr));
    }

    static boolean isOutOfRange(int tgIdx) {
        if (tgIdx > arr.length || tgIdx < 0) {
            System.out.println("잘못된 tgIdx (범위벗어남)");
            return true;
        }
        return false;
    }

    static void modify(int tgIdx, String newFood) {
        if (isOutOfRange(tgIdx)) return;
        arr[tgIdx] = newFood;
    }

    static String[] copy(int size, int tgIdx, String newFood) {
        String[] temp = new String[arr.length+size];

        for (int i = 0; i < temp.length; i++) {
            if (tgIdx == i && newFood != "")
                temp[tgIdx] = newFood;
            else if (i > tgIdx)
                temp[i] = arr[i-size];
            else
                temp[i] = arr[i];
        }
        return temp;
    }


    static void insert(int tgIdx, String newFood) {
        if (isOutOfRange(tgIdx)) return;

        arr = copy(+1,tgIdx,newFood);
    }

    static void remove(int tgIdx) {
        if (isOutOfRange(tgIdx)) return;
        arr = copy(-1,tgIdx,"");
    }
}

