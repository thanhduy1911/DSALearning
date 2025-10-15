package main.patterns.array_hashing._941_Valid_Mountain_Array;

public class Main {
    private static boolean validMountainArray(int[] arr) {
        boolean isIncreasing = true;
        if (arr.length < 3 || arr[0] > arr[1]) return false;

        for (int i = 0; (i + 1) < arr.length; i++) {
            int j = i + 1;
            if (arr[i] > arr[j]) { // day giam
                if (isIncreasing) {
                    if (i == 0) {
                        return false;
                    }
                    isIncreasing = false;
                }
            } else if (arr[i] < arr[j]) { // day tang
                if (!isIncreasing) {
                    return false;
                }
            } else { // arr[i] == arr[j]
                return false;
            }

        }
        return !isIncreasing;
    }
    public static void main(String[] args) {
        System.out.println(validMountainArray(new int[]{0,2,3,4,5,2,1,0}));
    }
}
