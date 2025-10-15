package main.patterns.array_hashing._3005_Count_Elements_With_Maximum_Frequency;

import java.util.*;

public class Main {
    public static int maxFrequencyElements(int[] nums) {
        int[] frequency = new int[101];
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int num : nums) {
            frequency[num]++;
            if (max == frequency[num]) {
                count++;
            } else if (max < frequency[num]) {
                count = 1;
                max = frequency[num];
            }
        }

        System.out.println(Arrays.toString(frequency));

        return max * count;
    }
    public static void main(String[] args) {
        System.out.println(maxFrequencyElements(new int[]{1,2,2,3,1,4}));
        System.out.println(maxFrequencyElements(new int[]{1,2,3,4,5}));
        System.out.println(maxFrequencyElements(new int[]{1,2,3,4,5,5}));
    }
}
