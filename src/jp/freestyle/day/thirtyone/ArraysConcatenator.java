package jp.freestyle.day.thirtyone;

import java.util.Arrays;

public class ArraysConcatenator {
    public static void main(String[] args) {
        int[] firstArray = { 1, 2, 3000, 2000, 1000 };
        int[] secondArray = { 103, 102, 101 };
        // firstArray と secondArray を
        // 連結させる処理をここに書く
        int arrayLength = firstArray.length + secondArray.length;
        int[] result = new int[arrayLength];

        for (int i = 0; i < firstArray.length; i++) {
            result[i] = firstArray[i];
        }
        for (int j = firstArray.length; j < firstArray.length + secondArray.length; j++) {
            result[j] = secondArray[j - firstArray.length];
        }
        System.out.println(Arrays.toString(result));
    }
}