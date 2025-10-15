package main.patterns.array_hashing._1089_Duplicate_Zeros;

import java.util.Arrays;

public class Main {
    public static void duplicateZeros(int[] arr) {
        int[] copyArr = arr.clone();
        int length = arr.length;
        int index = 0;

        for (int i = 0; i < length && index < length; i++) {
            if (copyArr[i] == 0) {
                arr[index++] = copyArr[i];
                if (index < length) {
                    arr[index++] = 0;
                }
            } else {
                arr[index++] = copyArr[i];
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1,0,2,3,0,4,5,0 };
        int[] arr2 = {1,2,3};
        duplicateZeros(arr);
        duplicateZeros(arr2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
}
